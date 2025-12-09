package LamdaExpressionAndStreamAPI;

public class SingleTonClass {
	public static SingleTonClass refVar=null;
	int id;
	String name;
	

	private SingleTonClass(int id, String name) {
		this.id =id;
		this.name= name;
	}

	public static void obj(int id, String name) {
		if(refVar== null) {
			refVar = new SingleTonClass(id, name) ;
		}
	}
}

