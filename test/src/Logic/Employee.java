package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String firstName;
    private String surname;
    private String address;
    private String phone;
    private Double salary;
    private String gender;
    private static int counter;

    public Employee(String firstName, String surname, String address, String phone, Double salary, String gender) {
        this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
        this.surname = Character.toUpperCase(surname.charAt(0)) + surname.substring(1);
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.gender = gender;
        this.id = counter;
        counter++;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
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
        this.firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String Surname) {
        this.surname = Character.toUpperCase(Surname.charAt(0)) + Surname.substring(1);
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    
    
    public static void saveEmpId() {
        try {
            FileWriter fw = new FileWriter("src/Save/empId.txt");
            fw.write(String.valueOf(counter));
            fw.close();
        } catch (IOException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    public static void loadEmpId() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Save/empId.txt"));
            counter = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
            counter = 1;
            System.out.println("Error occured: " + e.getMessage());
        }
    }
    
}
