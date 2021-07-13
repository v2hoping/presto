package com.facebook.presto.sql.antlr;

import com.facebook.presto.sql.parser.*;
import com.facebook.presto.sql.tree.Statement;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.testng.annotations.Test;

import static com.facebook.presto.sql.parser.ParsingOptions.DecimalLiteralTreatment.AS_DOUBLE;

/**
 * Created by houping wang on 2021/7/9
 *
 * @author houping wang
 */
public class AntlrTest {

    @Test
    public void testSql() {
        //词法分析
        CharStream charStream = CharStreams.fromString("SELECT CUSTKEY FROM ORDERS WHERE TOTALPRICE > 100.0");
        SqlBaseLexer sqlBaseLexer = new SqlBaseLexer(charStream);
        //语法分析
        CommonTokenStream tokens = new CommonTokenStream(sqlBaseLexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        SqlBaseParser.SingleStatementContext tree = parser.singleStatement();

//        boolean bl = tree instanceof ParseTree;
//        ParseTree child = tree.getChild(1);
        //遍历解析
//        SqlBaseVisitor visitor = new SqlBaseBaseVisitor();
        //循环遍历数
//        tree instanceof
//        tree.getChild()
//        tree.getChildCount();
        //深度优先遍历树
        recursion(tree);
    }

    public static void recursion(ParseTree parseTree) {
        if(parseTree instanceof TerminalNodeImpl) {
            System.out.println(parseTree.getText());
        }else{
            System.out.println(parseTree.getClass());
        }

        int childCount = parseTree.getChildCount();
        if(childCount == 0) {
            return;
        }
        for(int i = 0; i < childCount; i ++) {
            ParseTree node = parseTree.getChild(i);
            recursion(node);
        }
    }

    @Test
    public void prestoTest() {
        SqlParser parser = new SqlParser();
        Statement statement = parser.createStatement("SELECT CUSTKEY FROM ORDERS WHERE TOTALPRICE > 100.0", ParsingOptions.builder().setDecimalLiteralTreatment(AS_DOUBLE).build());
    }
}
