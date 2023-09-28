public class Main {
public static void main(String[] args) {
        Employee Employee0001 = new Employee("Tom", "UX/UI", 0001);
        Employee0001.addProject(new Project("Web A :", " Developing a web application"));
        Employee0001.addProject(new Project("Mobile app A :", " Developing a mobile app"));

        Employee Employee0002 = new Employee("Tim", "FrontEnd", 0002);
        Employee0002.addProject(new Project("Web A :", " Developing a web application"));

        Employee0001.getEmployeeDetails();
        Employee0002.getEmployeeDetails();
    }
}