package SpringPackage;

import java.sql.Statement;
import javax.annotation.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentDAO {
	
//	private String driver = "com.mysql.jdbc.driver";
	@Value("${student.url}")
	private String url;
	
	@Value("${student.username}")
	private String username;
	
	@Value("${student.password}")
	private String password;
	
	Connection conn;
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException{
		Connection conn = DriverManager.getConnection(url, username, password);
		
	}

	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		Statement statement = conn.createStatement();
		String getAllRowString = "select * from HostelStudentInfo";
		ResultSet rs =  statement.executeQuery(getAllRowString);
		
		while(rs.next()) {
			int student_id =  rs.getInt(1);
			String student_name = rs.getString(2);
			int hostelfee = rs.getInt(3);
			String foodType = rs.getString(4);
			
			System.out.println("STUDENT ID :"+student_id+", STUDENT NAME :"+student_name+", HOSTEL FEE :"+hostelfee+", FOOD TYPE:"+foodType);;
		}
	}
	
	
	public void deleteStudentRecord(int student_id) throws SQLException {
		
		Statement statement = conn.createStatement();
		
		String deleteQuery = "delete from HostelStudentInfo where student_id="+student_id+";";
		statement.executeUpdate(deleteQuery);
		
		System.out.println(deleteQuery);
		System.out.println("SUCCESSFULLY DELETED "+student_id);
	}
	
	@PreDestroy
	public void closeConnection() throws SQLException{
		conn.close();
	}
	

}
