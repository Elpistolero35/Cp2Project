package Logic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GymSystem {

    static ArrayList<Member> membersList = new ArrayList<Member>();
    static ArrayList<Employee> employeesList = new ArrayList<Employee>();

    public static ArrayList<Member> getMembersList() {
        return membersList;
    }

    public static ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public static void setMembersList(ArrayList<Member> membersList) {
        GymSystem.membersList = membersList;
    }

    public static void setEmployeesList(ArrayList<Employee> employeesList) {
        GymSystem.employeesList = employeesList;
    }

    public static void WriteEmployee() throws IOException {
        try ( FileOutputStream fileOut = new FileOutputStream("src/Save/Employees.dat")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(GymSystem.getEmployeesList()); // serializes​
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    public static void ReadEmployees() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fileIn = new FileInputStream("src/Save/Employees.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            GymSystem.setEmployeesList((ArrayList<Employee>) in.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    public void WriteMember() throws IOException {
        try ( FileOutputStream fileOut = new FileOutputStream("src/Save/Members.dat")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(GymSystem.getMembersList());
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    public void ReadMembers() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fileIn = new FileInputStream("src/Save/Members.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            GymSystem.setMembersList((ArrayList<Member>) in.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

}
