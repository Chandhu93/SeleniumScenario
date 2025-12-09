package LamdaExpressionAndStreamAPI;


 public class Runner {
	public static void main(String[] args) {
		SingleTonClass.obj(11, "NaraHari");
		SingleTonClass.obj(10, "Hari");
		
		System.out.println(SingleTonClass.refVar.id);
		System.out.println(SingleTonClass.refVar.name);
		System.out.println(SingleTonClass.refVar.id);
		System.out.println(SingleTonClass.refVar.name);
	}
	
}







