package learn;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebClientOptions;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;


public class Test1 {
	@Test
	public void test1(){
		WebClient webClient = new WebClient();
		WebClientOptions options = webClient.getOptions();
		options.setCssEnabled(false);
		
		try {
			HtmlPage mainPage = webClient.getPage("http://www.baidu.com");
			HtmlForm form = mainPage.getFormByName("f");
			HtmlTextInput input = form.getInputByName("kw");
			HtmlSubmitInput submit = form.getInputByValue("百度一下");
			input.setText("123");
			HtmlPage result = submit.click();
			System.out.println(result.asXml());
			
		} catch (FailingHttpStatusCodeException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2(){
		WebClient webClient = new WebClient();
		WebClientOptions options = webClient.getOptions();
		options.setCssEnabled(false);
		
		try {
			HtmlPage mainPage = webClient.getPage("http://localhost/php_learn/input.html");
			HtmlForm form = mainPage.getFormByName("f");
			HtmlTextInput input_a = form.getInputByName("a");
			HtmlTextInput input_b = form.getInputByName("b");
			HtmlTextInput input_c = form.getInputByName("c");
			
			HtmlSubmitInput submit = form.getInputByValue("submit");
			input_a.setText("123");
			input_b.setText("321");
			HtmlPage result = submit.click();
			System.out.println(result.asXml());
			
		} catch (FailingHttpStatusCodeException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
 