//Jan 23-2023-P1
package JavaSessions;

public class Car 
{
	//class variables or global variables
	String name;
	String color;
	int price;
	String model;
	
	
	public static void main(String[] args) 
	{
		//int a=10; local variable
	 //create an object : using new keyword
		
	Car c1=new Car();
	c1.name="BMW";
	c1.color="Blue";
	c1.price=80;
	c1.model="520d";

	Car c2=new Car();
	c2.name="AUDI";
	c2.color="White";
	c2.price=75;
	c2.model="Q5";
	
	System.out.println(c1.name+" "+c1.color+" "+c1.price +" "+c1.model);
	System.out.println(c2.name+" "+c2.color+" "+c2.price +" "+c2.model);
	
	// no reference objects
	new Car().name="honda";
	new Car().model="CRV";
	new Car().price=76;
	new Car().color="Black";
	
	//Null reference object:
	Car c3=new Car();
	c3=null;
	
	
	
	//System.gc();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
