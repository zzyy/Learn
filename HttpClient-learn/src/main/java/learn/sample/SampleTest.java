package learn.sample;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

public class SampleTest {
	
	@Test
	public void PostMethod01(){
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://www.expediapartnercentral.com.lisqa7.sb.karmalab.net/contentmain/photometrics.json");
		post.addHeader("Accept", "application/json");
		post.addHeader("Content-Type", "application/json");
		HttpEntity entity = new InputStreamEntity(new ByteArrayInputStream("{\"propertyId\":12628}".getBytes()), "{\"propertyId\":12628}".getBytes().length, ContentType.APPLICATION_JSON);
		post.setEntity(entity);
		
		try {
			HttpResponse res = client.execute(post);
			System.out.println(res.getStatusLine().getStatusCode());
			HttpEntity resEntity = res.getEntity();
			InputStream in = resEntity.getContent();
			
//			DataInputStream dis = new DataInputStream(in);
//			System.out.println(dis.readUTF());
			
			BufferedReader read = new BufferedReader(new InputStreamReader(in));
			String resStr = read.readLine();
			
			Pattern.compile("\"pendingPhoto\": \\d+ ,").matcher(resStr);
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
