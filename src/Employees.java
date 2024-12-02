import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility {
    String emp_id;
    String emp_name;
    String emp_department;

    @Override
    public void get_details() {
        System.out.println("EMPLOYEE ID: " + emp_id);
        System.out.println("EMPLOYEE NAME: " + emp_name);
        System.out.println("EMPLOYEE DEPARTMENT: " + emp_department);
        System.out.println("SHOWROOM NAME: " + showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        emp_id = UUID.randomUUID().toString();
        System.out.println("=============================== *** ENTER EMPLOYEE DETAILS *** ==============================");
        System.out.println();
        System.out.print("ENTER EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.print("ENTER EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("ENTER SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
    }
}
