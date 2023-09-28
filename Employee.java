import java.util.ArrayList;

class Employee {
    private String Name;
    private String Position;
    private int EmpID;
    private ArrayList<Project> Projects;

    public Employee(String name, String position, int empid) {
        this.Name = name;
        this.Position = position;
        this.EmpID = empid;
        this.Projects = new ArrayList<>();
    }

    public void getEmployeeDetails() {
        System.out.println("Name: " + this.Name);
        System.out.println("Position: " + this.Position);
        System.out.println("EmpID: " + this.EmpID);
        System.out.println("Projects:");
        for (Project project : this.Projects) {
            System.out.println(project.getProjectName() + project.getProjectDescription());
        }
    }

    public void addProject(Project project) {
        this.Projects.add(project);
    }
}

class Project {
    private String ProjectName;
    private String ProjectDescription;

    public Project(String ProjectName, String ProjectDescription) {
        this.ProjectName = ProjectName;
        this.ProjectDescription = ProjectDescription;
    }

    public String getProjectName() {
        return this.ProjectName;
    }

    public String getProjectDescription() {
        return this.ProjectDescription;
    }
}
