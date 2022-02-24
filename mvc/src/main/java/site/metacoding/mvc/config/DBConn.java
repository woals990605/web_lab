package site.metacoding.mvc.config;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {
	
	//책임 : 이미 만들어진 Connection 객체를 return
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
			System.out.println("DB연결 성공");
			//etc.
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
		
		return conn;
	}
}
