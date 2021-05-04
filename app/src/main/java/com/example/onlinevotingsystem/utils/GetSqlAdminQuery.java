package com.example.onlinevotingsystem.utils;

import com.example.onlinevotingsystem.constants.TableKeys;

public class GetSqlAdminQuery {

    public static String getCreateQuery(){
        return "CREATE TABLE  IF NOT EXISTS "+ TableKeys.TABLE_NAME_ADMIN+
                "(`"+TableKeys.KEY_ADMIN_USERNAME+"` varchar(50) NOT NULL," +
                "`"+TableKeys.KEY_ADMIN_NAME+"`  varchar(50) NOT NULL," +
                "`"+TableKeys.KEY_ADMIN_PASSWORD+"`  varchar(50) NOT NULL," +
                "`"+TableKeys.KEY_ADMIN_PHOTO_URL+"` varchar(50) NOT NULL," +
                "PRIMARY KEY (`"+TableKeys.KEY_ADMIN_USERNAME+"`))";
    }

    public static String GetInsertQuery(String username, String password, String name, String photourl){

        return "INSERT INTO `" + TableKeys.TABLE_NAME_ADMIN +
                "` VALUES ('" + username + "','"  + password + "','" + name + "','" + photourl + "','" + photourl +")";
    }

    public static String GetAuthenticateQuery(String username , String password){
        return " SELECT *  FROM " + TableKeys.TABLE_NAME_ADMIN + " WHERE " + TableKeys.KEY_ADMIN_USERNAME + " = " + username + " and " + TableKeys.KEY_ADMIN_PASSWORD + " = " + password + " )";
    }
}
