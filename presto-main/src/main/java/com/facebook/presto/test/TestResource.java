/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.test;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import static com.facebook.presto.server.security.RoleType.ADMIN;
import static com.facebook.presto.server.security.RoleType.USER;

/**
 * Created by houping wang on 2021/7/12
 * test http request
 *
 * @author houping wang
 */
@Path("/v1/hoping")
@RolesAllowed({USER, ADMIN})
public class TestResource
{
    @Inject
    public TestResource()
    {
    }

    @GET
    @Path("test")
    public Response test()
    {
        return Response.ok("Hello world").build();
    }

//
//    @GET
//    @Path("workerMemory")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getWorkerMemoryInfo()
//    {
//        TestInfo testInfo = new TestInfo();
//        testInfo.setId(UUID.randomUUID().toString());
//        testInfo.setCode(0);
//        testInfo.setName("王厚平");
//        return Response.ok()
//                .entity(testInfo)
//                .build();
//    }

    public static class TestInfo
    {
        private String name;

        private String id;

        private Integer code;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public Integer getCode()
        {
            return code;
        }

        public void setCode(Integer code)
        {
            this.code = code;
        }
    }
}
