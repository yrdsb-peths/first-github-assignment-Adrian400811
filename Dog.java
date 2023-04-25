public class Dog extends Pet{

	private String type;

	public Dog(String name, int age, String theType){
		super(name, age);
		type = theType;
	}

	public String getName(){
		return super.getName();
	}

	public int getAge(){
		return super.getAge();
	}

	public String getType(){
		return type;
	}
}
