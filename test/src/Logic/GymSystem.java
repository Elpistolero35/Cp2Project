package Logic;

import java.util.ArrayList;



public class GymSystem {

    static ArrayList<Member> members = new ArrayList<Member>();
    static ArrayList<Employee> employees = new ArrayList<Employee>();
    
    
    //Manging the members
    public static boolean addMember(Member member) {

        return true;
    }

    public static boolean editMember(Member member) {

        return true;
    }

    public static boolean removeMember(Member member) {

        return true;
    }
    
    //Mangaing the employees
    public static boolean addEmployee(Employee employee) {

        return true;
    }

    public static boolean editEmployee(Employee employee) {

        return true;
    }

    public static boolean removeEmployee(Employee employee) {

        return true;
    }
    
    //Manging the gym
    public static boolean assignMemberToTrainer(Member member, PersonalTrainer trainer) {

        return true;
    }
    public static boolean removeMemberFromTrainer(Member member, PersonalTrainer trainer) {

        return true;
    }
    
    //Data Manuplation
    public static ArrayList<Member> getMembersByTrainer(PersonalTrainer trainer) {
        ArrayList<Member> trainerMemberList = new ArrayList<Member>();
        
        return trainerMemberList;
    }
    
    public static void generateMarketingReport() {

    }
    
    public static void loadInitialData() {

    }
    
    public static void saveData() {

    }
    public static void exitProgram() {

    }
}
