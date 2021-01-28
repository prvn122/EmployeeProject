package project;

public class projectMain {
	public static void main(String[] args) {
		project myProject = new project(111,"Bank Application","Praveen kumar",50);
		System.out.println("ProjectId is: " + myProject.getProjectId());
		System.out.println("The name of the project is: " + myProject.getProjectName());
		System.out.println("The Head Of The Project is:" + myProject.getHeadOfTheProject());
		System.out.println("There are " + myProject.getNumOfMember() + " members in the project");
		
	}
}
