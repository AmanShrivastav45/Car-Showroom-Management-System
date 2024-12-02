import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_company;
    String car_model_name;
    String car_color;
    String car_fuel;
    int car_top_speed;
    int car_seats;
    int car_showroom_price;

    @Override
    public void get_details() {
        System.out.println("CAR COMPANY: " + car_company);
        System.out.println("CAR NAME: " + car_model_name);
        System.out.println("CAR COLOR: " + car_color);
        System.out.println("CAR FUEL: " + car_fuel);
        System.out.println("TOP SPEED: " + car_top_speed);
        System.out.println("TOTAL SEATS: " + car_seats);
        System.out.println("SHOWROOM PRICE: " + car_showroom_price);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================= *** ENTER CAR DETAILS *** =================================");
        System.out.println();
        System.out.print("ENTER CAR COMPANY: ");
        car_company = sc.nextLine();
        System.out.print("ENTER MODEL NAME: ");
        car_model_name = sc.nextLine();
        System.out.print("ENTER CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.print("ENTER CAR FUEL TYPE (PETROL/DIESEL/CNG) : ");
        car_fuel = sc.nextLine();
        System.out.print("ENTER TOP SPEED: ");
        car_top_speed = sc.nextInt();
        System.out.print("ENTER TOTAL SEATS: ");
        car_seats = sc.nextInt();
        System.out.print("ENTER SHOWROOM PRICE: ");
        car_showroom_price = sc.nextInt();
    }
}
