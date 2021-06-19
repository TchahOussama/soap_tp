package sud.server;

import javax.xml.ws.Endpoint;

import sud.webservices.ProductsManagerImpl;


public class ServicePublisher {
	
	public static void main(String[] args) {
		String url = "http://localhost:8081/";
		
		Endpoint.publish(url, new ProductsManagerImpl());
		System.out.println("**** Server started ****");
	}
	

}