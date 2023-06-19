public class Staff extends Employee{
    private String title;

    public Staff(){

    }

    public Staff(String name, String address, String phoneNumber, String email, int officeNum, double salary, String title){
        super(name, address, phoneNumber, email, officeNum, salary);
        this.title = title;
    }

    public void setTitle(String title){
        this.title =title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return super.toString() + " , " + title;
    }

    public static void main(String[] args) {
        Person p = new Person("e", "qw", "as", "nh");
        // Employee e = new Employee(234, 12.23);
        // Staff s = new Staff("nurse");
        // System.out.print(s.toString());
    }


    
}
