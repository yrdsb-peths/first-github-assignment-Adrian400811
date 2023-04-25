public class Cat extends Pet{

	private String color;

	public Cat(String name, int age, String theColor){
		super(name, age);
		color = theColor;
	}

	public String getName(){
		return super.getName();
	}

	public int getAge(){
		return super.getAge();
	}

	public String getColor(){
		return color;
	}
}
