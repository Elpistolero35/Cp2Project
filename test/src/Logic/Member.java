
package Logic;

public class Member {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String gender;
    private String birthDate;
    private static int counter = 1;
    public Member() {

    }

    public Member( String firstName, String lastName, String address, String phone, String gender, String birthDate) {
        this.id = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.birthDate = birthDate;
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
        return "";
    }
   
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

}
