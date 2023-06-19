

public class Employee extends Person {
    //attributes
    private static int officeNum;
    private static double salary;
    
    //constructor
    public Employee(){

    }

    public Employee(String name, String address, String phoneNumber, String email, int officeNum, double salary){
        super(name, address, phoneNumber, email);
        this.officeNum = officeNum;
        this.salary = salary;
    }

    //accessors and mutators
    public void setOfficeNume(int officeNum){
        this.officeNum = officeNum;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public static int getOfficeNum(){
        return officeNum;
    }

    public static double getSalary(){
        return salary;
    }


    //method
    @Override
    public String toString(){
        return super.toString() + " , " + officeNum + " , " + salary;
    }

    public static void main(String[] args) {
        // Person n = new Person("k", "hne", "342", "werrre32");
        Employee e = new Employee("k", "fdgr", "sdf", "dfwe32", 23, 12.43);
        System.out.print(e.toString());
    }
}
