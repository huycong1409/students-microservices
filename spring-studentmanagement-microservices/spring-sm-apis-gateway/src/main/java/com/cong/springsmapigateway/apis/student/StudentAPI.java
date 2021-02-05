package com.cong.springsmapigateway.apis.student;

public class StudentAPI {

    public final static String API_ROOT = "api/student";
    public final static String GET_STUDENTS = "/all";



    public static String buildURI(String apiName) {
        return API_ROOT + apiName;
    }

}
