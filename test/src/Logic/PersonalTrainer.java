
package Logic;

import java.util.ArrayList;

public class PersonalTrainer extends Employee{
    private ArrayList<Member> members;

    public PersonalTrainer(int id, String firstName, String lastName, String address, String phone, String salary) {
        super(id, firstName, lastName, address, phone, salary);
        this.members = new ArrayList<Member>();
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    
    
}
