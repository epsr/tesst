package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.meterware.servletunit.ServletRunner;

import junit.framework.TestCase;

public class helloTest extends TestCase  {

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
		ServletRunner sr = new ServletRunner();
	}

}
