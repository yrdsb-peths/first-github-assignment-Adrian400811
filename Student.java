public class Student{
	private String name;
	private int age;
	private int grade;
	private int volunteerHours;

	public Student(String theName, int theAge, int theGrade, int theVol){
		name = theName;
		age = theAge;
		grade = theGrade;
		volunteerHours = theVol;
	}

	public toString(){
		System.out.println("Student, "+name+", aged "+age+" in grade "+grade+" has "+volunteerHours+" volunteer hours.");
	}
}
