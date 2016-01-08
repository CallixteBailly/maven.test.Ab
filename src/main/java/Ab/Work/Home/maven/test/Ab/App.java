package Ab.Work.Home.maven.test.Ab;

import java.io.IOException;

import javax.json.stream.JsonGenerationException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class App 
{

    public static void main( String[] args )
    {
    	Person p1 = new Person(1,"Billy","Jhon", 0611112204 ,175,"Malgache");
    	System.out.print(convertObjToString(p1));
        
    }
	public static String convertObjToString(Object obj) 
	{
		ObjectMapper mapper = new ObjectMapper();
		String jsonToString = "";
		try {
			jsonToString = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonToString;
	}
}
