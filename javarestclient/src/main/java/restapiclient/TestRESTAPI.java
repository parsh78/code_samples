package restapiclient;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class TestRESTAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpResponse<String> httpResponse;
		try {
			httpResponse = Unirest.get("https://ipinfo.io/json").asString();
			System.out.println( httpResponse.getBody());
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			  
		
	}

}
