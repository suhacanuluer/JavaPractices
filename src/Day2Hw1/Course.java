package Day2Hw1;

public class Course {
	
	private int id;
	private String title;
	private String instructor;
	private String picture;
	
	public Course(int id, String title, String instructor, String picture) {
		this.id = id;
		this.title = title;
		this.instructor = instructor;
		this.picture = picture;
	}

	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}
