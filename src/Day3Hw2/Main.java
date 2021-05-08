package Day3Hw2;

public class Main {

	public static void main(String[] args) {
		// polymorphism
		
		StudentUser suha = new StudentUser();
		suha.fullName = "Süha Can Uluer";
		
		StudentUser ahmet = new StudentUser();
		ahmet.fullName = "Ahmet Can Uluer";
		
		StudentUser mehmet = new StudentUser();
		mehmet.fullName = "Mehmet Can Uluer";
		
		InstructorUser engin = new InstructorUser();
		engin.fullName = "Engin Demiroğ";
		
		UserManager userManager = new UserManager();
		userManager.add(suha);
		userManager.add(engin);
		
		User students[] = {ahmet, mehmet};
		userManager.addMultiple(students);
	}

}
