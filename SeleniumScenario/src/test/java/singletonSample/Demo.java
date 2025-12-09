package singletonSample;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(Singleton.getObject(1900, 12).a);
		System.out.println(Singleton.getObject(1900, 33).b);    //Object is created only once 
		System.out.println(Singleton.getObject(92300, 00).a);	//And inilization is done 1st only	
		System.out.println(Singleton.getObject(92300, 99).b);
	}

}
