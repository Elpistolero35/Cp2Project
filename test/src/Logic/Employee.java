package Logic;

public class Employee {

    private int id;
    private String firstName;
    private String surname;
    private String address;
    private String phone;
    private String salary;
    private String gender;
    private static int counter = 1;

    public Employee(String firstName, String surname, String address, String phone, String salary, String gender) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.gender = gender;
        this.id = counter;
        counter++;
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
        return firstName + " " + surname;
    }

    public void setFullName() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return surname;
    }

    public void setLastName(String lastName) {
        this.surname = lastName;
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
