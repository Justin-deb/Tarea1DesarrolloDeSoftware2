package solid.interfaceSegregation.fixed;

public class Employee implements Worker, Eater{
    
public Employee() {
   
}
    @Override
    public void work() {
        System.out.println("Employee is working");
    }
     @Override
    public void eat() {
        System.out.println("Employee is eating");
    }
    
}
