//package myproject.com.dao;
//
//import java.sql.DriverManager;
//
//import myproject.com.model.Database;
//import myproject.com.model.DatabaseConnection;
//
//public class DatabaseConnectionDao {
//
//	public static void createConnection(DatabaseConnection db, Database database ) {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			String oracleHome = System.getenv("ORACLE_HOME");
//			String tnsAdmin = oracleHome + "/NETWORK/ADMIN/";
//			System.setProperty("oracle.net.tns_admin", tnsAdmin);
//			db.setDbUrl("jdbc:oracle:thin:@"+database.getHost()+":"+database.getPort()+":"+database.getSid());
//			db.setConnection(DriverManager.getConnection(db.getDbUrl(), database.getUsername(), database.getPassword()));
//			db.getConnection().setAutoCommit(false);
//			System.out.println("S-a efectuat conexiunea la baza de date");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//			
//	}
//	 public static void closeConnection(DatabaseConnection db) {
//		 try {
//			 if ( db.getConnection()!=null ) {
//				 db.getConnection().close();
//				 System.out.println("Conexiunea la baza de date a fost inchisa");
//			 }
//		 } catch (Exception ex) {
//			 ex.printStackTrace();
//	 }
//	 }
//}
