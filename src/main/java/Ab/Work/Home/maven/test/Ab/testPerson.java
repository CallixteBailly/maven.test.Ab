package Ab.Work.Home.maven.test.Ab;

import org.junit.Test;

import junit.framework.Assert;

public class testPerson {

	@Test
	public void test() {
		
    	Person p1 = new Person(1,"Billy","Jhon", 0611112204 ,175,"Malgache");
    	
    	String res = "{\"id\":1,\"firstName\":\"Billy\",\"lastName\":\"Jhon\",\"numberPhone\":1.03060612E8,\"size\":175,\"origin\":\"Malgache\"}";
    	
    	
    	Assert.assertEquals(res, App.convertObjToString(p1));
	}

}
