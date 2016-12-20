package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;

import junit.framework.TestCase;

public class helloTest extends TestCase {

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() {
		try {
			// 创建Servlet的运行环境
			ServletRunner servletRunner = new ServletRunner();
			servletRunner.registerServlet("hello", hello.class.getName());
			ServletUnitClient servletUnitClient = servletRunner.newClient();

			// 模仿用户访问http://localhost:8080/test/hello
			WebRequest webRequest = new GetMethodWebRequest("http://localhost:8080/test/hello");
			WebResponse webResponse = servletUnitClient.getResource(webRequest);
			Assert.assertTrue(webResponse.getText().equals("hello world"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
