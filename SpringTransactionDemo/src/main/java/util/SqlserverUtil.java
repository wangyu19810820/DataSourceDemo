package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by admin on 2017/8/31.
 */
public class SqlserverUtil {

    public static void main(String[] args)  {
        try {
            String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driverName);
            String dbURL="jdbc:sqlserver://192.168.1.6:1433;DatabaseName=test";
            String userName="sa";
            String userPwd="Java~123456";
            Connection dbConn= DriverManager.getConnection(dbURL,userName,userPwd);
            String sql = "SELECT * FROM [dbo].[TEST]";
            ResultSet rs = dbConn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String s = rs.getString("aa");
                System.out.println(s);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
