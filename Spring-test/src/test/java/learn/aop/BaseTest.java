package learn.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest extends Base {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appconfig/aop.xml");
		
		Base base = applicationContext.getBean(Base.class);
		base.run();
	}

}
