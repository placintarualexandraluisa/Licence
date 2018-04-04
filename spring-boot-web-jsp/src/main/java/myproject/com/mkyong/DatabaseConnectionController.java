//package myproject.com.mkyong;
//
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//
//@Controller
//public class DatabaseConnectionController {
//
//	// inject via application.properties
//	@Value("${welcome.message:test}")
//	private String message = "Hello World";
//
//	@RequestMapping("/")
//	public String welcome(Model model) {
//		
//		Database database = new Database();
//		
//		model.addAttribute("database", database);
//	    return "welcome";
//	}
//	
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	public String saveOrUpdateUser(@ModelAttribute("database") Database database,
//			BindingResult result, Model model) {
//		DatabaseConnection pg = new DatabaseConnection();
//		DatabaseConnection.createConnection(database.getHost(), database.getPort(),database.getSid(), database.getUsername(),database.getPassword());
//				return "welcome";
//	}
//	
//	
//
//}