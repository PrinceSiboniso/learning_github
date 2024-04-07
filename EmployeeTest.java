import java.time.*;

public class EmployeeTest {


    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee(" prince", 75000,1987,12,15);
        staff[1]= new Employee("Herry", 50000, 1989,10,1);
        staff[2]= new Employee("Tony",4000,1990,3,15);
        // raise evewryones salary by 5%
        for (Employee e: staff)
           e.raiseSalary(5);

        // print out information about all employee objects 
        for (Employee e : staff)
        System.out.println(" name =" +e.getName()+ ",salary ="+e.getSalary()+ ", hireDay = "+ e.getHireDay());


    }
    
}

class Employee{
    private String name;
    private double salary ;
    private LocalDate hireDay;
    public Employee(String n , double s , int year ,int month , int day )
    {
        name = n;
        salary =s ;
        hireDay = LocalDate.of(year , month , day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
   public void raiseSalary(double byPercentage){

    double raise= salary*byPercentage/100;
    salary+=raise;
   } 

}
