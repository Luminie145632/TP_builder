
public class Caramel extends Decorateur {
	public Caramel(Decorateur decorateur) {
		super(decorateur);
	}
	
	@override
	public string description() {
		super.description();
		return Boisson.boisson;
	}
	
	@Override
	public double cout() {
		super.cout();
		return Boisson.boisson;
	}

}
