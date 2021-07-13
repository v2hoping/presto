// Generated from /Users/wanghouping/development/Github/presto-master/presto-parser/src/main/antlr4/com/facebook/presto/sql/parser/SqlBase.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ADD=10, ADMIN=11, ALL=12, ALTER=13, ANALYZE=14, AND=15, ANY=16, ARRAY=17, 
		AS=18, ASC=19, AT=20, BERNOULLI=21, BETWEEN=22, BY=23, CALL=24, CALLED=25, 
		CASCADE=26, CASE=27, CAST=28, CATALOGS=29, COLUMN=30, COLUMNS=31, COMMENT=32, 
		COMMIT=33, COMMITTED=34, CONSTRAINT=35, CREATE=36, CROSS=37, CUBE=38, 
		CURRENT=39, CURRENT_DATE=40, CURRENT_ROLE=41, CURRENT_TIME=42, CURRENT_TIMESTAMP=43, 
		CURRENT_USER=44, DATA=45, DATE=46, DAY=47, DEALLOCATE=48, DEFINER=49, 
		DELETE=50, DESC=51, DESCRIBE=52, DETERMINISTIC=53, DISTINCT=54, DISTRIBUTED=55, 
		DROP=56, ELSE=57, END=58, ESCAPE=59, EXCEPT=60, EXCLUDING=61, EXECUTE=62, 
		EXISTS=63, EXPLAIN=64, EXTRACT=65, EXTERNAL=66, FALSE=67, FILTER=68, FIRST=69, 
		FOLLOWING=70, FOR=71, FORMAT=72, FROM=73, FULL=74, FUNCTION=75, FUNCTIONS=76, 
		GRANT=77, GRANTED=78, GRANTS=79, GRAPHVIZ=80, GROUP=81, GROUPING=82, HAVING=83, 
		HOUR=84, IF=85, IGNORE=86, IN=87, INCLUDING=88, INNER=89, INPUT=90, INSERT=91, 
		INTERSECT=92, INTERVAL=93, INTO=94, INVOKER=95, IO=96, IS=97, ISOLATION=98, 
		JSON=99, JOIN=100, LANGUAGE=101, LAST=102, LATERAL=103, LEFT=104, LEVEL=105, 
		LIKE=106, LIMIT=107, LOCALTIME=108, LOCALTIMESTAMP=109, LOGICAL=110, MAP=111, 
		MATERIALIZED=112, MINUTE=113, MONTH=114, NAME=115, NATURAL=116, NFC=117, 
		NFD=118, NFKC=119, NFKD=120, NO=121, NONE=122, NORMALIZE=123, NOT=124, 
		NULL=125, NULLIF=126, NULLS=127, ON=128, ONLY=129, OPTION=130, OR=131, 
		ORDER=132, ORDINALITY=133, OUTER=134, OUTPUT=135, OVER=136, PARTITION=137, 
		PARTITIONS=138, POSITION=139, PRECEDING=140, PREPARE=141, PRIVILEGES=142, 
		PROPERTIES=143, RANGE=144, READ=145, RECURSIVE=146, REFRESH=147, RENAME=148, 
		REPEATABLE=149, REPLACE=150, RESET=151, RESPECT=152, RESTRICT=153, RETURN=154, 
		RETURNS=155, REVOKE=156, RIGHT=157, ROLE=158, ROLES=159, ROLLBACK=160, 
		ROLLUP=161, ROW=162, ROWS=163, SCHEMA=164, SCHEMAS=165, SECOND=166, SECURITY=167, 
		SELECT=168, SERIALIZABLE=169, SESSION=170, SET=171, SETS=172, SHOW=173, 
		SOME=174, SQL=175, START=176, STATS=177, SUBSTRING=178, SYSTEM=179, TABLE=180, 
		TABLES=181, TABLESAMPLE=182, TEMPORARY=183, TEXT=184, THEN=185, TIME=186, 
		TIMESTAMP=187, TO=188, TRANSACTION=189, TRUE=190, TRY_CAST=191, TYPE=192, 
		UESCAPE=193, UNBOUNDED=194, UNCOMMITTED=195, UNION=196, UNNEST=197, USE=198, 
		USER=199, USING=200, VALIDATE=201, VALUES=202, VERBOSE=203, VIEW=204, 
		WHEN=205, WHERE=206, WITH=207, WORK=208, WRITE=209, YEAR=210, ZONE=211, 
		EQ=212, NEQ=213, LT=214, LTE=215, GT=216, GTE=217, PLUS=218, MINUS=219, 
		ASTERISK=220, SLASH=221, PERCENT=222, CONCAT=223, STRING=224, UNICODE_STRING=225, 
		BINARY_LITERAL=226, INTEGER_VALUE=227, DECIMAL_VALUE=228, DOUBLE_VALUE=229, 
		IDENTIFIER=230, DIGIT_IDENTIFIER=231, QUOTED_IDENTIFIER=232, BACKQUOTED_IDENTIFIER=233, 
		TIME_WITH_TIME_ZONE=234, TIMESTAMP_WITH_TIME_ZONE=235, DOUBLE_PRECISION=236, 
		SIMPLE_COMMENT=237, BRACKETED_COMMENT=238, WS=239, UNRECOGNIZED=240, DELIMITER=241;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standaloneRoutineBody = 2, 
		RULE_statement = 3, RULE_query = 4, RULE_with = 5, RULE_tableElement = 6, 
		RULE_columnDefinition = 7, RULE_likeClause = 8, RULE_properties = 9, RULE_property = 10, 
		RULE_sqlParameterDeclaration = 11, RULE_routineCharacteristics = 12, RULE_routineCharacteristic = 13, 
		RULE_alterRoutineCharacteristics = 14, RULE_alterRoutineCharacteristic = 15, 
		RULE_routineBody = 16, RULE_returnStatement = 17, RULE_externalBodyReference = 18, 
		RULE_language = 19, RULE_determinism = 20, RULE_nullCallClause = 21, RULE_externalRoutineName = 22, 
		RULE_queryNoWith = 23, RULE_queryTerm = 24, RULE_queryPrimary = 25, RULE_sortItem = 26, 
		RULE_querySpecification = 27, RULE_groupBy = 28, RULE_groupingElement = 29, 
		RULE_groupingSet = 30, RULE_namedQuery = 31, RULE_setQuantifier = 32, 
		RULE_selectItem = 33, RULE_relation = 34, RULE_joinType = 35, RULE_joinCriteria = 36, 
		RULE_sampledRelation = 37, RULE_sampleType = 38, RULE_aliasedRelation = 39, 
		RULE_columnAliases = 40, RULE_relationPrimary = 41, RULE_expression = 42, 
		RULE_booleanExpression = 43, RULE_predicate = 44, RULE_valueExpression = 45, 
		RULE_primaryExpression = 46, RULE_string = 47, RULE_nullTreatment = 48, 
		RULE_timeZoneSpecifier = 49, RULE_comparisonOperator = 50, RULE_comparisonQuantifier = 51, 
		RULE_booleanValue = 52, RULE_interval = 53, RULE_intervalField = 54, RULE_normalForm = 55, 
		RULE_types = 56, RULE_type = 57, RULE_typeParameter = 58, RULE_baseType = 59, 
		RULE_whenClause = 60, RULE_filter = 61, RULE_over = 62, RULE_windowFrame = 63, 
		RULE_frameBound = 64, RULE_explainOption = 65, RULE_transactionMode = 66, 
		RULE_levelOfIsolation = 67, RULE_callArgument = 68, RULE_privilege = 69, 
		RULE_qualifiedName = 70, RULE_grantor = 71, RULE_principal = 72, RULE_roles = 73, 
		RULE_identifier = 74, RULE_number = 75, RULE_nonReserved = 76;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "standaloneExpression", "standaloneRoutineBody", "statement", 
			"query", "with", "tableElement", "columnDefinition", "likeClause", "properties", 
			"property", "sqlParameterDeclaration", "routineCharacteristics", "routineCharacteristic", 
			"alterRoutineCharacteristics", "alterRoutineCharacteristic", "routineBody", 
			"returnStatement", "externalBodyReference", "language", "determinism", 
			"nullCallClause", "externalRoutineName", "queryNoWith", "queryTerm", 
			"queryPrimary", "sortItem", "querySpecification", "groupBy", "groupingElement", 
			"groupingSet", "namedQuery", "setQuantifier", "selectItem", "relation", 
			"joinType", "joinCriteria", "sampledRelation", "sampleType", "aliasedRelation", 
			"columnAliases", "relationPrimary", "expression", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "string", "nullTreatment", 
			"timeZoneSpecifier", "comparisonOperator", "comparisonQuantifier", "booleanValue", 
			"interval", "intervalField", "normalForm", "types", "type", "typeParameter", 
			"baseType", "whenClause", "filter", "over", "windowFrame", "frameBound", 
			"explainOption", "transactionMode", "levelOfIsolation", "callArgument", 
			"privilege", "qualifiedName", "grantor", "principal", "roles", "identifier", 
			"number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'?'", "'->'", "'['", "']'", "'=>'", 
			"'ADD'", "'ADMIN'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", 
			"'ARRAY'", "'AS'", "'ASC'", "'AT'", "'BERNOULLI'", "'BETWEEN'", "'BY'", 
			"'CALL'", "'CALLED'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", 
			"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_ROLE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", 
			"'DATE'", "'DAY'", "'DEALLOCATE'", "'DEFINER'", "'DELETE'", "'DESC'", 
			"'DESCRIBE'", "'DETERMINISTIC'", "'DISTINCT'", "'DISTRIBUTED'", "'DROP'", 
			"'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", 
			"'EXISTS'", "'EXPLAIN'", "'EXTRACT'", "'EXTERNAL'", "'FALSE'", "'FILTER'", 
			"'FIRST'", "'FOLLOWING'", "'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTION'", 
			"'FUNCTIONS'", "'GRANT'", "'GRANTED'", "'GRANTS'", "'GRAPHVIZ'", "'GROUP'", 
			"'GROUPING'", "'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", 
			"'INNER'", "'INPUT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", 
			"'INVOKER'", "'IO'", "'IS'", "'ISOLATION'", "'JSON'", "'JOIN'", "'LANGUAGE'", 
			"'LAST'", "'LATERAL'", "'LEFT'", "'LEVEL'", "'LIKE'", "'LIMIT'", "'LOCALTIME'", 
			"'LOCALTIMESTAMP'", "'LOGICAL'", "'MAP'", "'MATERIALIZED'", "'MINUTE'", 
			"'MONTH'", "'NAME'", "'NATURAL'", "'NFC'", "'NFD'", "'NFKC'", "'NFKD'", 
			"'NO'", "'NONE'", "'NORMALIZE'", "'NOT'", "'NULL'", "'NULLIF'", "'NULLS'", 
			"'ON'", "'ONLY'", "'OPTION'", "'OR'", "'ORDER'", "'ORDINALITY'", "'OUTER'", 
			"'OUTPUT'", "'OVER'", "'PARTITION'", "'PARTITIONS'", "'POSITION'", "'PRECEDING'", 
			"'PREPARE'", "'PRIVILEGES'", "'PROPERTIES'", "'RANGE'", "'READ'", "'RECURSIVE'", 
			"'REFRESH'", "'RENAME'", "'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", 
			"'RESTRICT'", "'RETURN'", "'RETURNS'", "'REVOKE'", "'RIGHT'", "'ROLE'", 
			"'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", "'SCHEMAS'", 
			"'SECOND'", "'SECURITY'", "'SELECT'", "'SERIALIZABLE'", "'SESSION'", 
			"'SET'", "'SETS'", "'SHOW'", "'SOME'", "'SQL'", "'START'", "'STATS'", 
			"'SUBSTRING'", "'SYSTEM'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TEMPORARY'", 
			"'TEXT'", "'THEN'", "'TIME'", "'TIMESTAMP'", "'TO'", "'TRANSACTION'", 
			"'TRUE'", "'TRY_CAST'", "'TYPE'", "'UESCAPE'", "'UNBOUNDED'", "'UNCOMMITTED'", 
			"'UNION'", "'UNNEST'", "'USE'", "'USER'", "'USING'", "'VALIDATE'", "'VALUES'", 
			"'VERBOSE'", "'VIEW'", "'WHEN'", "'WHERE'", "'WITH'", "'WORK'", "'WRITE'", 
			"'YEAR'", "'ZONE'", "'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ADD", "ADMIN", 
			"ALL", "ALTER", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", 
			"BERNOULLI", "BETWEEN", "BY", "CALL", "CALLED", "CASCADE", "CASE", "CAST", 
			"CATALOGS", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", 
			"CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_ROLE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATE", 
			"DAY", "DEALLOCATE", "DEFINER", "DELETE", "DESC", "DESCRIBE", "DETERMINISTIC", 
			"DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END", "ESCAPE", "EXCEPT", 
			"EXCLUDING", "EXECUTE", "EXISTS", "EXPLAIN", "EXTRACT", "EXTERNAL", "FALSE", 
			"FILTER", "FIRST", "FOLLOWING", "FOR", "FORMAT", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GRANT", "GRANTED", "GRANTS", "GRAPHVIZ", "GROUP", "GROUPING", 
			"HAVING", "HOUR", "IF", "IGNORE", "IN", "INCLUDING", "INNER", "INPUT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "INVOKER", "IO", "IS", "ISOLATION", 
			"JSON", "JOIN", "LANGUAGE", "LAST", "LATERAL", "LEFT", "LEVEL", "LIKE", 
			"LIMIT", "LOCALTIME", "LOCALTIMESTAMP", "LOGICAL", "MAP", "MATERIALIZED", 
			"MINUTE", "MONTH", "NAME", "NATURAL", "NFC", "NFD", "NFKC", "NFKD", "NO", 
			"NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", "NULLS", "ON", "ONLY", 
			"OPTION", "OR", "ORDER", "ORDINALITY", "OUTER", "OUTPUT", "OVER", "PARTITION", 
			"PARTITIONS", "POSITION", "PRECEDING", "PREPARE", "PRIVILEGES", "PROPERTIES", 
			"RANGE", "READ", "RECURSIVE", "REFRESH", "RENAME", "REPEATABLE", "REPLACE", 
			"RESET", "RESPECT", "RESTRICT", "RETURN", "RETURNS", "REVOKE", "RIGHT", 
			"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SCHEMAS", 
			"SECOND", "SECURITY", "SELECT", "SERIALIZABLE", "SESSION", "SET", "SETS", 
			"SHOW", "SOME", "SQL", "START", "STATS", "SUBSTRING", "SYSTEM", "TABLE", 
			"TABLES", "TABLESAMPLE", "TEMPORARY", "TEXT", "THEN", "TIME", "TIMESTAMP", 
			"TO", "TRANSACTION", "TRUE", "TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", 
			"UNCOMMITTED", "UNION", "UNNEST", "USE", "USER", "USING", "VALIDATE", 
			"VALUES", "VERBOSE", "VIEW", "WHEN", "WHERE", "WITH", "WORK", "WRITE", 
			"YEAR", "ZONE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "CONCAT", "STRING", "UNICODE_STRING", 
			"BINARY_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", 
			"DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE", 
			"TIMESTAMP_WITH_TIME_ZONE", "DOUBLE_PRECISION", "SIMPLE_COMMENT", "BRACKETED_COMMENT", 
			"WS", "UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			statement();
			setState(155);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expression();
			setState(158);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneRoutineBodyContext extends ParserRuleContext {
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneRoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneRoutineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneRoutineBodyContext standaloneRoutineBody() throws RecognitionException {
		StandaloneRoutineBodyContext _localctx = new StandaloneRoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standaloneRoutineBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			routineBody();
			setState(161);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropMaterializedViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateFunctionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ShowCreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(SqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(SqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(SqlBaseParser.EXISTS, i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(SqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(SqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(SqlBaseParser.EXISTS, i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevokeRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevokeRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevokeRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoleGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoleGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoleGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public List<TerminalNode> IF() { return getTokens(SqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(SqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(SqlBaseParser.EXISTS, i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public QualifiedNameContext functionName;
		public TypeContext returnType;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public RoutineCharacteristicsContext routineCharacteristics() {
			return getRuleContext(RoutineCharacteristicsContext.class,0);
		}
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public List<SqlParameterDeclarationContext> sqlParameterDeclaration() {
			return getRuleContexts(SqlParameterDeclarationContext.class);
		}
		public SqlParameterDeclarationContext sqlParameterDeclaration(int i) {
			return getRuleContext(SqlParameterDeclarationContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterFunctionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AlterRoutineCharacteristicsContext alterRoutineCharacteristics() {
			return getRuleContext(AlterRoutineCharacteristicsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public AlterFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode SECURITY() { return getToken(SqlBaseParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(SqlBaseParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(SqlBaseParser.INVOKER, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrantRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrantRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrantRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshMaterializedViewContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public RefreshMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateMaterializedViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(USE);
				setState(165);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(USE);
				setState(167);
				((UseContext)_localctx).catalog = identifier();
				setState(168);
				match(T__0);
				setState(169);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(CREATE);
				setState(172);
				match(SCHEMA);
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(173);
					match(IF);
					setState(174);
					match(NOT);
					setState(175);
					match(EXISTS);
					}
					break;
				}
				setState(178);
				qualifiedName();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(179);
					match(WITH);
					setState(180);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(DROP);
				setState(184);
				match(SCHEMA);
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(185);
					match(IF);
					setState(186);
					match(EXISTS);
					}
					break;
				}
				setState(189);
				qualifiedName();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(190);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				match(ALTER);
				setState(194);
				match(SCHEMA);
				setState(195);
				qualifiedName();
				setState(196);
				match(RENAME);
				setState(197);
				match(TO);
				setState(198);
				identifier();
				}
				break;
			case 7:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(CREATE);
				setState(201);
				match(TABLE);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(202);
					match(IF);
					setState(203);
					match(NOT);
					setState(204);
					match(EXISTS);
					}
					break;
				}
				setState(207);
				qualifiedName();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(208);
					columnAliases();
					}
				}

				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(211);
					match(COMMENT);
					setState(212);
					string();
					}
				}

				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(215);
					match(WITH);
					setState(216);
					properties();
					}
				}

				setState(219);
				match(AS);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(220);
					query();
					}
					break;
				case 2:
					{
					setState(221);
					match(T__1);
					setState(222);
					query();
					setState(223);
					match(T__2);
					}
					break;
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(227);
					match(WITH);
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(228);
						match(NO);
						}
					}

					setState(231);
					match(DATA);
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				match(CREATE);
				setState(235);
				match(TABLE);
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(236);
					match(IF);
					setState(237);
					match(NOT);
					setState(238);
					match(EXISTS);
					}
					break;
				}
				setState(241);
				qualifiedName();
				setState(242);
				match(T__1);
				setState(243);
				tableElement();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(244);
					match(T__3);
					setState(245);
					tableElement();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(T__2);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(252);
					match(COMMENT);
					setState(253);
					string();
					}
				}

				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(256);
					match(WITH);
					setState(257);
					properties();
					}
				}

				}
				break;
			case 9:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				match(DROP);
				setState(261);
				match(TABLE);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(262);
					match(IF);
					setState(263);
					match(EXISTS);
					}
					break;
				}
				setState(266);
				qualifiedName();
				}
				break;
			case 10:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(267);
				match(INSERT);
				setState(268);
				match(INTO);
				setState(269);
				qualifiedName();
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(270);
					columnAliases();
					}
					break;
				}
				setState(273);
				query();
				}
				break;
			case 11:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(275);
				match(DELETE);
				setState(276);
				match(FROM);
				setState(277);
				qualifiedName();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(278);
					match(WHERE);
					setState(279);
					booleanExpression(0);
					}
				}

				}
				break;
			case 12:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(282);
				match(ALTER);
				setState(283);
				match(TABLE);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(284);
					match(IF);
					setState(285);
					match(EXISTS);
					}
					break;
				}
				setState(288);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(289);
				match(RENAME);
				setState(290);
				match(TO);
				setState(291);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 13:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(293);
				match(ALTER);
				setState(294);
				match(TABLE);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(295);
					match(IF);
					setState(296);
					match(EXISTS);
					}
					break;
				}
				setState(299);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(300);
				match(RENAME);
				setState(301);
				match(COLUMN);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(302);
					match(IF);
					setState(303);
					match(EXISTS);
					}
					break;
				}
				setState(306);
				((RenameColumnContext)_localctx).from = identifier();
				setState(307);
				match(TO);
				setState(308);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 14:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(310);
				match(ALTER);
				setState(311);
				match(TABLE);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(312);
					match(IF);
					setState(313);
					match(EXISTS);
					}
					break;
				}
				setState(316);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(317);
				match(DROP);
				setState(318);
				match(COLUMN);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(319);
					match(IF);
					setState(320);
					match(EXISTS);
					}
					break;
				}
				setState(323);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 15:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(325);
				match(ALTER);
				setState(326);
				match(TABLE);
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(327);
					match(IF);
					setState(328);
					match(EXISTS);
					}
					break;
				}
				setState(331);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(332);
				match(ADD);
				setState(333);
				match(COLUMN);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(334);
					match(IF);
					setState(335);
					match(NOT);
					setState(336);
					match(EXISTS);
					}
					break;
				}
				setState(339);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 16:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(341);
				match(ANALYZE);
				setState(342);
				qualifiedName();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(343);
					match(WITH);
					setState(344);
					properties();
					}
				}

				}
				break;
			case 17:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(347);
				match(CREATE);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(348);
					match(OR);
					setState(349);
					match(REPLACE);
					}
				}

				setState(352);
				match(VIEW);
				setState(353);
				qualifiedName();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECURITY) {
					{
					setState(354);
					match(SECURITY);
					setState(355);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(358);
				match(AS);
				setState(359);
				query();
				}
				break;
			case 18:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(361);
				match(DROP);
				setState(362);
				match(VIEW);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(363);
					match(IF);
					setState(364);
					match(EXISTS);
					}
					break;
				}
				setState(367);
				qualifiedName();
				}
				break;
			case 19:
				_localctx = new CreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(368);
				match(CREATE);
				setState(369);
				match(MATERIALIZED);
				setState(370);
				match(VIEW);
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(371);
					match(IF);
					setState(372);
					match(NOT);
					setState(373);
					match(EXISTS);
					}
					break;
				}
				setState(376);
				qualifiedName();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(377);
					match(COMMENT);
					setState(378);
					string();
					}
				}

				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(381);
					match(WITH);
					setState(382);
					properties();
					}
				}

				setState(385);
				match(AS);
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(386);
					query();
					}
					break;
				case 2:
					{
					setState(387);
					match(T__1);
					setState(388);
					query();
					setState(389);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 20:
				_localctx = new DropMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(393);
				match(DROP);
				setState(394);
				match(MATERIALIZED);
				setState(395);
				match(VIEW);
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(396);
					match(IF);
					setState(397);
					match(EXISTS);
					}
					break;
				}
				setState(400);
				qualifiedName();
				}
				break;
			case 21:
				_localctx = new RefreshMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(401);
				match(REFRESH);
				setState(402);
				match(MATERIALIZED);
				setState(403);
				match(VIEW);
				setState(404);
				qualifiedName();
				setState(405);
				match(WHERE);
				setState(406);
				booleanExpression(0);
				}
				break;
			case 22:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(408);
				match(CREATE);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(409);
					match(OR);
					setState(410);
					match(REPLACE);
					}
				}

				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(413);
					match(TEMPORARY);
					}
				}

				setState(416);
				match(FUNCTION);
				setState(417);
				((CreateFunctionContext)_localctx).functionName = qualifiedName();
				setState(418);
				match(T__1);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(419);
					sqlParameterDeclaration();
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(420);
						match(T__3);
						setState(421);
						sqlParameterDeclaration();
						}
						}
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(429);
				match(T__2);
				setState(430);
				match(RETURNS);
				setState(431);
				((CreateFunctionContext)_localctx).returnType = type(0);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(432);
					match(COMMENT);
					setState(433);
					string();
					}
				}

				setState(436);
				routineCharacteristics();
				setState(437);
				routineBody();
				}
				break;
			case 23:
				_localctx = new AlterFunctionContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(439);
				match(ALTER);
				setState(440);
				match(FUNCTION);
				setState(441);
				qualifiedName();
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(442);
					types();
					}
				}

				setState(445);
				alterRoutineCharacteristics();
				}
				break;
			case 24:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(447);
				match(DROP);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(448);
					match(TEMPORARY);
					}
				}

				setState(451);
				match(FUNCTION);
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(452);
					match(IF);
					setState(453);
					match(EXISTS);
					}
					break;
				}
				setState(456);
				qualifiedName();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(457);
					types();
					}
				}

				}
				break;
			case 25:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(460);
				match(CALL);
				setState(461);
				qualifiedName();
				setState(462);
				match(T__1);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)) | (1L << (DOUBLE_PRECISION - 194)))) != 0)) {
					{
					setState(463);
					callArgument();
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(464);
						match(T__3);
						setState(465);
						callArgument();
						}
						}
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(473);
				match(T__2);
				}
				break;
			case 26:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(475);
				match(CREATE);
				setState(476);
				match(ROLE);
				setState(477);
				((CreateRoleContext)_localctx).name = identifier();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(478);
					match(WITH);
					setState(479);
					match(ADMIN);
					setState(480);
					grantor();
					}
				}

				}
				break;
			case 27:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(483);
				match(DROP);
				setState(484);
				match(ROLE);
				setState(485);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 28:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(486);
				match(GRANT);
				setState(487);
				roles();
				setState(488);
				match(TO);
				setState(489);
				principal();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(490);
					match(T__3);
					setState(491);
					principal();
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(497);
					match(WITH);
					setState(498);
					match(ADMIN);
					setState(499);
					match(OPTION);
					}
				}

				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(502);
					match(GRANTED);
					setState(503);
					match(BY);
					setState(504);
					grantor();
					}
				}

				}
				break;
			case 29:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(507);
				match(REVOKE);
				setState(511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(508);
					match(ADMIN);
					setState(509);
					match(OPTION);
					setState(510);
					match(FOR);
					}
					break;
				}
				setState(513);
				roles();
				setState(514);
				match(FROM);
				setState(515);
				principal();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(516);
					match(T__3);
					setState(517);
					principal();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(523);
					match(GRANTED);
					setState(524);
					match(BY);
					setState(525);
					grantor();
					}
				}

				}
				break;
			case 30:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(528);
				match(SET);
				setState(529);
				match(ROLE);
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(530);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(531);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(532);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 31:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(535);
				match(GRANT);
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(536);
					privilege();
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(537);
						match(T__3);
						setState(538);
						privilege();
						}
						}
						setState(543);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(544);
					match(ALL);
					setState(545);
					match(PRIVILEGES);
					}
					break;
				}
				setState(548);
				match(ON);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(549);
					match(TABLE);
					}
				}

				setState(552);
				qualifiedName();
				setState(553);
				match(TO);
				setState(554);
				((GrantContext)_localctx).grantee = principal();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(555);
					match(WITH);
					setState(556);
					match(GRANT);
					setState(557);
					match(OPTION);
					}
				}

				}
				break;
			case 32:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(560);
				match(REVOKE);
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(561);
					match(GRANT);
					setState(562);
					match(OPTION);
					setState(563);
					match(FOR);
					}
					break;
				}
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(566);
					privilege();
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(567);
						match(T__3);
						setState(568);
						privilege();
						}
						}
						setState(573);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(574);
					match(ALL);
					setState(575);
					match(PRIVILEGES);
					}
					break;
				}
				setState(578);
				match(ON);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(579);
					match(TABLE);
					}
				}

				setState(582);
				qualifiedName();
				setState(583);
				match(FROM);
				setState(584);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 33:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(586);
				match(SHOW);
				setState(587);
				match(GRANTS);
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(588);
					match(ON);
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(589);
						match(TABLE);
						}
					}

					setState(592);
					qualifiedName();
					}
				}

				}
				break;
			case 34:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(595);
				match(EXPLAIN);
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(596);
					match(ANALYZE);
					}
					break;
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(599);
					match(VERBOSE);
					}
				}

				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(602);
					match(T__1);
					setState(603);
					explainOption();
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(604);
						match(T__3);
						setState(605);
						explainOption();
						}
						}
						setState(610);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(611);
					match(T__2);
					}
					break;
				}
				setState(615);
				statement();
				}
				break;
			case 35:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(616);
				match(SHOW);
				setState(617);
				match(CREATE);
				setState(618);
				match(TABLE);
				setState(619);
				qualifiedName();
				}
				break;
			case 36:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(620);
				match(SHOW);
				setState(621);
				match(CREATE);
				setState(622);
				match(VIEW);
				setState(623);
				qualifiedName();
				}
				break;
			case 37:
				_localctx = new ShowCreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(624);
				match(SHOW);
				setState(625);
				match(CREATE);
				setState(626);
				match(MATERIALIZED);
				setState(627);
				match(VIEW);
				setState(628);
				qualifiedName();
				}
				break;
			case 38:
				_localctx = new ShowCreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(629);
				match(SHOW);
				setState(630);
				match(CREATE);
				setState(631);
				match(FUNCTION);
				setState(632);
				qualifiedName();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(633);
					types();
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(636);
				match(SHOW);
				setState(637);
				match(TABLES);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(638);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(639);
					qualifiedName();
					}
				}

				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(642);
					match(LIKE);
					setState(643);
					((ShowTablesContext)_localctx).pattern = string();
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(644);
						match(ESCAPE);
						setState(645);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 40:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(650);
				match(SHOW);
				setState(651);
				match(SCHEMAS);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(652);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(653);
					identifier();
					}
				}

				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(656);
					match(LIKE);
					setState(657);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(658);
						match(ESCAPE);
						setState(659);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 41:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(664);
				match(SHOW);
				setState(665);
				match(CATALOGS);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(666);
					match(LIKE);
					setState(667);
					((ShowCatalogsContext)_localctx).pattern = string();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(670);
				match(SHOW);
				setState(671);
				match(COLUMNS);
				setState(672);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(673);
				qualifiedName();
				}
				break;
			case 43:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(674);
				match(SHOW);
				setState(675);
				match(STATS);
				setState(676);
				match(FOR);
				setState(677);
				qualifiedName();
				}
				break;
			case 44:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(678);
				match(SHOW);
				setState(679);
				match(STATS);
				setState(680);
				match(FOR);
				setState(681);
				match(T__1);
				setState(682);
				querySpecification();
				setState(683);
				match(T__2);
				}
				break;
			case 45:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(685);
				match(SHOW);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(686);
					match(CURRENT);
					}
				}

				setState(689);
				match(ROLES);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(690);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(691);
					identifier();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(694);
				match(SHOW);
				setState(695);
				match(ROLE);
				setState(696);
				match(GRANTS);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(697);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(698);
					identifier();
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(701);
				match(DESCRIBE);
				setState(702);
				qualifiedName();
				}
				break;
			case 48:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(703);
				match(DESC);
				setState(704);
				qualifiedName();
				}
				break;
			case 49:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(705);
				match(SHOW);
				setState(706);
				match(FUNCTIONS);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(707);
					match(LIKE);
					setState(708);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(709);
						match(ESCAPE);
						setState(710);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 50:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(715);
				match(SHOW);
				setState(716);
				match(SESSION);
				}
				break;
			case 51:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(717);
				match(SET);
				setState(718);
				match(SESSION);
				setState(719);
				qualifiedName();
				setState(720);
				match(EQ);
				setState(721);
				expression();
				}
				break;
			case 52:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(723);
				match(RESET);
				setState(724);
				match(SESSION);
				setState(725);
				qualifiedName();
				}
				break;
			case 53:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(726);
				match(START);
				setState(727);
				match(TRANSACTION);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(728);
					transactionMode();
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(729);
						match(T__3);
						setState(730);
						transactionMode();
						}
						}
						setState(735);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 54:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(738);
				match(COMMIT);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(739);
					match(WORK);
					}
				}

				}
				break;
			case 55:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(742);
				match(ROLLBACK);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(743);
					match(WORK);
					}
				}

				}
				break;
			case 56:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(746);
				match(PREPARE);
				setState(747);
				identifier();
				setState(748);
				match(FROM);
				setState(749);
				statement();
				}
				break;
			case 57:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(751);
				match(DEALLOCATE);
				setState(752);
				match(PREPARE);
				setState(753);
				identifier();
				}
				break;
			case 58:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(754);
				match(EXECUTE);
				setState(755);
				identifier();
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(756);
					match(USING);
					setState(757);
					expression();
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(758);
						match(T__3);
						setState(759);
						expression();
						}
						}
						setState(764);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 59:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(767);
				match(DESCRIBE);
				setState(768);
				match(INPUT);
				setState(769);
				identifier();
				}
				break;
			case 60:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(770);
				match(DESCRIBE);
				setState(771);
				match(OUTPUT);
				setState(772);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(775);
				with();
				}
			}

			setState(778);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(WITH);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(781);
				match(RECURSIVE);
				}
			}

			setState(784);
			namedQuery();
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(785);
				match(T__3);
				setState(786);
				namedQuery();
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableElement);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				likeClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			identifier();
			setState(797);
			type(0);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(798);
				match(NOT);
				setState(799);
				match(NULL);
				}
			}

			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(802);
				match(COMMENT);
				setState(803);
				string();
				}
			}

			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(806);
				match(WITH);
				setState(807);
				properties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(LIKE);
			setState(811);
			qualifiedName();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(812);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(813);
				match(PROPERTIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(T__1);
			setState(817);
			property();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(818);
				match(T__3);
				setState(819);
				property();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			identifier();
			setState(828);
			match(EQ);
			setState(829);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlParameterDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SqlParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSqlParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSqlParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSqlParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlParameterDeclarationContext sqlParameterDeclaration() throws RecognitionException {
		SqlParameterDeclarationContext _localctx = new SqlParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sqlParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			identifier();
			setState(832);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineCharacteristicsContext extends ParserRuleContext {
		public List<RoutineCharacteristicContext> routineCharacteristic() {
			return getRuleContexts(RoutineCharacteristicContext.class);
		}
		public RoutineCharacteristicContext routineCharacteristic(int i) {
			return getRuleContext(RoutineCharacteristicContext.class,i);
		}
		public RoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicsContext routineCharacteristics() throws RecognitionException {
		RoutineCharacteristicsContext _localctx = new RoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_routineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==DETERMINISTIC || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (LANGUAGE - 101)) | (1L << (NOT - 101)) | (1L << (RETURNS - 101)))) != 0)) {
				{
				{
				setState(834);
				routineCharacteristic();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineCharacteristicContext extends ParserRuleContext {
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public DeterminismContext determinism() {
			return getRuleContext(DeterminismContext.class,0);
		}
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public RoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicContext routineCharacteristic() throws RecognitionException {
		RoutineCharacteristicContext _localctx = new RoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_routineCharacteristic);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(LANGUAGE);
				setState(841);
				language();
				}
				break;
			case DETERMINISTIC:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				determinism();
				}
				break;
			case CALLED:
			case RETURNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				nullCallClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterRoutineCharacteristicsContext extends ParserRuleContext {
		public List<AlterRoutineCharacteristicContext> alterRoutineCharacteristic() {
			return getRuleContexts(AlterRoutineCharacteristicContext.class);
		}
		public AlterRoutineCharacteristicContext alterRoutineCharacteristic(int i) {
			return getRuleContext(AlterRoutineCharacteristicContext.class,i);
		}
		public AlterRoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicsContext alterRoutineCharacteristics() throws RecognitionException {
		AlterRoutineCharacteristicsContext _localctx = new AlterRoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterRoutineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==RETURNS) {
				{
				{
				setState(846);
				alterRoutineCharacteristic();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterRoutineCharacteristicContext extends ParserRuleContext {
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public AlterRoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicContext alterRoutineCharacteristic() throws RecognitionException {
		AlterRoutineCharacteristicContext _localctx = new AlterRoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterRoutineCharacteristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			nullCallClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExternalBodyReferenceContext externalBodyReference() {
			return getRuleContext(ExternalBodyReferenceContext.class,0);
		}
		public RoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineBodyContext routineBody() throws RecognitionException {
		RoutineBodyContext _localctx = new RoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_routineBody);
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				returnStatement();
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				externalBodyReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(RETURN);
			setState(859);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalBodyReferenceContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public ExternalRoutineNameContext externalRoutineName() {
			return getRuleContext(ExternalRoutineNameContext.class,0);
		}
		public ExternalBodyReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalBodyReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExternalBodyReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExternalBodyReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExternalBodyReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalBodyReferenceContext externalBodyReference() throws RecognitionException {
		ExternalBodyReferenceContext _localctx = new ExternalBodyReferenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_externalBodyReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(EXTERNAL);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(862);
				match(NAME);
				setState(863);
				externalRoutineName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_language);
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				match(SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeterminismContext extends ParserRuleContext {
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DeterminismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determinism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeterminism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeterminism(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeterminism(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeterminismContext determinism() throws RecognitionException {
		DeterminismContext _localctx = new DeterminismContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_determinism);
		try {
			setState(873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				match(DETERMINISTIC);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(NOT);
				setState(872);
				match(DETERMINISTIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullCallClauseContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public List<TerminalNode> NULL() { return getTokens(SqlBaseParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(SqlBaseParser.NULL, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public NullCallClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCallClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullCallClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullCallClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullCallClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullCallClauseContext nullCallClause() throws RecognitionException {
		NullCallClauseContext _localctx = new NullCallClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nullCallClause);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				match(RETURNS);
				setState(876);
				match(NULL);
				setState(877);
				match(ON);
				setState(878);
				match(NULL);
				setState(879);
				match(INPUT);
				}
				break;
			case CALLED:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(CALLED);
				setState(881);
				match(ON);
				setState(882);
				match(NULL);
				setState(883);
				match(INPUT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalRoutineNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExternalRoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalRoutineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExternalRoutineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExternalRoutineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExternalRoutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalRoutineNameContext externalRoutineName() throws RecognitionException {
		ExternalRoutineNameContext _localctx = new ExternalRoutineNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_externalRoutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token limit;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			queryTerm(0);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(889);
				match(ORDER);
				setState(890);
				match(BY);
				setState(891);
				sortItem();
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(892);
					match(T__3);
					setState(893);
					sortItem();
					}
					}
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(901);
				match(LIMIT);
				setState(902);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(906);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(920);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(908);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(909);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(911);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(910);
							setQuantifier();
							}
						}

						setState(913);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(914);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(915);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(917);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(916);
							setQuantifier();
							}
						}

						setState(919);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_queryPrimary);
		try {
			int _alt;
			setState(941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(TABLE);
				setState(927);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				match(VALUES);
				setState(929);
				expression();
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(930);
						match(T__3);
						setState(931);
						expression();
						}
						} 
					}
					setState(936);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(937);
				match(T__1);
				setState(938);
				queryNoWith();
				setState(939);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			expression();
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(944);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(947);
				match(NULLS);
				setState(948);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(SELECT);
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(952);
				setQuantifier();
				}
				break;
			}
			setState(955);
			selectItem();
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(956);
					match(T__3);
					setState(957);
					selectItem();
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(963);
				match(FROM);
				setState(964);
				relation(0);
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(965);
						match(T__3);
						setState(966);
						relation(0);
						}
						} 
					}
					setState(971);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
			}
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(974);
				match(WHERE);
				setState(975);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(978);
				match(GROUP);
				setState(979);
				match(BY);
				setState(980);
				groupBy();
				}
				break;
			}
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(983);
				match(HAVING);
				setState(984);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(987);
				setQuantifier();
				}
				break;
			}
			setState(990);
			groupingElement();
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(991);
					match(T__3);
					setState(992);
					groupingElement();
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_groupingElement);
		int _la;
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(ROLLUP);
				setState(1000);
				match(T__1);
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)) | (1L << (DOUBLE_PRECISION - 194)))) != 0)) {
					{
					setState(1001);
					expression();
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1002);
						match(T__3);
						setState(1003);
						expression();
						}
						}
						setState(1008);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1011);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				match(CUBE);
				setState(1013);
				match(T__1);
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)) | (1L << (DOUBLE_PRECISION - 194)))) != 0)) {
					{
					setState(1014);
					expression();
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1015);
						match(T__3);
						setState(1016);
						expression();
						}
						}
						setState(1021);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1024);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1025);
				match(GROUPING);
				setState(1026);
				match(SETS);
				setState(1027);
				match(T__1);
				setState(1028);
				groupingSet();
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1029);
					match(T__3);
					setState(1030);
					groupingSet();
					}
					}
					setState(1035);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1036);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupingSet);
		int _la;
		try {
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				match(T__1);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)) | (1L << (DOUBLE_PRECISION - 194)))) != 0)) {
					{
					setState(1041);
					expression();
					setState(1046);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1042);
						match(T__3);
						setState(1043);
						expression();
						}
						}
						setState(1048);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1051);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1056);
				columnAliases();
				}
			}

			setState(1059);
			match(AS);
			setState(1060);
			match(T__1);
			setState(1061);
			query();
			setState(1062);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selectItem);
		int _la;
		try {
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				expression();
				setState(1071);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1067);
						match(AS);
						}
					}

					setState(1070);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				qualifiedName();
				setState(1074);
				match(T__0);
				setState(1075);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1081);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(1101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1083);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1097);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(1084);
						match(CROSS);
						setState(1085);
						match(JOIN);
						setState(1086);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(1087);
						joinType();
						setState(1088);
						match(JOIN);
						setState(1089);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(1090);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(1092);
						match(NATURAL);
						setState(1093);
						joinType();
						setState(1094);
						match(JOIN);
						setState(1095);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_joinType);
		int _la;
		try {
			setState(1119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1104);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				match(LEFT);
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1108);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				match(RIGHT);
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1112);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1115);
				match(FULL);
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1116);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_joinCriteria);
		int _la;
		try {
			setState(1135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				match(ON);
				setState(1122);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(USING);
				setState(1124);
				match(T__1);
				setState(1125);
				identifier();
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1126);
					match(T__3);
					setState(1127);
					identifier();
					}
					}
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1133);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			aliasedRelation();
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1138);
				match(TABLESAMPLE);
				setState(1139);
				sampleType();
				setState(1140);
				match(T__1);
				setState(1141);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1142);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			relationPrimary();
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1149);
					match(AS);
					}
				}

				setState(1152);
				identifier();
				setState(1154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1153);
					columnAliases();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(T__1);
			setState(1159);
			identifier();
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1160);
				match(T__3);
				setState(1161);
				identifier();
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1167);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_relationPrimary);
		int _la;
		try {
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1169);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				match(T__1);
				setState(1171);
				query();
				setState(1172);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1174);
				match(UNNEST);
				setState(1175);
				match(T__1);
				setState(1176);
				expression();
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1177);
					match(T__3);
					setState(1178);
					expression();
					}
					}
					setState(1183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1184);
				match(T__2);
				setState(1187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1185);
					match(WITH);
					setState(1186);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				match(LATERAL);
				setState(1190);
				match(T__1);
				setState(1191);
				query();
				setState(1192);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1194);
				match(T__1);
				setState(1195);
				relation(0);
				setState(1196);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case EXTERNAL:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1203);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1204);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1207);
				match(NOT);
				setState(1208);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1212);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1213);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1215);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1216);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 88, RULE_predicate);
		int _la;
		try {
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				comparisonOperator();
				setState(1223);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				comparisonOperator();
				setState(1226);
				comparisonQuantifier();
				setState(1227);
				match(T__1);
				setState(1228);
				query();
				setState(1229);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1231);
					match(NOT);
					}
				}

				setState(1234);
				match(BETWEEN);
				setState(1235);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1236);
				match(AND);
				setState(1237);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1239);
					match(NOT);
					}
				}

				setState(1242);
				match(IN);
				setState(1243);
				match(T__1);
				setState(1244);
				expression();
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1245);
					match(T__3);
					setState(1246);
					expression();
					}
					}
					setState(1251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1252);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1254);
					match(NOT);
					}
				}

				setState(1257);
				match(IN);
				setState(1258);
				match(T__1);
				setState(1259);
				query();
				setState(1260);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1262);
					match(NOT);
					}
				}

				setState(1265);
				match(LIKE);
				setState(1266);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1267);
					match(ESCAPE);
					setState(1268);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1271);
				match(IS);
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1272);
					match(NOT);
					}
				}

				setState(1275);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1276);
				match(IS);
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1277);
					match(NOT);
					}
				}

				setState(1280);
				match(DISTINCT);
				setState(1281);
				match(FROM);
				setState(1282);
				((DistinctFromContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case EXTERNAL:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1286);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1287);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1288);
				valueExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1292);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (ASTERISK - 220)) | (1L << (SLASH - 220)) | (1L << (PERCENT - 220)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1293);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1295);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1296);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1297);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1298);
						match(CONCAT);
						setState(1299);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1300);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1301);
						match(AT);
						setState(1302);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1309);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1310);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1311);
				identifier();
				setState(1312);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1314);
				match(DOUBLE_PRECISION);
				setState(1315);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1316);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1317);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1318);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1319);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1320);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1321);
				match(POSITION);
				setState(1322);
				match(T__1);
				setState(1323);
				valueExpression(0);
				setState(1324);
				match(IN);
				setState(1325);
				valueExpression(0);
				setState(1326);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1328);
				match(T__1);
				setState(1329);
				expression();
				setState(1332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1330);
					match(T__3);
					setState(1331);
					expression();
					}
					}
					setState(1334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1336);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1338);
				match(ROW);
				setState(1339);
				match(T__1);
				setState(1340);
				expression();
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1341);
					match(T__3);
					setState(1342);
					expression();
					}
					}
					setState(1347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1348);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1350);
				qualifiedName();
				setState(1351);
				match(T__1);
				setState(1352);
				match(ASTERISK);
				setState(1353);
				match(T__2);
				setState(1355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1354);
					filter();
					}
					break;
				}
				setState(1358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1357);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1360);
				qualifiedName();
				setState(1361);
				match(T__1);
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)) | (1L << (DOUBLE_PRECISION - 194)))) != 0)) {
					{
					setState(1363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1362);
						setQuantifier();
						}
						break;
					}
					setState(1365);
					expression();
					setState(1370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1366);
						match(T__3);
						setState(1367);
						expression();
						}
						}
						setState(1372);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1375);
					match(ORDER);
					setState(1376);
					match(BY);
					setState(1377);
					sortItem();
					setState(1382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1378);
						match(T__3);
						setState(1379);
						sortItem();
						}
						}
						setState(1384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1387);
				match(T__2);
				setState(1389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1388);
					filter();
					}
					break;
				}
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1391);
						nullTreatment();
						}
					}

					setState(1394);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1397);
				identifier();
				setState(1398);
				match(T__5);
				setState(1399);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1401);
				match(T__1);
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(1402);
					identifier();
					setState(1407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1403);
						match(T__3);
						setState(1404);
						identifier();
						}
						}
						setState(1409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1412);
				match(T__2);
				setState(1413);
				match(T__5);
				setState(1414);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1415);
				match(T__1);
				setState(1416);
				query();
				setState(1417);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1419);
				match(EXISTS);
				setState(1420);
				match(T__1);
				setState(1421);
				query();
				setState(1422);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1424);
				match(CASE);
				setState(1425);
				valueExpression(0);
				setState(1427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1426);
					whenClause();
					}
					}
					setState(1429); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1431);
					match(ELSE);
					setState(1432);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1435);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1437);
				match(CASE);
				setState(1439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1438);
					whenClause();
					}
					}
					setState(1441); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1443);
					match(ELSE);
					setState(1444);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1447);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1449);
				match(CAST);
				setState(1450);
				match(T__1);
				setState(1451);
				expression();
				setState(1452);
				match(AS);
				setState(1453);
				type(0);
				setState(1454);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1456);
				match(TRY_CAST);
				setState(1457);
				match(T__1);
				setState(1458);
				expression();
				setState(1459);
				match(AS);
				setState(1460);
				type(0);
				setState(1461);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1463);
				match(ARRAY);
				setState(1464);
				match(T__6);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRUE - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (PLUS - 194)) | (1L << (MINUS - 194)) | (1L << (STRING - 194)) | (1L << (UNICODE_STRING - 194)) | (1L << (BINARY_LITERAL - 194)) | (1L << (INTEGER_VALUE - 194)) | (1L << (DECIMAL_VALUE - 194)) | (1L << (DOUBLE_VALUE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)) | (1L << (DOUBLE_PRECISION - 194)))) != 0)) {
					{
					setState(1465);
					expression();
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1466);
						match(T__3);
						setState(1467);
						expression();
						}
						}
						setState(1472);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1475);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1476);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1477);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1478);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1479);
					match(T__1);
					setState(1480);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1481);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1484);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1485);
					match(T__1);
					setState(1486);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1487);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1490);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1491);
					match(T__1);
					setState(1492);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1493);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1496);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1497);
					match(T__1);
					setState(1498);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1499);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1502);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1503);
				match(SUBSTRING);
				setState(1504);
				match(T__1);
				setState(1505);
				valueExpression(0);
				setState(1506);
				match(FROM);
				setState(1507);
				valueExpression(0);
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1508);
					match(FOR);
					setState(1509);
					valueExpression(0);
					}
				}

				setState(1512);
				match(T__2);
				}
				break;
			case 32:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1514);
				match(NORMALIZE);
				setState(1515);
				match(T__1);
				setState(1516);
				valueExpression(0);
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1517);
					match(T__3);
					setState(1518);
					normalForm();
					}
				}

				setState(1521);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1523);
				match(EXTRACT);
				setState(1524);
				match(T__1);
				setState(1525);
				identifier();
				setState(1526);
				match(FROM);
				setState(1527);
				valueExpression(0);
				setState(1528);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1530);
				match(T__1);
				setState(1531);
				expression();
				setState(1532);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1534);
				match(GROUPING);
				setState(1535);
				match(T__1);
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)))) != 0)) {
					{
					setState(1536);
					qualifiedName();
					setState(1541);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1537);
						match(T__3);
						setState(1538);
						qualifiedName();
						}
						}
						setState(1543);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1546);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1557);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1549);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1550);
						match(T__6);
						setState(1551);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1552);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1554);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1555);
						match(T__0);
						setState(1556);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(SqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(SqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_string);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(UNICODE_STRING);
				setState(1566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1564);
					match(UESCAPE);
					setState(1565);
					match(STRING);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nullTreatment);
		try {
			setState(1574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1570);
				match(IGNORE);
				setState(1571);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				match(RESPECT);
				setState(1573);
				match(NULLS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_timeZoneSpecifier);
		try {
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				match(TIME);
				setState(1577);
				match(ZONE);
				setState(1578);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				match(TIME);
				setState(1580);
				match(ZONE);
				setState(1581);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if ( !(((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (EQ - 212)) | (1L << (NEQ - 212)) | (1L << (LT - 212)) | (1L << (LTE - 212)) | (1L << (GT - 212)) | (1L << (GTE - 212)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(INTERVAL);
			setState(1592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1591);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1594);
			string();
			setState(1595);
			((IntervalContext)_localctx).from = intervalField();
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1596);
				match(TO);
				setState(1597);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (HOUR - 84)) | (1L << (MINUTE - 84)) | (1L << (MONTH - 84)))) != 0) || _la==SECOND || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (NFC - 117)) | (1L << (NFD - 117)) | (1L << (NFKC - 117)) | (1L << (NFKD - 117)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			match(T__1);
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)) | (1L << (IDENTIFIER - 194)) | (1L << (DIGIT_IDENTIFIER - 194)) | (1L << (QUOTED_IDENTIFIER - 194)) | (1L << (BACKQUOTED_IDENTIFIER - 194)) | (1L << (TIME_WITH_TIME_ZONE - 194)) | (1L << (TIMESTAMP_WITH_TIME_ZONE - 194)) | (1L << (DOUBLE_PRECISION - 194)))) != 0)) {
				{
				setState(1605);
				type(0);
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1606);
					match(T__3);
					setState(1607);
					type(0);
					}
					}
					setState(1612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1615);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1618);
				match(ARRAY);
				setState(1619);
				match(LT);
				setState(1620);
				type(0);
				setState(1621);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1623);
				match(MAP);
				setState(1624);
				match(LT);
				setState(1625);
				type(0);
				setState(1626);
				match(T__3);
				setState(1627);
				type(0);
				setState(1628);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1630);
				match(ROW);
				setState(1631);
				match(T__1);
				setState(1632);
				identifier();
				setState(1633);
				type(0);
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1634);
					match(T__3);
					setState(1635);
					identifier();
					setState(1636);
					type(0);
					}
					}
					setState(1642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1643);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(1645);
				baseType();
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1646);
					match(T__1);
					setState(1647);
					typeParameter();
					setState(1652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1648);
						match(T__3);
						setState(1649);
						typeParameter();
						}
						}
						setState(1654);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1655);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1659);
				match(INTERVAL);
				setState(1660);
				((TypeContext)_localctx).from = intervalField();
				setState(1661);
				match(TO);
				setState(1662);
				((TypeContext)_localctx).to = intervalField();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1666);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(1667);
					match(ARRAY);
					}
					} 
				}
				setState(1672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_typeParameter);
		try {
			setState(1675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case TIME_WITH_TIME_ZONE:
			case TIMESTAMP_WITH_TIME_ZONE:
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0); }
		public TerminalNode TIMESTAMP_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_baseType);
		try {
			setState(1681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				match(TIME_WITH_TIME_ZONE);
				}
				break;
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				match(TIMESTAMP_WITH_TIME_ZONE);
				}
				break;
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
				match(DOUBLE_PRECISION);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1680);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(WHEN);
			setState(1684);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1685);
			match(THEN);
			setState(1686);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			match(FILTER);
			setState(1689);
			match(T__1);
			setState(1690);
			match(WHERE);
			setState(1691);
			booleanExpression(0);
			setState(1692);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(OVER);
			setState(1695);
			match(T__1);
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1696);
				match(PARTITION);
				setState(1697);
				match(BY);
				setState(1698);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1699);
					match(T__3);
					setState(1700);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1705);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1708);
				match(ORDER);
				setState(1709);
				match(BY);
				setState(1710);
				sortItem();
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1711);
					match(T__3);
					setState(1712);
					sortItem();
					}
					}
					setState(1717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1720);
				windowFrame();
				}
			}

			setState(1723);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_windowFrame);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1725);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1726);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1728);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1729);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1730);
				match(BETWEEN);
				setState(1731);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1732);
				match(AND);
				setState(1733);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1735);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1736);
				match(BETWEEN);
				setState(1737);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1738);
				match(AND);
				setState(1739);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_frameBound);
		int _la;
		try {
			setState(1752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				match(UNBOUNDED);
				setState(1744);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1745);
				match(UNBOUNDED);
				setState(1746);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1747);
				match(CURRENT);
				setState(1748);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1749);
				expression();
				setState(1750);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_explainOption);
		int _la;
		try {
			setState(1758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1754);
				match(FORMAT);
				setState(1755);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				match(TYPE);
				setState(1757);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (DISTRIBUTED - 55)) | (1L << (IO - 55)) | (1L << (LOGICAL - 55)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_transactionMode);
		int _la;
		try {
			setState(1765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1760);
				match(ISOLATION);
				setState(1761);
				match(LEVEL);
				setState(1762);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				match(READ);
				setState(1764);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_levelOfIsolation);
		try {
			setState(1774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1767);
				match(READ);
				setState(1768);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1769);
				match(READ);
				setState(1770);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1771);
				match(REPEATABLE);
				setState(1772);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1773);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_callArgument);
		try {
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1776);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				identifier();
				setState(1778);
				match(T__8);
				setState(1779);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_privilege);
		try {
			setState(1787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1785);
				match(INSERT);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1786);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			identifier();
			setState(1794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1790);
					match(T__0);
					setState(1791);
					identifier();
					}
					} 
				}
				setState(1796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUserGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUserGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUserGrantor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRoleGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRoleGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRoleGrantor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_grantor);
		try {
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1797);
				match(CURRENT_USER);
				}
				break;
			case 2:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1798);
				match(CURRENT_ROLE);
				}
				break;
			case 3:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1799);
				principal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnspecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnspecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnspecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUserPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUserPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUserPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRolePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRolePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRolePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_principal);
		try {
			setState(1807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				match(USER);
				setState(1803);
				identifier();
				}
				break;
			case 2:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				match(ROLE);
				setState(1805);
				identifier();
				}
				break;
			case 3:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1806);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			identifier();
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1810);
				match(T__3);
				setState(1811);
				identifier();
				}
				}
				setState(1816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_identifier);
		try {
			setState(1822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1819);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1820);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1821);
				match(DIGIT_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(SqlBaseParser.DOUBLE_VALUE, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_number);
		try {
			setState(1827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				match(DECIMAL_VALUE);
				}
				break;
			case DOUBLE_VALUE:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
				match(DOUBLE_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1826);
				match(INTEGER_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DEFINER() { return getToken(SqlBaseParser.DEFINER, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INVOKER() { return getToken(SqlBaseParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(SqlBaseParser.SECURITY, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (RETURN - 129)) | (1L << (RETURNS - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (SQL - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEMPORARY - 129)) | (1L << (TEXT - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (UNBOUNDED - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALIDATE - 194)) | (1L << (VERBOSE - 194)) | (1L << (VIEW - 194)) | (1L << (WORK - 194)) | (1L << (WRITE - 194)) | (1L << (YEAR - 194)) | (1L << (ZONE - 194)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 34:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 43:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 45:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 46:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 57:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f3\u072a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b3\n\5\3\5"+
		"\3\5\3\5\5\5\u00b8\n\5\3\5\3\5\3\5\3\5\5\5\u00be\n\5\3\5\3\5\5\5\u00c2"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00d0\n\5\3\5"+
		"\3\5\5\5\u00d4\n\5\3\5\3\5\5\5\u00d8\n\5\3\5\3\5\5\5\u00dc\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00e4\n\5\3\5\3\5\5\5\u00e8\n\5\3\5\5\5\u00eb\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u00f2\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u00f9\n\5\f"+
		"\5\16\5\u00fc\13\5\3\5\3\5\3\5\5\5\u0101\n\5\3\5\3\5\5\5\u0105\n\5\3\5"+
		"\3\5\3\5\3\5\5\5\u010b\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0112\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u011b\n\5\3\5\3\5\3\5\3\5\5\5\u0121\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u012c\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0133"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u013d\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0144\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u014c\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0154\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u015c\n\5\3\5\3\5\3\5"+
		"\5\5\u0161\n\5\3\5\3\5\3\5\3\5\5\5\u0167\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0170\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0179\n\5\3\5\3\5\3\5"+
		"\5\5\u017e\n\5\3\5\3\5\5\5\u0182\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u018a"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0191\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u019e\n\5\3\5\5\5\u01a1\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\u01a9\n\5\f\5\16\5\u01ac\13\5\5\5\u01ae\n\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u01b5\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01be\n\5\3\5\3\5\3\5\3\5\5"+
		"\5\u01c4\n\5\3\5\3\5\3\5\5\5\u01c9\n\5\3\5\3\5\5\5\u01cd\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u01d5\n\5\f\5\16\5\u01d8\13\5\5\5\u01da\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01e4\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u01ef\n\5\f\5\16\5\u01f2\13\5\3\5\3\5\3\5\5\5\u01f7\n\5\3\5\3"+
		"\5\3\5\5\5\u01fc\n\5\3\5\3\5\3\5\3\5\5\5\u0202\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u0209\n\5\f\5\16\5\u020c\13\5\3\5\3\5\3\5\5\5\u0211\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u0218\n\5\3\5\3\5\3\5\3\5\7\5\u021e\n\5\f\5\16\5\u0221"+
		"\13\5\3\5\3\5\5\5\u0225\n\5\3\5\3\5\5\5\u0229\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0231\n\5\3\5\3\5\3\5\3\5\5\5\u0237\n\5\3\5\3\5\3\5\7\5\u023c"+
		"\n\5\f\5\16\5\u023f\13\5\3\5\3\5\5\5\u0243\n\5\3\5\3\5\5\5\u0247\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0251\n\5\3\5\5\5\u0254\n\5\3\5\3\5"+
		"\5\5\u0258\n\5\3\5\5\5\u025b\n\5\3\5\3\5\3\5\3\5\7\5\u0261\n\5\f\5\16"+
		"\5\u0264\13\5\3\5\3\5\5\5\u0268\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u027d\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0283\n\5\3\5\3\5\3\5\3\5\5\5\u0289\n\5\5\5\u028b\n\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0291\n\5\3\5\3\5\3\5\3\5\5\5\u0297\n\5\5\5\u0299\n\5\3\5\3"+
		"\5\3\5\3\5\5\5\u029f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u02b2\n\5\3\5\3\5\3\5\5\5\u02b7\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u02be\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u02ca\n\5\5\5\u02cc\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u02de\n\5\f\5\16\5\u02e1\13\5\5\5\u02e3\n\5\3\5"+
		"\3\5\5\5\u02e7\n\5\3\5\3\5\5\5\u02eb\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u02fb\n\5\f\5\16\5\u02fe\13\5\5\5\u0300"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0308\n\5\3\6\5\6\u030b\n\6\3\6\3\6\3"+
		"\7\3\7\5\7\u0311\n\7\3\7\3\7\3\7\7\7\u0316\n\7\f\7\16\7\u0319\13\7\3\b"+
		"\3\b\5\b\u031d\n\b\3\t\3\t\3\t\3\t\5\t\u0323\n\t\3\t\3\t\5\t\u0327\n\t"+
		"\3\t\3\t\5\t\u032b\n\t\3\n\3\n\3\n\3\n\5\n\u0331\n\n\3\13\3\13\3\13\3"+
		"\13\7\13\u0337\n\13\f\13\16\13\u033a\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\7\16\u0346\n\16\f\16\16\16\u0349\13\16\3\17\3\17\3\17"+
		"\3\17\5\17\u034f\n\17\3\20\7\20\u0352\n\20\f\20\16\20\u0355\13\20\3\21"+
		"\3\21\3\22\3\22\5\22\u035b\n\22\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0363"+
		"\n\24\3\25\3\25\5\25\u0367\n\25\3\26\3\26\3\26\5\26\u036c\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0377\n\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0381\n\31\f\31\16\31\u0384\13\31\5\31"+
		"\u0386\n\31\3\31\3\31\5\31\u038a\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0392\n\32\3\32\3\32\3\32\3\32\5\32\u0398\n\32\3\32\7\32\u039b\n\32"+
		"\f\32\16\32\u039e\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u03a7"+
		"\n\33\f\33\16\33\u03aa\13\33\3\33\3\33\3\33\3\33\5\33\u03b0\n\33\3\34"+
		"\3\34\5\34\u03b4\n\34\3\34\3\34\5\34\u03b8\n\34\3\35\3\35\5\35\u03bc\n"+
		"\35\3\35\3\35\3\35\7\35\u03c1\n\35\f\35\16\35\u03c4\13\35\3\35\3\35\3"+
		"\35\3\35\7\35\u03ca\n\35\f\35\16\35\u03cd\13\35\5\35\u03cf\n\35\3\35\3"+
		"\35\5\35\u03d3\n\35\3\35\3\35\3\35\5\35\u03d8\n\35\3\35\3\35\5\35\u03dc"+
		"\n\35\3\36\5\36\u03df\n\36\3\36\3\36\3\36\7\36\u03e4\n\36\f\36\16\36\u03e7"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u03ef\n\37\f\37\16\37\u03f2"+
		"\13\37\5\37\u03f4\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u03fc\n\37\f"+
		"\37\16\37\u03ff\13\37\5\37\u0401\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u040a\n\37\f\37\16\37\u040d\13\37\3\37\3\37\5\37\u0411\n\37\3"+
		" \3 \3 \3 \7 \u0417\n \f \16 \u041a\13 \5 \u041c\n \3 \3 \5 \u0420\n "+
		"\3!\3!\5!\u0424\n!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\5#\u042f\n#\3#\5#\u0432"+
		"\n#\3#\3#\3#\3#\3#\5#\u0439\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\5$\u044c\n$\7$\u044e\n$\f$\16$\u0451\13$\3%\5%\u0454\n%\3"+
		"%\3%\5%\u0458\n%\3%\3%\5%\u045c\n%\3%\3%\5%\u0460\n%\5%\u0462\n%\3&\3"+
		"&\3&\3&\3&\3&\3&\7&\u046b\n&\f&\16&\u046e\13&\3&\3&\5&\u0472\n&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u047b\n\'\3(\3(\3)\3)\5)\u0481\n)\3)\3)\5)"+
		"\u0485\n)\5)\u0487\n)\3*\3*\3*\3*\7*\u048d\n*\f*\16*\u0490\13*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u049e\n+\f+\16+\u04a1\13+\3+\3+\3+\5+"+
		"\u04a6\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u04b1\n+\3,\3,\3-\3-\3-\5-\u04b8"+
		"\n-\3-\3-\5-\u04bc\n-\3-\3-\3-\3-\3-\3-\7-\u04c4\n-\f-\16-\u04c7\13-\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u04d3\n.\3.\3.\3.\3.\3.\3.\5.\u04db\n"+
		".\3.\3.\3.\3.\3.\7.\u04e2\n.\f.\16.\u04e5\13.\3.\3.\3.\5.\u04ea\n.\3."+
		"\3.\3.\3.\3.\3.\5.\u04f2\n.\3.\3.\3.\3.\5.\u04f8\n.\3.\3.\5.\u04fc\n."+
		"\3.\3.\3.\5.\u0501\n.\3.\3.\3.\5.\u0506\n.\3/\3/\3/\3/\5/\u050c\n/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u051a\n/\f/\16/\u051d\13/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\6\60\u0537\n\60\r\60\16\60"+
		"\u0538\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0542\n\60\f\60\16\60\u0545"+
		"\13\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u054e\n\60\3\60\5\60\u0551"+
		"\n\60\3\60\3\60\3\60\5\60\u0556\n\60\3\60\3\60\3\60\7\60\u055b\n\60\f"+
		"\60\16\60\u055e\13\60\5\60\u0560\n\60\3\60\3\60\3\60\3\60\3\60\7\60\u0567"+
		"\n\60\f\60\16\60\u056a\13\60\5\60\u056c\n\60\3\60\3\60\5\60\u0570\n\60"+
		"\3\60\5\60\u0573\n\60\3\60\5\60\u0576\n\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\7\60\u0580\n\60\f\60\16\60\u0583\13\60\5\60\u0585\n\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\6\60\u0596\n\60\r\60\16\60\u0597\3\60\3\60\5\60\u059c\n\60\3\60\3"+
		"\60\3\60\3\60\6\60\u05a2\n\60\r\60\16\60\u05a3\3\60\3\60\5\60\u05a8\n"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u05bf\n\60\f\60\16\60\u05c2"+
		"\13\60\5\60\u05c4\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u05cd\n"+
		"\60\3\60\3\60\3\60\3\60\5\60\u05d3\n\60\3\60\3\60\3\60\3\60\5\60\u05d9"+
		"\n\60\3\60\3\60\3\60\3\60\5\60\u05df\n\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u05e9\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u05f2"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u0606\n\60\f\60\16\60\u0609\13\60\5\60"+
		"\u060b\n\60\3\60\5\60\u060e\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\7\60\u0618\n\60\f\60\16\60\u061b\13\60\3\61\3\61\3\61\3\61\5\61\u0621"+
		"\n\61\5\61\u0623\n\61\3\62\3\62\3\62\3\62\5\62\u0629\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u0631\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\5\67\u063b\n\67\3\67\3\67\3\67\3\67\5\67\u0641\n\67\38\38\39\39"+
		"\3:\3:\3:\3:\7:\u064b\n:\f:\16:\u064e\13:\5:\u0650\n:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u0669\n;\f;\16"+
		";\u066c\13;\3;\3;\3;\3;\3;\3;\3;\7;\u0675\n;\f;\16;\u0678\13;\3;\3;\5"+
		";\u067c\n;\3;\3;\3;\3;\3;\5;\u0683\n;\3;\3;\7;\u0687\n;\f;\16;\u068a\13"+
		";\3<\3<\5<\u068e\n<\3=\3=\3=\3=\5=\u0694\n=\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3?\3@\3@\3@\3@\3@\3@\3@\7@\u06a8\n@\f@\16@\u06ab\13@\5@\u06ad\n@"+
		"\3@\3@\3@\3@\3@\7@\u06b4\n@\f@\16@\u06b7\13@\5@\u06b9\n@\3@\5@\u06bc\n"+
		"@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u06d0\nA\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u06db\nB\3C\3C\3C\3C\5C\u06e1\nC\3D\3D\3"+
		"D\3D\3D\5D\u06e8\nD\3E\3E\3E\3E\3E\3E\3E\5E\u06f1\nE\3F\3F\3F\3F\3F\5"+
		"F\u06f8\nF\3G\3G\3G\3G\5G\u06fe\nG\3H\3H\3H\7H\u0703\nH\fH\16H\u0706\13"+
		"H\3I\3I\3I\5I\u070b\nI\3J\3J\3J\3J\3J\5J\u0712\nJ\3K\3K\3K\7K\u0717\n"+
		"K\fK\16K\u071a\13K\3L\3L\3L\3L\3L\5L\u0721\nL\3M\3M\3M\5M\u0726\nM\3N"+
		"\3N\3N\2\b\62FX\\^tO\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\2\30\4\2"+
		"\34\34\u009b\u009b\4\2\63\63aa\4\2KKYY\4\2??ZZ\4\2\16\16\u00e5\u00e5\4"+
		"\2>>\u00c6\u00c6\4\2\25\25\65\65\4\2GGhh\4\2\16\1688\4\2\27\27\u00b5\u00b5"+
		"\3\2\u00dc\u00dd\3\2\u00de\u00e0\3\2\u00d6\u00db\5\2\16\16\22\22\u00b0"+
		"\u00b0\4\2EE\u00c0\u00c0\7\2\61\61VVst\u00a8\u00a8\u00d4\u00d4\3\2wz\4"+
		"\2HH\u008e\u008e\5\2RRee\u00ba\u00ba\6\299bbpp\u00cb\u00cb\4\2\u0083\u0083"+
		"\u00d3\u00d3\61\2\f\16\20\20\22\23\25\27\32\34\37$))++/\61\63\63\65\65"+
		"\67\6799??BBDDFHJJMRVXZZ\\\\__abdegikkmmpuw|\u0080\u0081\u0083\u0084\u0087"+
		"\u0087\u0089\u008e\u0090\u0093\u0095\u009e\u00a0\u00a2\u00a4\u00a9\u00ab"+
		"\u00b5\u00b7\u00ba\u00bc\u00bf\u00c1\u00c2\u00c4\u00c5\u00c8\u00c9\u00cb"+
		"\u00cb\u00cd\u00ce\u00d2\u00d5\2\u0849\2\u009c\3\2\2\2\4\u009f\3\2\2\2"+
		"\6\u00a2\3\2\2\2\b\u0307\3\2\2\2\n\u030a\3\2\2\2\f\u030e\3\2\2\2\16\u031c"+
		"\3\2\2\2\20\u031e\3\2\2\2\22\u032c\3\2\2\2\24\u0332\3\2\2\2\26\u033d\3"+
		"\2\2\2\30\u0341\3\2\2\2\32\u0347\3\2\2\2\34\u034e\3\2\2\2\36\u0353\3\2"+
		"\2\2 \u0356\3\2\2\2\"\u035a\3\2\2\2$\u035c\3\2\2\2&\u035f\3\2\2\2(\u0366"+
		"\3\2\2\2*\u036b\3\2\2\2,\u0376\3\2\2\2.\u0378\3\2\2\2\60\u037a\3\2\2\2"+
		"\62\u038b\3\2\2\2\64\u03af\3\2\2\2\66\u03b1\3\2\2\28\u03b9\3\2\2\2:\u03de"+
		"\3\2\2\2<\u0410\3\2\2\2>\u041f\3\2\2\2@\u0421\3\2\2\2B\u042a\3\2\2\2D"+
		"\u0438\3\2\2\2F\u043a\3\2\2\2H\u0461\3\2\2\2J\u0471\3\2\2\2L\u0473\3\2"+
		"\2\2N\u047c\3\2\2\2P\u047e\3\2\2\2R\u0488\3\2\2\2T\u04b0\3\2\2\2V\u04b2"+
		"\3\2\2\2X\u04bb\3\2\2\2Z\u0505\3\2\2\2\\\u050b\3\2\2\2^\u060d\3\2\2\2"+
		"`\u0622\3\2\2\2b\u0628\3\2\2\2d\u0630\3\2\2\2f\u0632\3\2\2\2h\u0634\3"+
		"\2\2\2j\u0636\3\2\2\2l\u0638\3\2\2\2n\u0642\3\2\2\2p\u0644\3\2\2\2r\u0646"+
		"\3\2\2\2t\u0682\3\2\2\2v\u068d\3\2\2\2x\u0693\3\2\2\2z\u0695\3\2\2\2|"+
		"\u069a\3\2\2\2~\u06a0\3\2\2\2\u0080\u06cf\3\2\2\2\u0082\u06da\3\2\2\2"+
		"\u0084\u06e0\3\2\2\2\u0086\u06e7\3\2\2\2\u0088\u06f0\3\2\2\2\u008a\u06f7"+
		"\3\2\2\2\u008c\u06fd\3\2\2\2\u008e\u06ff\3\2\2\2\u0090\u070a\3\2\2\2\u0092"+
		"\u0711\3\2\2\2\u0094\u0713\3\2\2\2\u0096\u0720\3\2\2\2\u0098\u0725\3\2"+
		"\2\2\u009a\u0727\3\2\2\2\u009c\u009d\5\b\5\2\u009d\u009e\7\2\2\3\u009e"+
		"\3\3\2\2\2\u009f\u00a0\5V,\2\u00a0\u00a1\7\2\2\3\u00a1\5\3\2\2\2\u00a2"+
		"\u00a3\5\"\22\2\u00a3\u00a4\7\2\2\3\u00a4\7\3\2\2\2\u00a5\u0308\5\n\6"+
		"\2\u00a6\u00a7\7\u00c8\2\2\u00a7\u0308\5\u0096L\2\u00a8\u00a9\7\u00c8"+
		"\2\2\u00a9\u00aa\5\u0096L\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\5\u0096L\2"+
		"\u00ac\u0308\3\2\2\2\u00ad\u00ae\7&\2\2\u00ae\u00b2\7\u00a6\2\2\u00af"+
		"\u00b0\7W\2\2\u00b0\u00b1\7~\2\2\u00b1\u00b3\7A\2\2\u00b2\u00af\3\2\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\5\u008eH\2\u00b5"+
		"\u00b6\7\u00d1\2\2\u00b6\u00b8\5\24\13\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u0308\3\2\2\2\u00b9\u00ba\7:\2\2\u00ba\u00bd\7\u00a6\2"+
		"\2\u00bb\u00bc\7W\2\2\u00bc\u00be\7A\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\5\u008eH\2\u00c0\u00c2\t\2\2"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u0308\3\2\2\2\u00c3\u00c4"+
		"\7\17\2\2\u00c4\u00c5\7\u00a6\2\2\u00c5\u00c6\5\u008eH\2\u00c6\u00c7\7"+
		"\u0096\2\2\u00c7\u00c8\7\u00be\2\2\u00c8\u00c9\5\u0096L\2\u00c9\u0308"+
		"\3\2\2\2\u00ca\u00cb\7&\2\2\u00cb\u00cf\7\u00b6\2\2\u00cc\u00cd\7W\2\2"+
		"\u00cd\u00ce\7~\2\2\u00ce\u00d0\7A\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5\u008eH\2\u00d2\u00d4\5R*\2"+
		"\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6"+
		"\7\"\2\2\u00d6\u00d8\5`\61\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00da\7\u00d1\2\2\u00da\u00dc\5\24\13\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e3\7\24\2\2"+
		"\u00de\u00e4\5\n\6\2\u00df\u00e0\7\4\2\2\u00e0\u00e1\5\n\6\2\u00e1\u00e2"+
		"\7\5\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4"+
		"\u00ea\3\2\2\2\u00e5\u00e7\7\u00d1\2\2\u00e6\u00e8\7{\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7/\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u0308\3\2\2\2\u00ec\u00ed\7&"+
		"\2\2\u00ed\u00f1\7\u00b6\2\2\u00ee\u00ef\7W\2\2\u00ef\u00f0\7~\2\2\u00f0"+
		"\u00f2\7A\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\5\u008eH\2\u00f4\u00f5\7\4\2\2\u00f5\u00fa\5\16\b\2\u00f6"+
		"\u00f7\7\6\2\2\u00f7\u00f9\5\16\b\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u0100\7\5\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0101\5`"+
		"\61\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0103\7\u00d1\2\2\u0103\u0105\5\24\13\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0308\3\2\2\2\u0106\u0107\7:\2\2\u0107\u010a\7\u00b6\2"+
		"\2\u0108\u0109\7W\2\2\u0109\u010b\7A\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0308\5\u008eH\2\u010d\u010e\7]\2\2"+
		"\u010e\u010f\7`\2\2\u010f\u0111\5\u008eH\2\u0110\u0112\5R*\2\u0111\u0110"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\n\6\2\u0114"+
		"\u0308\3\2\2\2\u0115\u0116\7\64\2\2\u0116\u0117\7K\2\2\u0117\u011a\5\u008e"+
		"H\2\u0118\u0119\7\u00d0\2\2\u0119\u011b\5X-\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0308\3\2\2\2\u011c\u011d\7\17\2\2\u011d\u0120\7"+
		"\u00b6\2\2\u011e\u011f\7W\2\2\u011f\u0121\7A\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\5\u008eH\2\u0123\u0124"+
		"\7\u0096\2\2\u0124\u0125\7\u00be\2\2\u0125\u0126\5\u008eH\2\u0126\u0308"+
		"\3\2\2\2\u0127\u0128\7\17\2\2\u0128\u012b\7\u00b6\2\2\u0129\u012a\7W\2"+
		"\2\u012a\u012c\7A\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\5\u008eH\2\u012e\u012f\7\u0096\2\2\u012f\u0132\7"+
		" \2\2\u0130\u0131\7W\2\2\u0131\u0133\7A\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5\u0096L\2\u0135\u0136"+
		"\7\u00be\2\2\u0136\u0137\5\u0096L\2\u0137\u0308\3\2\2\2\u0138\u0139\7"+
		"\17\2\2\u0139\u013c\7\u00b6\2\2\u013a\u013b\7W\2\2\u013b\u013d\7A\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f"+
		"\5\u008eH\2\u013f\u0140\7:\2\2\u0140\u0143\7 \2\2\u0141\u0142\7W\2\2\u0142"+
		"\u0144\7A\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0146\5\u008eH\2\u0146\u0308\3\2\2\2\u0147\u0148\7\17\2\2\u0148"+
		"\u014b\7\u00b6\2\2\u0149\u014a\7W\2\2\u014a\u014c\7A\2\2\u014b\u0149\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\5\u008eH\2"+
		"\u014e\u014f\7\f\2\2\u014f\u0153\7 \2\2\u0150\u0151\7W\2\2\u0151\u0152"+
		"\7~\2\2\u0152\u0154\7A\2\2\u0153\u0150\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\5\20\t\2\u0156\u0308\3\2\2\2\u0157\u0158\7"+
		"\20\2\2\u0158\u015b\5\u008eH\2\u0159\u015a\7\u00d1\2\2\u015a\u015c\5\24"+
		"\13\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0308\3\2\2\2\u015d"+
		"\u0160\7&\2\2\u015e\u015f\7\u0085\2\2\u015f\u0161\7\u0098\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\u00ce\2"+
		"\2\u0163\u0166\5\u008eH\2\u0164\u0165\7\u00a9\2\2\u0165\u0167\t\3\2\2"+
		"\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169"+
		"\7\24\2\2\u0169\u016a\5\n\6\2\u016a\u0308\3\2\2\2\u016b\u016c\7:\2\2\u016c"+
		"\u016f\7\u00ce\2\2\u016d\u016e\7W\2\2\u016e\u0170\7A\2\2\u016f\u016d\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0308\5\u008eH\2"+
		"\u0172\u0173\7&\2\2\u0173\u0174\7r\2\2\u0174\u0178\7\u00ce\2\2\u0175\u0176"+
		"\7W\2\2\u0176\u0177\7~\2\2\u0177\u0179\7A\2\2\u0178\u0175\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\5\u008eH\2\u017b\u017c"+
		"\7\"\2\2\u017c\u017e\5`\61\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0181\3\2\2\2\u017f\u0180\7\u00d1\2\2\u0180\u0182\5\24\13\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0189\7\24\2\2"+
		"\u0184\u018a\5\n\6\2\u0185\u0186\7\4\2\2\u0186\u0187\5\n\6\2\u0187\u0188"+
		"\7\5\2\2\u0188\u018a\3\2\2\2\u0189\u0184\3\2\2\2\u0189\u0185\3\2\2\2\u018a"+
		"\u0308\3\2\2\2\u018b\u018c\7:\2\2\u018c\u018d\7r\2\2\u018d\u0190\7\u00ce"+
		"\2\2\u018e\u018f\7W\2\2\u018f\u0191\7A\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0308\5\u008eH\2\u0193\u0194\7\u0095"+
		"\2\2\u0194\u0195\7r\2\2\u0195\u0196\7\u00ce\2\2\u0196\u0197\5\u008eH\2"+
		"\u0197\u0198\7\u00d0\2\2\u0198\u0199\5X-\2\u0199\u0308\3\2\2\2\u019a\u019d"+
		"\7&\2\2\u019b\u019c\7\u0085\2\2\u019c\u019e\7\u0098\2\2\u019d\u019b\3"+
		"\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\7\u00b9\2\2"+
		"\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\7M\2\2\u01a3\u01a4\5\u008eH\2\u01a4\u01ad\7\4\2\2\u01a5\u01aa\5\30\r"+
		"\2\u01a6\u01a7\7\6\2\2\u01a7\u01a9\5\30\r\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\7\5\2\2\u01b0\u01b1\7\u009d\2\2\u01b1\u01b4"+
		"\5t;\2\u01b2\u01b3\7\"\2\2\u01b3\u01b5\5`\61\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5\32\16\2\u01b7\u01b8\5"+
		"\"\22\2\u01b8\u0308\3\2\2\2\u01b9\u01ba\7\17\2\2\u01ba\u01bb\7M\2\2\u01bb"+
		"\u01bd\5\u008eH\2\u01bc\u01be\5r:\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\5\36\20\2\u01c0\u0308\3\2\2\2\u01c1"+
		"\u01c3\7:\2\2\u01c2\u01c4\7\u00b9\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\7M\2\2\u01c6\u01c7\7W\2\2\u01c7"+
		"\u01c9\7A\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cc\5\u008eH\2\u01cb\u01cd\5r:\2\u01cc\u01cb\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u0308\3\2\2\2\u01ce\u01cf\7\32\2\2\u01cf\u01d0\5"+
		"\u008eH\2\u01d0\u01d9\7\4\2\2\u01d1\u01d6\5\u008aF\2\u01d2\u01d3\7\6\2"+
		"\2\u01d3\u01d5\5\u008aF\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d9\u01d1\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\7\5\2\2\u01dc\u0308\3\2\2\2\u01dd\u01de\7&\2\2\u01de\u01df\7\u00a0"+
		"\2\2\u01df\u01e3\5\u0096L\2\u01e0\u01e1\7\u00d1\2\2\u01e1\u01e2\7\r\2"+
		"\2\u01e2\u01e4\5\u0090I\2\u01e3\u01e0\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u0308\3\2\2\2\u01e5\u01e6\7:\2\2\u01e6\u01e7\7\u00a0\2\2\u01e7\u0308"+
		"\5\u0096L\2\u01e8\u01e9\7O\2\2\u01e9\u01ea\5\u0094K\2\u01ea\u01eb\7\u00be"+
		"\2\2\u01eb\u01f0\5\u0092J\2\u01ec\u01ed\7\6\2\2\u01ed\u01ef\5\u0092J\2"+
		"\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f6\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7\u00d1\2"+
		"\2\u01f4\u01f5\7\r\2\2\u01f5\u01f7\7\u0084\2\2\u01f6\u01f3\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01f9\7P\2\2\u01f9\u01fa\7\31"+
		"\2\2\u01fa\u01fc\5\u0090I\2\u01fb\u01f8\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u0308\3\2\2\2\u01fd\u0201\7\u009e\2\2\u01fe\u01ff\7\r\2\2\u01ff\u0200"+
		"\7\u0084\2\2\u0200\u0202\7I\2\2\u0201\u01fe\3\2\2\2\u0201\u0202\3\2\2"+
		"\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0094K\2\u0204\u0205\7K\2\2\u0205"+
		"\u020a\5\u0092J\2\u0206\u0207\7\6\2\2\u0207\u0209\5\u0092J\2\u0208\u0206"+
		"\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u0210\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7P\2\2\u020e\u020f\7\31"+
		"\2\2\u020f\u0211\5\u0090I\2\u0210\u020d\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0308\3\2\2\2\u0212\u0213\7\u00ad\2\2\u0213\u0217\7\u00a0\2\2\u0214\u0218"+
		"\7\16\2\2\u0215\u0218\7|\2\2\u0216\u0218\5\u0096L\2\u0217\u0214\3\2\2"+
		"\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u0308\3\2\2\2\u0219\u0224"+
		"\7O\2\2\u021a\u021f\5\u008cG\2\u021b\u021c\7\6\2\2\u021c\u021e\5\u008c"+
		"G\2\u021d\u021b\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0225\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\7\16"+
		"\2\2\u0223\u0225\7\u0090\2\2\u0224\u021a\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0228\7\u0082\2\2\u0227\u0229\7\u00b6\2\2\u0228\u0227"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5\u008eH"+
		"\2\u022b\u022c\7\u00be\2\2\u022c\u0230\5\u0092J\2\u022d\u022e\7\u00d1"+
		"\2\2\u022e\u022f\7O\2\2\u022f\u0231\7\u0084\2\2\u0230\u022d\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0308\3\2\2\2\u0232\u0236\7\u009e\2\2\u0233\u0234"+
		"\7O\2\2\u0234\u0235\7\u0084\2\2\u0235\u0237\7I\2\2\u0236\u0233\3\2\2\2"+
		"\u0236\u0237\3\2\2\2\u0237\u0242\3\2\2\2\u0238\u023d\5\u008cG\2\u0239"+
		"\u023a\7\6\2\2\u023a\u023c\5\u008cG\2\u023b\u0239\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0243\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\7\16\2\2\u0241\u0243\7\u0090\2\2\u0242\u0238"+
		"\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\7\u0082\2"+
		"\2\u0245\u0247\7\u00b6\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\5\u008eH\2\u0249\u024a\7K\2\2\u024a\u024b\5"+
		"\u0092J\2\u024b\u0308\3\2\2\2\u024c\u024d\7\u00af\2\2\u024d\u0253\7Q\2"+
		"\2\u024e\u0250\7\u0082\2\2\u024f\u0251\7\u00b6\2\2\u0250\u024f\3\2\2\2"+
		"\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\5\u008eH\2\u0253"+
		"\u024e\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0308\3\2\2\2\u0255\u0257\7B"+
		"\2\2\u0256\u0258\7\20\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u025a\3\2\2\2\u0259\u025b\7\u00cd\2\2\u025a\u0259\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u0267\3\2\2\2\u025c\u025d\7\4\2\2\u025d\u0262\5\u0084C"+
		"\2\u025e\u025f\7\6\2\2\u025f\u0261\5\u0084C\2\u0260\u025e\3\2\2\2\u0261"+
		"\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2"+
		"\2\2\u0264\u0262\3\2\2\2\u0265\u0266\7\5\2\2\u0266\u0268\3\2\2\2\u0267"+
		"\u025c\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0308\5\b"+
		"\5\2\u026a\u026b\7\u00af\2\2\u026b\u026c\7&\2\2\u026c\u026d\7\u00b6\2"+
		"\2\u026d\u0308\5\u008eH\2\u026e\u026f\7\u00af\2\2\u026f\u0270\7&\2\2\u0270"+
		"\u0271\7\u00ce\2\2\u0271\u0308\5\u008eH\2\u0272\u0273\7\u00af\2\2\u0273"+
		"\u0274\7&\2\2\u0274\u0275\7r\2\2\u0275\u0276\7\u00ce\2\2\u0276\u0308\5"+
		"\u008eH\2\u0277\u0278\7\u00af\2\2\u0278\u0279\7&\2\2\u0279\u027a\7M\2"+
		"\2\u027a\u027c\5\u008eH\2\u027b\u027d\5r:\2\u027c\u027b\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u0308\3\2\2\2\u027e\u027f\7\u00af\2\2\u027f\u0282"+
		"\7\u00b7\2\2\u0280\u0281\t\4\2\2\u0281\u0283\5\u008eH\2\u0282\u0280\3"+
		"\2\2\2\u0282\u0283\3\2\2\2\u0283\u028a\3\2\2\2\u0284\u0285\7l\2\2\u0285"+
		"\u0288\5`\61\2\u0286\u0287\7=\2\2\u0287\u0289\5`\61\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0284\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u0308\3\2\2\2\u028c\u028d\7\u00af\2\2\u028d\u0290"+
		"\7\u00a7\2\2\u028e\u028f\t\4\2\2\u028f\u0291\5\u0096L\2\u0290\u028e\3"+
		"\2\2\2\u0290\u0291\3\2\2\2\u0291\u0298\3\2\2\2\u0292\u0293\7l\2\2\u0293"+
		"\u0296\5`\61\2\u0294\u0295\7=\2\2\u0295\u0297\5`\61\2\u0296\u0294\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0292\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u0308\3\2\2\2\u029a\u029b\7\u00af\2\2\u029b\u029e"+
		"\7\37\2\2\u029c\u029d\7l\2\2\u029d\u029f\5`\61\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u0308\3\2\2\2\u02a0\u02a1\7\u00af\2\2\u02a1\u02a2"+
		"\7!\2\2\u02a2\u02a3\t\4\2\2\u02a3\u0308\5\u008eH\2\u02a4\u02a5\7\u00af"+
		"\2\2\u02a5\u02a6\7\u00b3\2\2\u02a6\u02a7\7I\2\2\u02a7\u0308\5\u008eH\2"+
		"\u02a8\u02a9\7\u00af\2\2\u02a9\u02aa\7\u00b3\2\2\u02aa\u02ab\7I\2\2\u02ab"+
		"\u02ac\7\4\2\2\u02ac\u02ad\58\35\2\u02ad\u02ae\7\5\2\2\u02ae\u0308\3\2"+
		"\2\2\u02af\u02b1\7\u00af\2\2\u02b0\u02b2\7)\2\2\u02b1\u02b0\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b6\7\u00a1\2\2\u02b4\u02b5"+
		"\t\4\2\2\u02b5\u02b7\5\u0096L\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2"+
		"\2\u02b7\u0308\3\2\2\2\u02b8\u02b9\7\u00af\2\2\u02b9\u02ba\7\u00a0\2\2"+
		"\u02ba\u02bd\7Q\2\2\u02bb\u02bc\t\4\2\2\u02bc\u02be\5\u0096L\2\u02bd\u02bb"+
		"\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u0308\3\2\2\2\u02bf\u02c0\7\66\2\2"+
		"\u02c0\u0308\5\u008eH\2\u02c1\u02c2\7\65\2\2\u02c2\u0308\5\u008eH\2\u02c3"+
		"\u02c4\7\u00af\2\2\u02c4\u02cb\7N\2\2\u02c5\u02c6\7l\2\2\u02c6\u02c9\5"+
		"`\61\2\u02c7\u02c8\7=\2\2\u02c8\u02ca\5`\61\2\u02c9\u02c7\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c5\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u0308\3\2\2\2\u02cd\u02ce\7\u00af\2\2\u02ce\u0308\7\u00ac\2"+
		"\2\u02cf\u02d0\7\u00ad\2\2\u02d0\u02d1\7\u00ac\2\2\u02d1\u02d2\5\u008e"+
		"H\2\u02d2\u02d3\7\u00d6\2\2\u02d3\u02d4\5V,\2\u02d4\u0308\3\2\2\2\u02d5"+
		"\u02d6\7\u0099\2\2\u02d6\u02d7\7\u00ac\2\2\u02d7\u0308\5\u008eH\2\u02d8"+
		"\u02d9\7\u00b2\2\2\u02d9\u02e2\7\u00bf\2\2\u02da\u02df\5\u0086D\2\u02db"+
		"\u02dc\7\6\2\2\u02dc\u02de\5\u0086D\2\u02dd\u02db\3\2\2\2\u02de\u02e1"+
		"\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02df\3\2\2\2\u02e2\u02da\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u0308\3\2"+
		"\2\2\u02e4\u02e6\7#\2\2\u02e5\u02e7\7\u00d2\2\2\u02e6\u02e5\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u0308\3\2\2\2\u02e8\u02ea\7\u00a2\2\2\u02e9\u02eb"+
		"\7\u00d2\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0308\3\2\2"+
		"\2\u02ec\u02ed\7\u008f\2\2\u02ed\u02ee\5\u0096L\2\u02ee\u02ef\7K\2\2\u02ef"+
		"\u02f0\5\b\5\2\u02f0\u0308\3\2\2\2\u02f1\u02f2\7\62\2\2\u02f2\u02f3\7"+
		"\u008f\2\2\u02f3\u0308\5\u0096L\2\u02f4\u02f5\7@\2\2\u02f5\u02ff\5\u0096"+
		"L\2\u02f6\u02f7\7\u00ca\2\2\u02f7\u02fc\5V,\2\u02f8\u02f9\7\6\2\2\u02f9"+
		"\u02fb\5V,\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u02f6"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0308\3\2\2\2\u0301\u0302\7\66\2\2"+
		"\u0302\u0303\7\\\2\2\u0303\u0308\5\u0096L\2\u0304\u0305\7\66\2\2\u0305"+
		"\u0306\7\u0089\2\2\u0306\u0308\5\u0096L\2\u0307\u00a5\3\2\2\2\u0307\u00a6"+
		"\3\2\2\2\u0307\u00a8\3\2\2\2\u0307\u00ad\3\2\2\2\u0307\u00b9\3\2\2\2\u0307"+
		"\u00c3\3\2\2\2\u0307\u00ca\3\2\2\2\u0307\u00ec\3\2\2\2\u0307\u0106\3\2"+
		"\2\2\u0307\u010d\3\2\2\2\u0307\u0115\3\2\2\2\u0307\u011c\3\2\2\2\u0307"+
		"\u0127\3\2\2\2\u0307\u0138\3\2\2\2\u0307\u0147\3\2\2\2\u0307\u0157\3\2"+
		"\2\2\u0307\u015d\3\2\2\2\u0307\u016b\3\2\2\2\u0307\u0172\3\2\2\2\u0307"+
		"\u018b\3\2\2\2\u0307\u0193\3\2\2\2\u0307\u019a\3\2\2\2\u0307\u01b9\3\2"+
		"\2\2\u0307\u01c1\3\2\2\2\u0307\u01ce\3\2\2\2\u0307\u01dd\3\2\2\2\u0307"+
		"\u01e5\3\2\2\2\u0307\u01e8\3\2\2\2\u0307\u01fd\3\2\2\2\u0307\u0212\3\2"+
		"\2\2\u0307\u0219\3\2\2\2\u0307\u0232\3\2\2\2\u0307\u024c\3\2\2\2\u0307"+
		"\u0255\3\2\2\2\u0307\u026a\3\2\2\2\u0307\u026e\3\2\2\2\u0307\u0272\3\2"+
		"\2\2\u0307\u0277\3\2\2\2\u0307\u027e\3\2\2\2\u0307\u028c\3\2\2\2\u0307"+
		"\u029a\3\2\2\2\u0307\u02a0\3\2\2\2\u0307\u02a4\3\2\2\2\u0307\u02a8\3\2"+
		"\2\2\u0307\u02af\3\2\2\2\u0307\u02b8\3\2\2\2\u0307\u02bf\3\2\2\2\u0307"+
		"\u02c1\3\2\2\2\u0307\u02c3\3\2\2\2\u0307\u02cd\3\2\2\2\u0307\u02cf\3\2"+
		"\2\2\u0307\u02d5\3\2\2\2\u0307\u02d8\3\2\2\2\u0307\u02e4\3\2\2\2\u0307"+
		"\u02e8\3\2\2\2\u0307\u02ec\3\2\2\2\u0307\u02f1\3\2\2\2\u0307\u02f4\3\2"+
		"\2\2\u0307\u0301\3\2\2\2\u0307\u0304\3\2\2\2\u0308\t\3\2\2\2\u0309\u030b"+
		"\5\f\7\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u030d\5\60\31\2\u030d\13\3\2\2\2\u030e\u0310\7\u00d1\2\2\u030f\u0311"+
		"\7\u0094\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2"+
		"\2\u0312\u0317\5@!\2\u0313\u0314\7\6\2\2\u0314\u0316\5@!\2\u0315\u0313"+
		"\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\r\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031d\5\20\t\2\u031b\u031d\5\22\n"+
		"\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\17\3\2\2\2\u031e\u031f"+
		"\5\u0096L\2\u031f\u0322\5t;\2\u0320\u0321\7~\2\2\u0321\u0323\7\177\2\2"+
		"\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0325"+
		"\7\"\2\2\u0325\u0327\5`\61\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u032a\3\2\2\2\u0328\u0329\7\u00d1\2\2\u0329\u032b\5\24\13\2\u032a\u0328"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\21\3\2\2\2\u032c\u032d\7l\2\2\u032d"+
		"\u0330\5\u008eH\2\u032e\u032f\t\5\2\2\u032f\u0331\7\u0091\2\2\u0330\u032e"+
		"\3\2\2\2\u0330\u0331\3\2\2\2\u0331\23\3\2\2\2\u0332\u0333\7\4\2\2\u0333"+
		"\u0338\5\26\f\2\u0334\u0335\7\6\2\2\u0335\u0337\5\26\f\2\u0336\u0334\3"+
		"\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033b\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033c\7\5\2\2\u033c\25\3\2\2"+
		"\2\u033d\u033e\5\u0096L\2\u033e\u033f\7\u00d6\2\2\u033f\u0340\5V,\2\u0340"+
		"\27\3\2\2\2\u0341\u0342\5\u0096L\2\u0342\u0343\5t;\2\u0343\31\3\2\2\2"+
		"\u0344\u0346\5\34\17\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\33\3\2\2\2\u0349\u0347\3\2\2\2\u034a"+
		"\u034b\7g\2\2\u034b\u034f\5(\25\2\u034c\u034f\5*\26\2\u034d\u034f\5,\27"+
		"\2\u034e\u034a\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f\35"+
		"\3\2\2\2\u0350\u0352\5 \21\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\37\3\2\2\2\u0355\u0353\3\2\2"+
		"\2\u0356\u0357\5,\27\2\u0357!\3\2\2\2\u0358\u035b\5$\23\2\u0359\u035b"+
		"\5&\24\2\u035a\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035b#\3\2\2\2\u035c"+
		"\u035d\7\u009c\2\2\u035d\u035e\5V,\2\u035e%\3\2\2\2\u035f\u0362\7D\2\2"+
		"\u0360\u0361\7u\2\2\u0361\u0363\5.\30\2\u0362\u0360\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\'\3\2\2\2\u0364\u0367\7\u00b1\2\2\u0365\u0367\5\u0096L"+
		"\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367)\3\2\2\2\u0368\u036c"+
		"\7\67\2\2\u0369\u036a\7~\2\2\u036a\u036c\7\67\2\2\u036b\u0368\3\2\2\2"+
		"\u036b\u0369\3\2\2\2\u036c+\3\2\2\2\u036d\u036e\7\u009d\2\2\u036e\u036f"+
		"\7\177\2\2\u036f\u0370\7\u0082\2\2\u0370\u0371\7\177\2\2\u0371\u0377\7"+
		"\\\2\2\u0372\u0373\7\33\2\2\u0373\u0374\7\u0082\2\2\u0374\u0375\7\177"+
		"\2\2\u0375\u0377\7\\\2\2\u0376\u036d\3\2\2\2\u0376\u0372\3\2\2\2\u0377"+
		"-\3\2\2\2\u0378\u0379\5\u0096L\2\u0379/\3\2\2\2\u037a\u0385\5\62\32\2"+
		"\u037b\u037c\7\u0086\2\2\u037c\u037d\7\31\2\2\u037d\u0382\5\66\34\2\u037e"+
		"\u037f\7\6\2\2\u037f\u0381\5\66\34\2\u0380\u037e\3\2\2\2\u0381\u0384\3"+
		"\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0386\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0385\u037b\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0389\3\2"+
		"\2\2\u0387\u0388\7m\2\2\u0388\u038a\t\6\2\2\u0389\u0387\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\61\3\2\2\2\u038b\u038c\b\32\1\2\u038c\u038d\5\64"+
		"\33\2\u038d\u039c\3\2\2\2\u038e\u038f\f\4\2\2\u038f\u0391\7^\2\2\u0390"+
		"\u0392\5B\"\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2"+
		"\2\2\u0393\u039b\5\62\32\5\u0394\u0395\f\3\2\2\u0395\u0397\t\7\2\2\u0396"+
		"\u0398\5B\"\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2"+
		"\2\2\u0399\u039b\5\62\32\4\u039a\u038e\3\2\2\2\u039a\u0394\3\2\2\2\u039b"+
		"\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\63\3\2\2"+
		"\2\u039e\u039c\3\2\2\2\u039f\u03b0\58\35\2\u03a0\u03a1\7\u00b6\2\2\u03a1"+
		"\u03b0\5\u008eH\2\u03a2\u03a3\7\u00cc\2\2\u03a3\u03a8\5V,\2\u03a4\u03a5"+
		"\7\6\2\2\u03a5\u03a7\5V,\2\u03a6\u03a4\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03b0\3\2\2\2\u03aa\u03a8\3\2"+
		"\2\2\u03ab\u03ac\7\4\2\2\u03ac\u03ad\5\60\31\2\u03ad\u03ae\7\5\2\2\u03ae"+
		"\u03b0\3\2\2\2\u03af\u039f\3\2\2\2\u03af\u03a0\3\2\2\2\u03af\u03a2\3\2"+
		"\2\2\u03af\u03ab\3\2\2\2\u03b0\65\3\2\2\2\u03b1\u03b3\5V,\2\u03b2\u03b4"+
		"\t\b\2\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5"+
		"\u03b6\7\u0081\2\2\u03b6\u03b8\t\t\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8\67\3\2\2\2\u03b9\u03bb\7\u00aa\2\2\u03ba\u03bc\5B\"\2\u03bb"+
		"\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03c2\5D"+
		"#\2\u03be\u03bf\7\6\2\2\u03bf\u03c1\5D#\2\u03c0\u03be\3\2\2\2\u03c1\u03c4"+
		"\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03ce\3\2\2\2\u03c4"+
		"\u03c2\3\2\2\2\u03c5\u03c6\7K\2\2\u03c6\u03cb\5F$\2\u03c7\u03c8\7\6\2"+
		"\2\u03c8\u03ca\5F$\2\u03c9\u03c7\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce"+
		"\u03c5\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03d1\7\u00d0"+
		"\2\2\u03d1\u03d3\5X-\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d7"+
		"\3\2\2\2\u03d4\u03d5\7S\2\2\u03d5\u03d6\7\31\2\2\u03d6\u03d8\5:\36\2\u03d7"+
		"\u03d4\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03da\7U"+
		"\2\2\u03da\u03dc\5X-\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc9"+
		"\3\2\2\2\u03dd\u03df\5B\"\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03e5\5<\37\2\u03e1\u03e2\7\6\2\2\u03e2\u03e4\5<"+
		"\37\2\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5"+
		"\u03e6\3\2\2\2\u03e6;\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u0411\5> \2\u03e9"+
		"\u03ea\7\u00a3\2\2\u03ea\u03f3\7\4\2\2\u03eb\u03f0\5V,\2\u03ec\u03ed\7"+
		"\6\2\2\u03ed\u03ef\5V,\2\u03ee\u03ec\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0"+
		"\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2"+
		"\2\2\u03f3\u03eb\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u0411\7\5\2\2\u03f6\u03f7\7(\2\2\u03f7\u0400\7\4\2\2\u03f8\u03fd\5V,"+
		"\2\u03f9\u03fa\7\6\2\2\u03fa\u03fc\5V,\2\u03fb\u03f9\3\2\2\2\u03fc\u03ff"+
		"\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff"+
		"\u03fd\3\2\2\2\u0400\u03f8\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2"+
		"\2\2\u0402\u0411\7\5\2\2\u0403\u0404\7T\2\2\u0404\u0405\7\u00ae\2\2\u0405"+
		"\u0406\7\4\2\2\u0406\u040b\5> \2\u0407\u0408\7\6\2\2\u0408\u040a\5> \2"+
		"\u0409\u0407\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u040e\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f\7\5\2\2\u040f"+
		"\u0411\3\2\2\2\u0410\u03e8\3\2\2\2\u0410\u03e9\3\2\2\2\u0410\u03f6\3\2"+
		"\2\2\u0410\u0403\3\2\2\2\u0411=\3\2\2\2\u0412\u041b\7\4\2\2\u0413\u0418"+
		"\5V,\2\u0414\u0415\7\6\2\2\u0415\u0417\5V,\2\u0416\u0414\3\2\2\2\u0417"+
		"\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041c\3\2"+
		"\2\2\u041a\u0418\3\2\2\2\u041b\u0413\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u0420\7\5\2\2\u041e\u0420\5V,\2\u041f\u0412\3\2\2"+
		"\2\u041f\u041e\3\2\2\2\u0420?\3\2\2\2\u0421\u0423\5\u0096L\2\u0422\u0424"+
		"\5R*\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0426\7\24\2\2\u0426\u0427\7\4\2\2\u0427\u0428\5\n\6\2\u0428\u0429\7"+
		"\5\2\2\u0429A\3\2\2\2\u042a\u042b\t\n\2\2\u042bC\3\2\2\2\u042c\u0431\5"+
		"V,\2\u042d\u042f\7\24\2\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0432\5\u0096L\2\u0431\u042e\3\2\2\2\u0431\u0432"+
		"\3\2\2\2\u0432\u0439\3\2\2\2\u0433\u0434\5\u008eH\2\u0434\u0435\7\3\2"+
		"\2\u0435\u0436\7\u00de\2\2\u0436\u0439\3\2\2\2\u0437\u0439\7\u00de\2\2"+
		"\u0438\u042c\3\2\2\2\u0438\u0433\3\2\2\2\u0438\u0437\3\2\2\2\u0439E\3"+
		"\2\2\2\u043a\u043b\b$\1\2\u043b\u043c\5L\'\2\u043c\u044f\3\2\2\2\u043d"+
		"\u044b\f\4\2\2\u043e\u043f\7\'\2\2\u043f\u0440\7f\2\2\u0440\u044c\5L\'"+
		"\2\u0441\u0442\5H%\2\u0442\u0443\7f\2\2\u0443\u0444\5F$\2\u0444\u0445"+
		"\5J&\2\u0445\u044c\3\2\2\2\u0446\u0447\7v\2\2\u0447\u0448\5H%\2\u0448"+
		"\u0449\7f\2\2\u0449\u044a\5L\'\2\u044a\u044c\3\2\2\2\u044b\u043e\3\2\2"+
		"\2\u044b\u0441\3\2\2\2\u044b\u0446\3\2\2\2\u044c\u044e\3\2\2\2\u044d\u043d"+
		"\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"G\3\2\2\2\u0451\u044f\3\2\2\2\u0452\u0454\7[\2\2\u0453\u0452\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0462\3\2\2\2\u0455\u0457\7j\2\2\u0456\u0458\7\u0088"+
		"\2\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0462\3\2\2\2\u0459"+
		"\u045b\7\u009f\2\2\u045a\u045c\7\u0088\2\2\u045b\u045a\3\2\2\2\u045b\u045c"+
		"\3\2\2\2\u045c\u0462\3\2\2\2\u045d\u045f\7L\2\2\u045e\u0460\7\u0088\2"+
		"\2\u045f\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u0453"+
		"\3\2\2\2\u0461\u0455\3\2\2\2\u0461\u0459\3\2\2\2\u0461\u045d\3\2\2\2\u0462"+
		"I\3\2\2\2\u0463\u0464\7\u0082\2\2\u0464\u0472\5X-\2\u0465\u0466\7\u00ca"+
		"\2\2\u0466\u0467\7\4\2\2\u0467\u046c\5\u0096L\2\u0468\u0469\7\6\2\2\u0469"+
		"\u046b\5\u0096L\2\u046a\u0468\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\3\2\2\2\u046e\u046c\3\2\2\2\u046f"+
		"\u0470\7\5\2\2\u0470\u0472\3\2\2\2\u0471\u0463\3\2\2\2\u0471\u0465\3\2"+
		"\2\2\u0472K\3\2\2\2\u0473\u047a\5P)\2\u0474\u0475\7\u00b8\2\2\u0475\u0476"+
		"\5N(\2\u0476\u0477\7\4\2\2\u0477\u0478\5V,\2\u0478\u0479\7\5\2\2\u0479"+
		"\u047b\3\2\2\2\u047a\u0474\3\2\2\2\u047a\u047b\3\2\2\2\u047bM\3\2\2\2"+
		"\u047c\u047d\t\13\2\2\u047dO\3\2\2\2\u047e\u0486\5T+\2\u047f\u0481\7\24"+
		"\2\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482"+
		"\u0484\5\u0096L\2\u0483\u0485\5R*\2\u0484\u0483\3\2\2\2\u0484\u0485\3"+
		"\2\2\2\u0485\u0487\3\2\2\2\u0486\u0480\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"Q\3\2\2\2\u0488\u0489\7\4\2\2\u0489\u048e\5\u0096L\2\u048a\u048b\7\6\2"+
		"\2\u048b\u048d\5\u0096L\2\u048c\u048a\3\2\2\2\u048d\u0490\3\2\2\2\u048e"+
		"\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2\2\2\u0490\u048e\3\2"+
		"\2\2\u0491\u0492\7\5\2\2\u0492S\3\2\2\2\u0493\u04b1\5\u008eH\2\u0494\u0495"+
		"\7\4\2\2\u0495\u0496\5\n\6\2\u0496\u0497\7\5\2\2\u0497\u04b1\3\2\2\2\u0498"+
		"\u0499\7\u00c7\2\2\u0499\u049a\7\4\2\2\u049a\u049f\5V,\2\u049b\u049c\7"+
		"\6\2\2\u049c\u049e\5V,\2\u049d\u049b\3\2\2\2\u049e\u04a1\3\2\2\2\u049f"+
		"\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u049f\3\2"+
		"\2\2\u04a2\u04a5\7\5\2\2\u04a3\u04a4\7\u00d1\2\2\u04a4\u04a6\7\u0087\2"+
		"\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04b1\3\2\2\2\u04a7\u04a8"+
		"\7i\2\2\u04a8\u04a9\7\4\2\2\u04a9\u04aa\5\n\6\2\u04aa\u04ab\7\5\2\2\u04ab"+
		"\u04b1\3\2\2\2\u04ac\u04ad\7\4\2\2\u04ad\u04ae\5F$\2\u04ae\u04af\7\5\2"+
		"\2\u04af\u04b1\3\2\2\2\u04b0\u0493\3\2\2\2\u04b0\u0494\3\2\2\2\u04b0\u0498"+
		"\3\2\2\2\u04b0\u04a7\3\2\2\2\u04b0\u04ac\3\2\2\2\u04b1U\3\2\2\2\u04b2"+
		"\u04b3\5X-\2\u04b3W\3\2\2\2\u04b4\u04b5\b-\1\2\u04b5\u04b7\5\\/\2\u04b6"+
		"\u04b8\5Z.\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04bc\3\2\2"+
		"\2\u04b9\u04ba\7~\2\2\u04ba\u04bc\5X-\5\u04bb\u04b4\3\2\2\2\u04bb\u04b9"+
		"\3\2\2\2\u04bc\u04c5\3\2\2\2\u04bd\u04be\f\4\2\2\u04be\u04bf\7\21\2\2"+
		"\u04bf\u04c4\5X-\5\u04c0\u04c1\f\3\2\2\u04c1\u04c2\7\u0085\2\2\u04c2\u04c4"+
		"\5X-\4\u04c3\u04bd\3\2\2\2\u04c3\u04c0\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5"+
		"\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6Y\3\2\2\2\u04c7\u04c5\3\2\2\2"+
		"\u04c8\u04c9\5f\64\2\u04c9\u04ca\5\\/\2\u04ca\u0506\3\2\2\2\u04cb\u04cc"+
		"\5f\64\2\u04cc\u04cd\5h\65\2\u04cd\u04ce\7\4\2\2\u04ce\u04cf\5\n\6\2\u04cf"+
		"\u04d0\7\5\2\2\u04d0\u0506\3\2\2\2\u04d1\u04d3\7~\2\2\u04d2\u04d1\3\2"+
		"\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\7\30\2\2\u04d5"+
		"\u04d6\5\\/\2\u04d6\u04d7\7\21\2\2\u04d7\u04d8\5\\/\2\u04d8\u0506\3\2"+
		"\2\2\u04d9\u04db\7~\2\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04dd\7Y\2\2\u04dd\u04de\7\4\2\2\u04de\u04e3\5V,"+
		"\2\u04df\u04e0\7\6\2\2\u04e0\u04e2\5V,\2\u04e1\u04df\3\2\2\2\u04e2\u04e5"+
		"\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\3\2\2\2\u04e5"+
		"\u04e3\3\2\2\2\u04e6\u04e7\7\5\2\2\u04e7\u0506\3\2\2\2\u04e8\u04ea\7~"+
		"\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ec\7Y\2\2\u04ec\u04ed\7\4\2\2\u04ed\u04ee\5\n\6\2\u04ee\u04ef\7\5"+
		"\2\2\u04ef\u0506\3\2\2\2\u04f0\u04f2\7~\2\2\u04f1\u04f0\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\7l\2\2\u04f4\u04f7\5\\"+
		"/\2\u04f5\u04f6\7=\2\2\u04f6\u04f8\5\\/\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8"+
		"\3\2\2\2\u04f8\u0506\3\2\2\2\u04f9\u04fb\7c\2\2\u04fa\u04fc\7~\2\2\u04fb"+
		"\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0506\7\177"+
		"\2\2\u04fe\u0500\7c\2\2\u04ff\u0501\7~\2\2\u0500\u04ff\3\2\2\2\u0500\u0501"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\78\2\2\u0503\u0504\7K\2\2\u0504"+
		"\u0506\5\\/\2\u0505\u04c8\3\2\2\2\u0505\u04cb\3\2\2\2\u0505\u04d2\3\2"+
		"\2\2\u0505\u04da\3\2\2\2\u0505\u04e9\3\2\2\2\u0505\u04f1\3\2\2\2\u0505"+
		"\u04f9\3\2\2\2\u0505\u04fe\3\2\2\2\u0506[\3\2\2\2\u0507\u0508\b/\1\2\u0508"+
		"\u050c\5^\60\2\u0509\u050a\t\f\2\2\u050a\u050c\5\\/\6\u050b\u0507\3\2"+
		"\2\2\u050b\u0509\3\2\2\2\u050c\u051b\3\2\2\2\u050d\u050e\f\5\2\2\u050e"+
		"\u050f\t\r\2\2\u050f\u051a\5\\/\6\u0510\u0511\f\4\2\2\u0511\u0512\t\f"+
		"\2\2\u0512\u051a\5\\/\5\u0513\u0514\f\3\2\2\u0514\u0515\7\u00e1\2\2\u0515"+
		"\u051a\5\\/\4\u0516\u0517\f\7\2\2\u0517\u0518\7\26\2\2\u0518\u051a\5d"+
		"\63\2\u0519\u050d\3\2\2\2\u0519\u0510\3\2\2\2\u0519\u0513\3\2\2\2\u0519"+
		"\u0516\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2"+
		"\2\2\u051c]\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u051f\b\60\1\2\u051f\u060e"+
		"\7\177\2\2\u0520\u060e\5l\67\2\u0521\u0522\5\u0096L\2\u0522\u0523\5`\61"+
		"\2\u0523\u060e\3\2\2\2\u0524\u0525\7\u00ee\2\2\u0525\u060e\5`\61\2\u0526"+
		"\u060e\5\u0098M\2\u0527\u060e\5j\66\2\u0528\u060e\5`\61\2\u0529\u060e"+
		"\7\u00e4\2\2\u052a\u060e\7\7\2\2\u052b\u052c\7\u008d\2\2\u052c\u052d\7"+
		"\4\2\2\u052d\u052e\5\\/\2\u052e\u052f\7Y\2\2\u052f\u0530\5\\/\2\u0530"+
		"\u0531\7\5\2\2\u0531\u060e\3\2\2\2\u0532\u0533\7\4\2\2\u0533\u0536\5V"+
		",\2\u0534\u0535\7\6\2\2\u0535\u0537\5V,\2\u0536\u0534\3\2\2\2\u0537\u0538"+
		"\3\2\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053b\7\5\2\2\u053b\u060e\3\2\2\2\u053c\u053d\7\u00a4\2\2\u053d\u053e"+
		"\7\4\2\2\u053e\u0543\5V,\2\u053f\u0540\7\6\2\2\u0540\u0542\5V,\2\u0541"+
		"\u053f\3\2\2\2\u0542\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2"+
		"\2\2\u0544\u0546\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u0547\7\5\2\2\u0547"+
		"\u060e\3\2\2\2\u0548\u0549\5\u008eH\2\u0549\u054a\7\4\2\2\u054a\u054b"+
		"\7\u00de\2\2\u054b\u054d\7\5\2\2\u054c\u054e\5|?\2\u054d\u054c\3\2\2\2"+
		"\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2\2\u054f\u0551\5~@\2\u0550\u054f"+
		"\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u060e\3\2\2\2\u0552\u0553\5\u008eH"+
		"\2\u0553\u055f\7\4\2\2\u0554\u0556\5B\"\2\u0555\u0554\3\2\2\2\u0555\u0556"+
		"\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u055c\5V,\2\u0558\u0559\7\6\2\2\u0559"+
		"\u055b\5V,\2\u055a\u0558\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2"+
		"\2\u055c\u055d\3\2\2\2\u055d\u0560\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0555"+
		"\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u056b\3\2\2\2\u0561\u0562\7\u0086\2"+
		"\2\u0562\u0563\7\31\2\2\u0563\u0568\5\66\34\2\u0564\u0565\7\6\2\2\u0565"+
		"\u0567\5\66\34\2\u0566\u0564\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566\3"+
		"\2\2\2\u0568\u0569\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056b"+
		"\u0561\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056f\7\5"+
		"\2\2\u056e\u0570\5|?\2\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0575"+
		"\3\2\2\2\u0571\u0573\5b\62\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573"+
		"\u0574\3\2\2\2\u0574\u0576\5~@\2\u0575\u0572\3\2\2\2\u0575\u0576\3\2\2"+
		"\2\u0576\u060e\3\2\2\2\u0577\u0578\5\u0096L\2\u0578\u0579\7\b\2\2\u0579"+
		"\u057a\5V,\2\u057a\u060e\3\2\2\2\u057b\u0584\7\4\2\2\u057c\u0581\5\u0096"+
		"L\2\u057d\u057e\7\6\2\2\u057e\u0580\5\u0096L\2\u057f\u057d\3\2\2\2\u0580"+
		"\u0583\3\2\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0585\3\2"+
		"\2\2\u0583\u0581\3\2\2\2\u0584\u057c\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586\u0587\7\5\2\2\u0587\u0588\7\b\2\2\u0588\u060e\5V"+
		",\2\u0589\u058a\7\4\2\2\u058a\u058b\5\n\6\2\u058b\u058c\7\5\2\2\u058c"+
		"\u060e\3\2\2\2\u058d\u058e\7A\2\2\u058e\u058f\7\4\2\2\u058f\u0590\5\n"+
		"\6\2\u0590\u0591\7\5\2\2\u0591\u060e\3\2\2\2\u0592\u0593\7\35\2\2\u0593"+
		"\u0595\5\\/\2\u0594\u0596\5z>\2\u0595\u0594\3\2\2\2\u0596\u0597\3\2\2"+
		"\2\u0597\u0595\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u059a"+
		"\7;\2\2\u059a\u059c\5V,\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059d\u059e\7<\2\2\u059e\u060e\3\2\2\2\u059f\u05a1\7\35"+
		"\2\2\u05a0\u05a2\5z>\2\u05a1\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a1"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a6\7;\2\2\u05a6"+
		"\u05a8\5V,\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2"+
		"\2\u05a9\u05aa\7<\2\2\u05aa\u060e\3\2\2\2\u05ab\u05ac\7\36\2\2\u05ac\u05ad"+
		"\7\4\2\2\u05ad\u05ae\5V,\2\u05ae\u05af\7\24\2\2\u05af\u05b0\5t;\2\u05b0"+
		"\u05b1\7\5\2\2\u05b1\u060e\3\2\2\2\u05b2\u05b3\7\u00c1\2\2\u05b3\u05b4"+
		"\7\4\2\2\u05b4\u05b5\5V,\2\u05b5\u05b6\7\24\2\2\u05b6\u05b7\5t;\2\u05b7"+
		"\u05b8\7\5\2\2\u05b8\u060e\3\2\2\2\u05b9\u05ba\7\23\2\2\u05ba\u05c3\7"+
		"\t\2\2\u05bb\u05c0\5V,\2\u05bc\u05bd\7\6\2\2\u05bd\u05bf\5V,\2\u05be\u05bc"+
		"\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05c4\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05bb\3\2\2\2\u05c3\u05c4\3\2"+
		"\2\2\u05c4\u05c5\3\2\2\2\u05c5\u060e\7\n\2\2\u05c6\u060e\5\u0096L\2\u05c7"+
		"\u060e\7*\2\2\u05c8\u05cc\7,\2\2\u05c9\u05ca\7\4\2\2\u05ca\u05cb\7\u00e5"+
		"\2\2\u05cb\u05cd\7\5\2\2\u05cc\u05c9\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u060e\3\2\2\2\u05ce\u05d2\7-\2\2\u05cf\u05d0\7\4\2\2\u05d0\u05d1\7\u00e5"+
		"\2\2\u05d1\u05d3\7\5\2\2\u05d2\u05cf\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3"+
		"\u060e\3\2\2\2\u05d4\u05d8\7n\2\2\u05d5\u05d6\7\4\2\2\u05d6\u05d7\7\u00e5"+
		"\2\2\u05d7\u05d9\7\5\2\2\u05d8\u05d5\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u060e\3\2\2\2\u05da\u05de\7o\2\2\u05db\u05dc\7\4\2\2\u05dc\u05dd\7\u00e5"+
		"\2\2\u05dd\u05df\7\5\2\2\u05de\u05db\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u060e\3\2\2\2\u05e0\u060e\7.\2\2\u05e1\u05e2\7\u00b4\2\2\u05e2\u05e3"+
		"\7\4\2\2\u05e3\u05e4\5\\/\2\u05e4\u05e5\7K\2\2\u05e5\u05e8\5\\/\2\u05e6"+
		"\u05e7\7I\2\2\u05e7\u05e9\5\\/\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2"+
		"\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\7\5\2\2\u05eb\u060e\3\2\2\2\u05ec\u05ed"+
		"\7}\2\2\u05ed\u05ee\7\4\2\2\u05ee\u05f1\5\\/\2\u05ef\u05f0\7\6\2\2\u05f0"+
		"\u05f2\5p9\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\3\2\2"+
		"\2\u05f3\u05f4\7\5\2\2\u05f4\u060e\3\2\2\2\u05f5\u05f6\7C\2\2\u05f6\u05f7"+
		"\7\4\2\2\u05f7\u05f8\5\u0096L\2\u05f8\u05f9\7K\2\2\u05f9\u05fa\5\\/\2"+
		"\u05fa\u05fb\7\5\2\2\u05fb\u060e\3\2\2\2\u05fc\u05fd\7\4\2\2\u05fd\u05fe"+
		"\5V,\2\u05fe\u05ff\7\5\2\2\u05ff\u060e\3\2\2\2\u0600\u0601\7T\2\2\u0601"+
		"\u060a\7\4\2\2\u0602\u0607\5\u008eH\2\u0603\u0604\7\6\2\2\u0604\u0606"+
		"\5\u008eH\2\u0605\u0603\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2"+
		"\2\u0607\u0608\3\2\2\2\u0608\u060b\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u0602"+
		"\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\7\5\2\2\u060d"+
		"\u051e\3\2\2\2\u060d\u0520\3\2\2\2\u060d\u0521\3\2\2\2\u060d\u0524\3\2"+
		"\2\2\u060d\u0526\3\2\2\2\u060d\u0527\3\2\2\2\u060d\u0528\3\2\2\2\u060d"+
		"\u0529\3\2\2\2\u060d\u052a\3\2\2\2\u060d\u052b\3\2\2\2\u060d\u0532\3\2"+
		"\2\2\u060d\u053c\3\2\2\2\u060d\u0548\3\2\2\2\u060d\u0552\3\2\2\2\u060d"+
		"\u0577\3\2\2\2\u060d\u057b\3\2\2\2\u060d\u0589\3\2\2\2\u060d\u058d\3\2"+
		"\2\2\u060d\u0592\3\2\2\2\u060d\u059f\3\2\2\2\u060d\u05ab\3\2\2\2\u060d"+
		"\u05b2\3\2\2\2\u060d\u05b9\3\2\2\2\u060d\u05c6\3\2\2\2\u060d\u05c7\3\2"+
		"\2\2\u060d\u05c8\3\2\2\2\u060d\u05ce\3\2\2\2\u060d\u05d4\3\2\2\2\u060d"+
		"\u05da\3\2\2\2\u060d\u05e0\3\2\2\2\u060d\u05e1\3\2\2\2\u060d\u05ec\3\2"+
		"\2\2\u060d\u05f5\3\2\2\2\u060d\u05fc\3\2\2\2\u060d\u0600\3\2\2\2\u060e"+
		"\u0619\3\2\2\2\u060f\u0610\f\20\2\2\u0610\u0611\7\t\2\2\u0611\u0612\5"+
		"\\/\2\u0612\u0613\7\n\2\2\u0613\u0618\3\2\2\2\u0614\u0615\f\16\2\2\u0615"+
		"\u0616\7\3\2\2\u0616\u0618\5\u0096L\2\u0617\u060f\3\2\2\2\u0617\u0614"+
		"\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a"+
		"_\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u0623\7\u00e2\2\2\u061d\u0620\7\u00e3"+
		"\2\2\u061e\u061f\7\u00c3\2\2\u061f\u0621\7\u00e2\2\2\u0620\u061e\3\2\2"+
		"\2\u0620\u0621\3\2\2\2\u0621\u0623\3\2\2\2\u0622\u061c\3\2\2\2\u0622\u061d"+
		"\3\2\2\2\u0623a\3\2\2\2\u0624\u0625\7X\2\2\u0625\u0629\7\u0081\2\2\u0626"+
		"\u0627\7\u009a\2\2\u0627\u0629\7\u0081\2\2\u0628\u0624\3\2\2\2\u0628\u0626"+
		"\3\2\2\2\u0629c\3\2\2\2\u062a\u062b\7\u00bc\2\2\u062b\u062c\7\u00d5\2"+
		"\2\u062c\u0631\5l\67\2\u062d\u062e\7\u00bc\2\2\u062e\u062f\7\u00d5\2\2"+
		"\u062f\u0631\5`\61\2\u0630\u062a\3\2\2\2\u0630\u062d\3\2\2\2\u0631e\3"+
		"\2\2\2\u0632\u0633\t\16\2\2\u0633g\3\2\2\2\u0634\u0635\t\17\2\2\u0635"+
		"i\3\2\2\2\u0636\u0637\t\20\2\2\u0637k\3\2\2\2\u0638\u063a\7_\2\2\u0639"+
		"\u063b\t\f\2\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063c\3\2"+
		"\2\2\u063c\u063d\5`\61\2\u063d\u0640\5n8\2\u063e\u063f\7\u00be\2\2\u063f"+
		"\u0641\5n8\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641m\3\2\2\2\u0642"+
		"\u0643\t\21\2\2\u0643o\3\2\2\2\u0644\u0645\t\22\2\2\u0645q\3\2\2\2\u0646"+
		"\u064f\7\4\2\2\u0647\u064c\5t;\2\u0648\u0649\7\6\2\2\u0649\u064b\5t;\2"+
		"\u064a\u0648\3\2\2\2\u064b\u064e\3\2\2\2\u064c\u064a\3\2\2\2\u064c\u064d"+
		"\3\2\2\2\u064d\u0650\3\2\2\2\u064e\u064c\3\2\2\2\u064f\u0647\3\2\2\2\u064f"+
		"\u0650\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\7\5\2\2\u0652s\3\2\2\2"+
		"\u0653\u0654\b;\1\2\u0654\u0655\7\23\2\2\u0655\u0656\7\u00d8\2\2\u0656"+
		"\u0657\5t;\2\u0657\u0658\7\u00da\2\2\u0658\u0683\3\2\2\2\u0659\u065a\7"+
		"q\2\2\u065a\u065b\7\u00d8\2\2\u065b\u065c\5t;\2\u065c\u065d\7\6\2\2\u065d"+
		"\u065e\5t;\2\u065e\u065f\7\u00da\2\2\u065f\u0683\3\2\2\2\u0660\u0661\7"+
		"\u00a4\2\2\u0661\u0662\7\4\2\2\u0662\u0663\5\u0096L\2\u0663\u066a\5t;"+
		"\2\u0664\u0665\7\6\2\2\u0665\u0666\5\u0096L\2\u0666\u0667\5t;\2\u0667"+
		"\u0669\3\2\2\2\u0668\u0664\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2"+
		"\2\2\u066a\u066b\3\2\2\2\u066b\u066d\3\2\2\2\u066c\u066a\3\2\2\2\u066d"+
		"\u066e\7\5\2\2\u066e\u0683\3\2\2\2\u066f\u067b\5x=\2\u0670\u0671\7\4\2"+
		"\2\u0671\u0676\5v<\2\u0672\u0673\7\6\2\2\u0673\u0675\5v<\2\u0674\u0672"+
		"\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677"+
		"\u0679\3\2\2\2\u0678\u0676\3\2\2\2\u0679\u067a\7\5\2\2\u067a\u067c\3\2"+
		"\2\2\u067b\u0670\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u0683\3\2\2\2\u067d"+
		"\u067e\7_\2\2\u067e\u067f\5n8\2\u067f\u0680\7\u00be\2\2\u0680\u0681\5"+
		"n8\2\u0681\u0683\3\2\2\2\u0682\u0653\3\2\2\2\u0682\u0659\3\2\2\2\u0682"+
		"\u0660\3\2\2\2\u0682\u066f\3\2\2\2\u0682\u067d\3\2\2\2\u0683\u0688\3\2"+
		"\2\2\u0684\u0685\f\b\2\2\u0685\u0687\7\23\2\2\u0686\u0684\3\2\2\2\u0687"+
		"\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689u\3\2\2\2"+
		"\u068a\u0688\3\2\2\2\u068b\u068e\7\u00e5\2\2\u068c\u068e\5t;\2\u068d\u068b"+
		"\3\2\2\2\u068d\u068c\3\2\2\2\u068ew\3\2\2\2\u068f\u0694\7\u00ec\2\2\u0690"+
		"\u0694\7\u00ed\2\2\u0691\u0694\7\u00ee\2\2\u0692\u0694\5\u008eH\2\u0693"+
		"\u068f\3\2\2\2\u0693\u0690\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0692\3\2"+
		"\2\2\u0694y\3\2\2\2\u0695\u0696\7\u00cf\2\2\u0696\u0697\5V,\2\u0697\u0698"+
		"\7\u00bb\2\2\u0698\u0699\5V,\2\u0699{\3\2\2\2\u069a\u069b\7F\2\2\u069b"+
		"\u069c\7\4\2\2\u069c\u069d\7\u00d0\2\2\u069d\u069e\5X-\2\u069e\u069f\7"+
		"\5\2\2\u069f}\3\2\2\2\u06a0\u06a1\7\u008a\2\2\u06a1\u06ac\7\4\2\2\u06a2"+
		"\u06a3\7\u008b\2\2\u06a3\u06a4\7\31\2\2\u06a4\u06a9\5V,\2\u06a5\u06a6"+
		"\7\6\2\2\u06a6\u06a8\5V,\2\u06a7\u06a5\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9"+
		"\u06a7\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab\u06a9\3\2"+
		"\2\2\u06ac\u06a2\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06b8\3\2\2\2\u06ae"+
		"\u06af\7\u0086\2\2\u06af\u06b0\7\31\2\2\u06b0\u06b5\5\66\34\2\u06b1\u06b2"+
		"\7\6\2\2\u06b2\u06b4\5\66\34\2\u06b3\u06b1\3\2\2\2\u06b4\u06b7\3\2\2\2"+
		"\u06b5\u06b3\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5"+
		"\3\2\2\2\u06b8\u06ae\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba"+
		"\u06bc\5\u0080A\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bd"+
		"\3\2\2\2\u06bd\u06be\7\5\2\2\u06be\177\3\2\2\2\u06bf\u06c0\7\u0092\2\2"+
		"\u06c0\u06d0\5\u0082B\2\u06c1\u06c2\7\u00a5\2\2\u06c2\u06d0\5\u0082B\2"+
		"\u06c3\u06c4\7\u0092\2\2\u06c4\u06c5\7\30\2\2\u06c5\u06c6\5\u0082B\2\u06c6"+
		"\u06c7\7\21\2\2\u06c7\u06c8\5\u0082B\2\u06c8\u06d0\3\2\2\2\u06c9\u06ca"+
		"\7\u00a5\2\2\u06ca\u06cb\7\30\2\2\u06cb\u06cc\5\u0082B\2\u06cc\u06cd\7"+
		"\21\2\2\u06cd\u06ce\5\u0082B\2\u06ce\u06d0\3\2\2\2\u06cf\u06bf\3\2\2\2"+
		"\u06cf\u06c1\3\2\2\2\u06cf\u06c3\3\2\2\2\u06cf\u06c9\3\2\2\2\u06d0\u0081"+
		"\3\2\2\2\u06d1\u06d2\7\u00c4\2\2\u06d2\u06db\7\u008e\2\2\u06d3\u06d4\7"+
		"\u00c4\2\2\u06d4\u06db\7H\2\2\u06d5\u06d6\7)\2\2\u06d6\u06db\7\u00a4\2"+
		"\2\u06d7\u06d8\5V,\2\u06d8\u06d9\t\23\2\2\u06d9\u06db\3\2\2\2\u06da\u06d1"+
		"\3\2\2\2\u06da\u06d3\3\2\2\2\u06da\u06d5\3\2\2\2\u06da\u06d7\3\2\2\2\u06db"+
		"\u0083\3\2\2\2\u06dc\u06dd\7J\2\2\u06dd\u06e1\t\24\2\2\u06de\u06df\7\u00c2"+
		"\2\2\u06df\u06e1\t\25\2\2\u06e0\u06dc\3\2\2\2\u06e0\u06de\3\2\2\2\u06e1"+
		"\u0085\3\2\2\2\u06e2\u06e3\7d\2\2\u06e3\u06e4\7k\2\2\u06e4\u06e8\5\u0088"+
		"E\2\u06e5\u06e6\7\u0093\2\2\u06e6\u06e8\t\26\2\2\u06e7\u06e2\3\2\2\2\u06e7"+
		"\u06e5\3\2\2\2\u06e8\u0087\3\2\2\2\u06e9\u06ea\7\u0093\2\2\u06ea\u06f1"+
		"\7\u00c5\2\2\u06eb\u06ec\7\u0093\2\2\u06ec\u06f1\7$\2\2\u06ed\u06ee\7"+
		"\u0097\2\2\u06ee\u06f1\7\u0093\2\2\u06ef\u06f1\7\u00ab\2\2\u06f0\u06e9"+
		"\3\2\2\2\u06f0\u06eb\3\2\2\2\u06f0\u06ed\3\2\2\2\u06f0\u06ef\3\2\2\2\u06f1"+
		"\u0089\3\2\2\2\u06f2\u06f8\5V,\2\u06f3\u06f4\5\u0096L\2\u06f4\u06f5\7"+
		"\13\2\2\u06f5\u06f6\5V,\2\u06f6\u06f8\3\2\2\2\u06f7\u06f2\3\2\2\2\u06f7"+
		"\u06f3\3\2\2\2\u06f8\u008b\3\2\2\2\u06f9\u06fe\7\u00aa\2\2\u06fa\u06fe"+
		"\7\64\2\2\u06fb\u06fe\7]\2\2\u06fc\u06fe\5\u0096L\2\u06fd\u06f9\3\2\2"+
		"\2\u06fd\u06fa\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fc\3\2\2\2\u06fe\u008d"+
		"\3\2\2\2\u06ff\u0704\5\u0096L\2\u0700\u0701\7\3\2\2\u0701\u0703\5\u0096"+
		"L\2\u0702\u0700\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702\3\2\2\2\u0704"+
		"\u0705\3\2\2\2\u0705\u008f\3\2\2\2\u0706\u0704\3\2\2\2\u0707\u070b\7."+
		"\2\2\u0708\u070b\7+\2\2\u0709\u070b\5\u0092J\2\u070a\u0707\3\2\2\2\u070a"+
		"\u0708\3\2\2\2\u070a\u0709\3\2\2\2\u070b\u0091\3\2\2\2\u070c\u070d\7\u00c9"+
		"\2\2\u070d\u0712\5\u0096L\2\u070e\u070f\7\u00a0\2\2\u070f\u0712\5\u0096"+
		"L\2\u0710\u0712\5\u0096L\2\u0711\u070c\3\2\2\2\u0711\u070e\3\2\2\2\u0711"+
		"\u0710\3\2\2\2\u0712\u0093\3\2\2\2\u0713\u0718\5\u0096L\2\u0714\u0715"+
		"\7\6\2\2\u0715\u0717\5\u0096L\2\u0716\u0714\3\2\2\2\u0717\u071a\3\2\2"+
		"\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u0095\3\2\2\2\u071a\u0718"+
		"\3\2\2\2\u071b\u0721\7\u00e8\2\2\u071c\u0721\7\u00ea\2\2\u071d\u0721\5"+
		"\u009aN\2\u071e\u0721\7\u00eb\2\2\u071f\u0721\7\u00e9\2\2\u0720\u071b"+
		"\3\2\2\2\u0720\u071c\3\2\2\2\u0720\u071d\3\2\2\2\u0720\u071e\3\2\2\2\u0720"+
		"\u071f\3\2\2\2\u0721\u0097\3\2\2\2\u0722\u0726\7\u00e6\2\2\u0723\u0726"+
		"\7\u00e7\2\2\u0724\u0726\7\u00e5\2\2\u0725\u0722\3\2\2\2\u0725\u0723\3"+
		"\2\2\2\u0725\u0724\3\2\2\2\u0726\u0099\3\2\2\2\u0727\u0728\t\27\2\2\u0728"+
		"\u009b\3\2\2\2\u00ec\u00b2\u00b7\u00bd\u00c1\u00cf\u00d3\u00d7\u00db\u00e3"+
		"\u00e7\u00ea\u00f1\u00fa\u0100\u0104\u010a\u0111\u011a\u0120\u012b\u0132"+
		"\u013c\u0143\u014b\u0153\u015b\u0160\u0166\u016f\u0178\u017d\u0181\u0189"+
		"\u0190\u019d\u01a0\u01aa\u01ad\u01b4\u01bd\u01c3\u01c8\u01cc\u01d6\u01d9"+
		"\u01e3\u01f0\u01f6\u01fb\u0201\u020a\u0210\u0217\u021f\u0224\u0228\u0230"+
		"\u0236\u023d\u0242\u0246\u0250\u0253\u0257\u025a\u0262\u0267\u027c\u0282"+
		"\u0288\u028a\u0290\u0296\u0298\u029e\u02b1\u02b6\u02bd\u02c9\u02cb\u02df"+
		"\u02e2\u02e6\u02ea\u02fc\u02ff\u0307\u030a\u0310\u0317\u031c\u0322\u0326"+
		"\u032a\u0330\u0338\u0347\u034e\u0353\u035a\u0362\u0366\u036b\u0376\u0382"+
		"\u0385\u0389\u0391\u0397\u039a\u039c\u03a8\u03af\u03b3\u03b7\u03bb\u03c2"+
		"\u03cb\u03ce\u03d2\u03d7\u03db\u03de\u03e5\u03f0\u03f3\u03fd\u0400\u040b"+
		"\u0410\u0418\u041b\u041f\u0423\u042e\u0431\u0438\u044b\u044f\u0453\u0457"+
		"\u045b\u045f\u0461\u046c\u0471\u047a\u0480\u0484\u0486\u048e\u049f\u04a5"+
		"\u04b0\u04b7\u04bb\u04c3\u04c5\u04d2\u04da\u04e3\u04e9\u04f1\u04f7\u04fb"+
		"\u0500\u0505\u050b\u0519\u051b\u0538\u0543\u054d\u0550\u0555\u055c\u055f"+
		"\u0568\u056b\u056f\u0572\u0575\u0581\u0584\u0597\u059b\u05a3\u05a7\u05c0"+
		"\u05c3\u05cc\u05d2\u05d8\u05de\u05e8\u05f1\u0607\u060a\u060d\u0617\u0619"+
		"\u0620\u0622\u0628\u0630\u063a\u0640\u064c\u064f\u066a\u0676\u067b\u0682"+
		"\u0688\u068d\u0693\u06a9\u06ac\u06b5\u06b8\u06bb\u06cf\u06da\u06e0\u06e7"+
		"\u06f0\u06f7\u06fd\u0704\u070a\u0711\u0718\u0720\u0725";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}