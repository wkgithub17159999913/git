package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {

	public static Connection getConn() {
		String URL = "jdbc:mysql://192.168.0.223:3306/hqxj006?useUnicode=true&amp;characterEncoding=utf-8";
		String USER = "hqxj006";
		String PASSWORD = "1q2w3e4r";
		Connection conn = null;
		// 1.������������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2.������ݿ�����
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
