
public class Lait extends Decorateur {
	public Lait(Decorateur decorateur) {
		super(decorateur);
	}
	
	@Override
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
