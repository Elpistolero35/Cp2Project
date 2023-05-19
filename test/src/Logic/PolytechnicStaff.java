
package Logic;

import java.util.Date;

public class PolytechnicStaff extends Member{
    
    private String position;
    private String department;

    public PolytechnicStaff(int id, String firstName, String lastName, String address, String phone, String gender, String birthDate,String position, String department) {
        super(id, firstName, lastName, address, phone, gender, birthDate);
        this.position = position;
        this.department = department;
    }
    
    
    //Getters and setter (Auto generated)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
    
}
