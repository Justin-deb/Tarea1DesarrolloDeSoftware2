package solid.interfaceSegregation.fixed;

public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.work();
    employee.eat();
    Robot robot = new Robot();
    robot.work();
    }
}
