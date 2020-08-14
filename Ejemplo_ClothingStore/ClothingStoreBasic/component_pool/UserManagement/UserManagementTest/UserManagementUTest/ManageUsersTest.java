import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;

import controllers.admin.ManageUsers;
import controllers.Shipping;


public class ManageUsersTest extends Mockito{

	ManageUsers myServlet =new ManageUsers();

	@Mock
	HttpServletRequest request;
	@Mock
	HttpServletResponse response;
	@Mock
	HttpSession session ;


	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	/*B-@TestManageUsers*/
	
}








