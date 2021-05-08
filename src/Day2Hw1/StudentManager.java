package Day2Hw1;

public class StudentManager {

	public void add(Student student) {
		System.out.println("A student named " + student.getFullName() + " was added.");
	}
	
	public void addCourse(Student student, Course course) {
		System.out.println(student.getFullName() + " enrolled in the " + course.getTitle());
	}
}
