package java;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldServer extends ServerResource{
	
	@Get("json")
		public String represent() {
		return "hello, world";
	}
	
}
