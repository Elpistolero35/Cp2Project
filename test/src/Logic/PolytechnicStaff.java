
package Logic;

import java.util.Date;

public class PolytechnicStaff extends Member{
    
    private String position;
    private String department;

    public PolytechnicStaff( String firstName, String surname, String address, String phone, String gender, String birthDate,String position, String department) {
        super( firstName, surname, address, phone, gender, birthDate);
        this.position = Character.toUpperCase(position.charAt(0)) + position.substring(1);
        this.department = Character.toUpperCase(department.charAt(0)) + department.substring(1);
    }
    
    
    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
    
}
