package Logic;

import java.util.ArrayList;

public class PersonalTrainer extends Employee {

    private ArrayList<Member> members;

    public PersonalTrainer(String firstName, String surname, String address, String phone, String salary, String gender) {
        super(firstName, surname, address, phone, salary, gender);
        this.members = new ArrayList<Member>();
    }

   

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

}
