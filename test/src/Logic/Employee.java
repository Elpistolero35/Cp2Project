package Logic;



public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String salary;

    public Employee(int id, String firstName, String lastName, String address, String phone, String salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    
    //Getters and setter (Auto generated)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //Full Name implementation
    public String getFullName() {
        return "";
    }
   
    public void setFullName() {
        
    }
    //////
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
