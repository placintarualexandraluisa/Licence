//package myproject.com.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import myproject.com.dao.DatabaseConnectionDao;
//import myproject.com.model.Database;
//
//@Service
//public class DatabaseConnectionService {
//	
//	@Autowired
//	private DatabaseConnectionDao databaseConnectionDao;
//	
//	public void addDatabase(String host, String port, String sid, String username, String password)
//	{
//		Database database=new Database();
//		database.setHost(host);
//		database.setPort(port);
//		database.setSid(sid);
//		database.setUsername(username);
//		database.setPassword(password);
//		databaseConnectionDao.addDatabase(database);
//		
//	}
//	
//	
//}
