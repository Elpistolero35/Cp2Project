package Logic;

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

    public static void addMembers(Member members) {
       membersList.add(members);
    }

    public static void addEmployees(Employee employees) {
        employeesList.add(employees);
    }
    
    
    
}
