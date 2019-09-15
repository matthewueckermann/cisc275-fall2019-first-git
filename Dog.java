public class Dog extends Animal{

	
	public Dog(String name, int numLegs){
		super(name, numLegs);
	}
	
	@Override
	public String toString(){
		return name;
	}

}