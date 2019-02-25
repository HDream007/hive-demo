package com.rimi.hivedemo.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * hive 连接 数据库 操作
 */
public class ConnectHive {
    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    public static void main(String[] args) throws Exception {
        Class.forName(driverName);
        Connection connection = DriverManager.getConnection("jdbc:hive2://hd01:10000/hive2");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from h6");
       while(resultSet.next()){
           int i = resultSet.getInt(1);
           String s = resultSet.getString(2);
           System.out.println(i+" , "+s);
       }
        resultSet.close();
    }
}
