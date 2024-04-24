
public class Main {
	public static void main(String[] args) {
		Lait lait = new LaitConcret();
		lait.operation();
		
		System.out.println("---");
		
		Sucre sucre = new SucreConcret(new LaitConcret());
		sucre.operation();
		
		System.out.println("---")
		
		Caramel caramel = new CaramelConcret(new SucreConcret(new LaitConcret()));
		caramel.operation();
		
	}

}
