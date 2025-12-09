package singletonSample;

public class Singleton {

	int a;
	int b;
	public static Singleton ref;
	private Singleton(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	public static Singleton getObject(int a, int b ) {
		if(ref == null) {
			ref= new Singleton(a,b);
		}
		return ref;
	}


}
