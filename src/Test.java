import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@Value(value = "${JDBC.Driver}")
	private String driver;

	@Value(value = "${JDBC.URL}")
	private String URL;

	@Value(value = "${JDBC.User}")
	private String user;

	@Value(value = "${JDBC.Pass}")
	private String pass;

	void connect() {

		try {

			System.out.println(driver);
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(URL, user, pass);
			System.out.println("Connection Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.getBean("testObject", Test.class).connect();

	}
}
