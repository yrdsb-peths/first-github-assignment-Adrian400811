public class Pet{

	private String name;
	private int age;

	public Pet(String theName, int theAge){
		name = theName;
		age = theAge;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public toString(){
		System.out.println(name+" is "+age+" years old.");
	}
}
