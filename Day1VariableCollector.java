public class Day1VariableCollector{

	private String message="Hello";
	private int age=25;
	private boolean student=true;
	private long phoneNumber=555_5555;
	private char myGrade='a';


	public void setMessage(String newMessage){
		message=newMessage;
	}
	public String getMessage(){
		return message;
	}

	public void setAge(int newAge){
		age=newAge;
	}
	public int getAge(){
		return age;
	}

	public void setStudent(boolean newStudent){
		student=newStudent;
	}
	public boolean getStudent(){
		return student;
	}

	public void setPhoneNumber(long newPhoneNumber){
		phoneNumber=newPhoneNumber;
	}
	public long getPhoneNumber(){
		return phoneNumber;
	}

	public void setMyGrade(char newMyGrade){
		myGrade=newMyGrade;
	}
	public char getMyGrade(){
		return myGrade;
	}
}
