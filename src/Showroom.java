import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_manager;
    String showroom_location;
    String showroom_address;
    int showroom_total_employees;
    int showroom_total_cars_in_stock = 0;

    @Override
    public void get_details() {
        System.out.println("SHOWROOM NAME: " + showroom_name);
        System.out.println("SHOWROOM MANAGER: " + showroom_manager);
        System.out.println("SHOWROOM LOCATION: " + showroom_location);
        System.out.println("SHOWROOM ADDRESS: " + showroom_address);
        System.out.println("TOTAL EMPLOYEES: " + showroom_total_employees);
        System.out.println("TOTAL CARS IN STOCK: " + showroom_total_cars_in_stock);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================== *** ENTER SHOWROOM DETAILS *** ==============================");
        System.out.println();
        System.out.print("ENTER SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.print("ENTER SHOWROOM MANAGER: ");
        showroom_manager = sc.nextLine();
        System.out.print("ENTER SHOWROOM LOCATION: ");
        showroom_location = sc.nextLine();
        System.out.print("ENTER SHOWROOM ADDRESS: ");
        showroom_address = sc.nextLine();
        System.out.print("ENTER TOTAL NO. OF EMPLOYEES: ");
        showroom_total_employees = sc.nextInt();
        System.out.print("ENTER TOTAL NO. OF CARS IN STOCK: ");
        showroom_total_cars_in_stock = sc.nextInt();
    }
}
