public class Student extends Person{
     //attributes
    private String status;

    //constructor
    public Student(){

    }

    public Student(String name, String address, String phoneNumber, String email ,String status){
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    //mutators and accessors
    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    //method
    @Override
    public String toString(){
        return super.toString() + " , " + status;
    }
    

    
}
