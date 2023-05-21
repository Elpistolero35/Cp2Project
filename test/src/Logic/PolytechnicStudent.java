
package Logic;


public class PolytechnicStudent extends Member{
    private String Major;
    private String team;

    public PolytechnicStudent( String firstName, String surname, String address, String phone, String gender, String birthDate,String Major, String team) {
        super(firstName, surname, address, phone, gender, birthDate);
        this.Major = Major;
        this.team = team;
    }

    @Override
    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        this.Major = major;
    }

    @Override
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    
}
