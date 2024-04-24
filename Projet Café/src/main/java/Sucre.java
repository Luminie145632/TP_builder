
public class Sucre extends Decorateur{
	public Sucre(Decorateur decorateur) {
		super(decorateur);
	}
	
	@Override
	public string  descripton() {
		super.description();
		return Boisson.boisson;
	}
	
	@Override
	public double cout() {
		super.cout();
		return Boisson.boisson;
	}

}