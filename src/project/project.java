package project;

public class project {
	private int projectId;
	private String projectName;
	private String headOfTheProject;
	private int numOfMember;
	
	public project(int projectId,String projectName,String headOfTheProject,int numOfMember) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.headOfTheProject = headOfTheProject;
		this.numOfMember = numOfMember;
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName ) {
		this.projectName = projectName;
	}
	public String getHeadOfTheProject() {
		return headOfTheProject;
	}
	public void setHeadOfTheProject(String headOfTheProject) {
		this.headOfTheProject = headOfTheProject;
	}
	public int getNumOfMember() {
		return numOfMember;
	}
	public void setNumOfMember(int numOfMember) {
		this.numOfMember = numOfMember;
	}

}
