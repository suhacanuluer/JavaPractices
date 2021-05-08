package Day2Hw1;

public class Student {
	
	private int id;
	private Course course;
	private String fullName;
	private String picture;
	
	public Student(int id, String fullName, String picture) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.picture = picture;
	}
	
	public int getId() {
		return id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}
