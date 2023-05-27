package Logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

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

    /**
     * Writes employee data from the GymSystem.getEmployeesList() variable to a
     * binary file named "Employees.dat" in the "src/Save" directory.
     *
     * @author Ali Fardan
     */
    public static void WriteEmployee() throws IOException {
        try ( FileOutputStream fileOut = new FileOutputStream("src/Save/Employees.dat")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(GymSystem.getEmployeesList());
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    /**
     * Reads employee data from a binary file named "Employees.dat" in the
     * "src/Save" directory and sets the employeesList variable of the GymSystem
     * class to the read data.
     *
     * @author Ali Fardan
     */
    public static void ReadEmployees() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fileIn = new FileInputStream("src/Save/Employees.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            GymSystem.setEmployeesList((ArrayList<Employee>) in.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    /**
     * Writes the member data from the GymSystem.getMembersList() variable to a
     * binary file named "Members.dat" in the "src/Save" directory.
     *
     * @author Ali Fardan
     */
    public static void WriteMember() throws IOException {
        try ( FileOutputStream fileOut = new FileOutputStream("src/Save/Members.dat")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(GymSystem.getMembersList());
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    /**
     * Reads member data from a binary file named "Members.dat" in the
     * "src/Save" directory and sets the membersList variable of the GymSystem
     * class to the read data.
     *
     * @author Ali Fardan
     */
    public static void ReadMembers() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fileIn = new FileInputStream("src/Save/Members.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            GymSystem.setMembersList((ArrayList<Member>) in.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

    /**
     * Generates a marketing report for polytechnic staff and students and
     * writes the report to a file named "marketingReport.txt".
     *
     * @author Noman
     */
    public static void generateMarketingReport() {
        Path filePath = Paths.get("marketingReport.txt");
        Charset charset = StandardCharsets.UTF_8;

        try ( BufferedWriter bufferedWriter = Files.newBufferedWriter(filePath, charset)) {
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            int totalStaff = 0;

            // Write formatted data using print writer
            printWriter.println("Polytechnic Staffs:");
            for (Member mem : GymSystem.getMembersList()) {
                if (mem instanceof PolytechnicStaff) {
                    printWriter.write("Full Name:" + mem.getFullName());
                    printWriter.println();
                    printWriter.write("Address:" + mem.getAddress());
                    printWriter.println();
                    printWriter.write("Phone:" + mem.getPhone());
                    printWriter.println();
                    printWriter.write("Position:" + ((PolytechnicStaff) mem).getPosition());
                    printWriter.println();
                    printWriter.write("Department:" + ((PolytechnicStaff) mem).getDepartment());
                    printWriter.println();
                    totalStaff++;
                }
            }
            printWriter.write("Total amount of Staff: " + totalStaff);
            printWriter.println();
            printWriter.println();
            printWriter.write("Polytechnic Students:");
            for (Member mem : GymSystem.getMembersList()) {
                if (mem instanceof PolytechnicStudent) {
                    printWriter.write("Full Name:" + mem.getFullName());
                    printWriter.println();
                    printWriter.write("Address:" + mem.getAddress());
                    printWriter.println();
                    printWriter.write("Phone:" + mem.getPhone());
                    printWriter.println();
                    printWriter.write("Major:" + ((PolytechnicStudent) mem).getMajor());
                    printWriter.println();
                    printWriter.write("Sport Team:" + ((PolytechnicStudent) mem).getTeam());
                    printWriter.println();
                }
            }
            printWriter.write("Total amount of Students: " + (GymSystem.getMembersList().size() - totalStaff));
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }

    /**
     * Loads a startup file and populates the system with employee and member
     * data if the "Members.dat" or "Employees.dat" files do not exist.
     *
     * @author Noman
     */
    public static void loadStartupFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File memberFile = new File("src/Save/Members.dat");
        File employeeFile = new File("src/Save/Employees.dat");
        if (employeeFile.exists() || memberFile.exists()) {
            GymSystem.ReadMembers();
            GymSystem.ReadEmployees();
        } else {
            // load the startup file and use it to populate the system
            File startupFile = new File("src/Save/startup.txt");
            Scanner scan = new Scanner(startupFile);
            int totalEmployees = scan.nextInt();
            scan.nextLine(); // skip the newline character after the number of employees
            for (int i = 0; i < totalEmployees; i++) {
                String employe = scan.nextLine();
                if (employe.equalsIgnoreCase("E")) {
                    String firstName = scan.nextLine();
                    String lastName = scan.nextLine();
                    String address = scan.nextLine();
                    String phone = scan.nextLine();
                    double salary = scan.nextDouble();
                    scan.nextLine();
                    Employee employee = new Employee(firstName, lastName, address, phone, salary);
                    GymSystem.getEmployeesList().add(employee);
                } else if (employe.equalsIgnoreCase("PT")) {
                    String firstName = scan.nextLine();
                    String lastName = scan.nextLine();
                    String address = scan.nextLine();
                    String phone = scan.nextLine();
                    double salary = scan.nextDouble();
                    scan.nextLine();
                    Employee employee = new PersonalTrainer(firstName, lastName, address, phone, salary);
                    GymSystem.getEmployeesList().add(employee);
                    int totalMembers = scan.nextInt();
                    scan.nextLine();
                    for (int j = 0; j < totalMembers; j++) {
                        String memberType = scan.nextLine();
                        if (memberType.equalsIgnoreCase("staff")) {
                            String firstNameMem = scan.nextLine();
                            String lastNameMem = scan.nextLine();
                            String addressMem = scan.nextLine();
                            String birthDateMem = scan.nextLine();
                            String phoneMem = scan.nextLine();
                            String genderMem = scan.nextLine();
                            String positionMem = scan.nextLine();
                            String departmentMem = scan.nextLine();
                            Member member = new PolytechnicStaff(firstNameMem, lastNameMem, addressMem, phoneMem, genderMem, birthDateMem, positionMem, departmentMem);
                            GymSystem.getMembersList().add(member);
                            ((PersonalTrainer) employee).getMembers().add(member);
                        } else if (memberType.equalsIgnoreCase("student")) {
                            String firstNameMem = scan.nextLine();
                            String lastNameMem = scan.nextLine();
                            String addressMem = scan.nextLine();
                            String birthDateMem = scan.nextLine();
                            String phoneMem = scan.nextLine();
                            String genderMem = scan.nextLine();
                            String majorMem = scan.nextLine();
                            String teamMem = scan.nextLine();
                            Member member = new PolytechnicStudent(firstNameMem, lastNameMem, addressMem, phoneMem, genderMem, birthDateMem, majorMem, teamMem);
                            ((PersonalTrainer) employee).getMembers().add(member);
                            GymSystem.getMembersList().add(member);
                        }

                    }
                }
            }
        }
        GymSystem.WriteMember();
        GymSystem.WriteEmployee();
    }

}
