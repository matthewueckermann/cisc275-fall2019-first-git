public class Animal{
	protected String name;
	protected int numLegs;
	
	public Animal(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public int getLegs(){
		return numLegs;
	}
	
}