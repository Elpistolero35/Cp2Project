
package Logic;


public class PolytechnicStudent extends Member{
    private String Major;
    private String team;

    public PolytechnicStudent( String firstName, String lastName, String address, String phone, String gender, String birthDate,String Major, String team) {
        super(firstName, lastName, address, phone, gender, birthDate);
        this.Major = Major;
        this.team = team;
    }

    
    
    //Getters and setter (Auto generated)
    public String getCourse() {
        return Major;
    }

    public void setCourse(String course) {
        this.Major = course;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    
}
