public class Faculty extends Employee{
    private static String department;
    private static String rank;

    public Faculty(String department, String rank){
        super(getOfficeNum(), getSalary());
        this.department = department;
        this.rank = rank;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public static String getDepartment(){
        return department;
    }

    public static String getRank(){
        return rank;
    }

    @Override
    public String toString(){
        return super.toString() + " , " + department + " , " + rank;
    }

    public static void main(String[] args) {
        Person p = new Person("sd", "we", "as", "vb");
        Employee e = new Employee(234, 12.23);
        Faculty f = new Faculty("serw", "sdf");
        System.out.println(f.toString());
    }
    
}
