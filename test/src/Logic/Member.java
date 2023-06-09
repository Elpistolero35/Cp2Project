package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Member implements Serializable {

    private static final long serialVersionUID = 2L;
    private int id;
    private String firstName;
    private String surname;
    private String address;
    private String phone;
    private String gender;
    private String birthDate;
    private static int counter = 1;

    public Member() {

    }

    public Member(String firstName, String surname, String address, String phone, String gender, String birthDate) {
        this.id = counter;
        this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
        this.surname = Character.toUpperCase(surname.charAt(0)) + surname.substring(1);
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
        return firstName + " " + surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String lastName) {
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

    public String getPosition() {
        return "";
    }

    public String getDepartment() {
        return "";
    }

    public String getMajor() {
        return "";
    }

    public String getTeam() {
        return "";
    }
    
    /**
 * Saves the current member ID to a file named "memId.txt" in the "src/Save" directory.
 * @author Ali Fardan
 */
    public static void saveMemberId() {
        try {
            FileWriter fw = new FileWriter("src/Save/memId.txt");
            fw.write(String.valueOf(counter));
            fw.close();
        } catch (IOException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    /**
 * Loads the current member ID from the "memId.txt" file in the "src/Save" directory
 * and assigns it to the counter variable.
 * @author Ali Fardan
 */
    public static void loadMemberId() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Save/memId.txt"));
            counter = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
            counter = 1;
            System.out.println("Error occured: " + e.getMessage());
        }
    }
    
    

}
