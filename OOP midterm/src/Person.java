public class Person{
    //attributes, instance variales, states
    private  String name, address, phoneNumber, email;

    //constructor
    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //mutators and accessors
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public  String getName(){
        return name;
    }

    public  String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    //method
    public String toString(){
        return name + " , " + getAddress() + " , " + getPhoneNumber() + " , " + getEmail();
    }

    public static void main(String[] args) {
        Person n = new Person("Kajal");
        n.setAddress("hen");
        n.setPhoneNumber("3424");
        n.setEmail("ef234f");
        

        System.out.print(n.toString());

    }
}