public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
Date d=new Date();
Student s=new Student(1,"asd t",d,75);
s.getId();
s.setId(3);
s.getFullName();
s.setFullName("akshi");
s.getBirthDate();
//s.setBirthDate(1997-8-28);
s.getAvgMarks();
s.setAvgMarks(85);
StudentGroup sg=new StudentGroup();
sg.getStudents();

	}

}
