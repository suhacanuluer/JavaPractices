package Day2Hw1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "English Course", "Natalie Nikolac", "picture1");
		Course course2 = new Course(2, "Programing Course", "Engin Demiroğ", "picture2");
		
		Student student1 = new Student(1, "Süha Can Uluer", "picture1");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		studentManager.addCourse(student1, course1);
		studentManager.addCourse(student1, course2);

	}

}
