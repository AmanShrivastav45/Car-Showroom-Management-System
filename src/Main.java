import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main {

    static void menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("================================= *** ENTER YOUR CHOICE *** =================================");
        System.out.println();
        System.out.println("1] ADD SHOWROOMS \t\t\t\t\t 2].ADD EMPLOYEES \t\t\t\t\t 3] ADD CARS");
        System.out.println();
        System.out.println("4] GET SHOWROOMS \t\t\t\t\t 5] GET EMPLOYEES \t\t\t\t\t 6] GET CARS");
        System.out.println();
        System.out.println("================================== *** ENTER 0 TO EXIT *** ==================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employees[] employee = new Employees[5];
        Cars[] car = new Cars[5];
        int no_of_cars = 0;
        int no_of_showrooms = 0;
        int no_of_employees = 0;
        int choice = 10;

        while(choice != 0){
            menu();
            System.out.print("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();
            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        showroom[no_of_showrooms] = new Showroom();
                        showroom[no_of_showrooms].set_details();
                        no_of_showrooms++;
                        System.out.println();
                        System.out.println("1] ADD NEW SHOWROOM");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.print("ENTER YOUR CHOICE: ");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[no_of_employees] = new Employees();
                        employee[no_of_employees].set_details();
                        no_of_employees++;
                        System.out.println();
                        System.out.println("2] ADD NEW EMPLOYEE");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.print("ENTER YOUR CHOICE: ");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[no_of_cars] = new Cars();
                        car[no_of_cars].set_details();
                        no_of_cars++;
                        System.out.println();
                        System.out.println("3] ADD NEW CAR");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.print("ENTER YOUR CHOICE: ");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        if(no_of_showrooms == 0) {
                            System.out.println("THERE ARE NO SHOWROOMS TO DISPLAY!");
                        }else{
                            for (int i = 0; i < no_of_showrooms; i++) {
                                showroom[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        System.out.print("ENTER YOUR CHOICE: ");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        if(no_of_employees == 0) {
                            System.out.println("THERE ARE NO EMPLOYEES TO DISPLAY!");
                        }else {
                            for (int i = 0; i < no_of_employees; i++) {
                                employee[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        System.out.print("ENTER YOUR CHOICE: ");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        if(no_of_cars == 0) {
                            System.out.println("THERE ARE NO SHOWROOMS TO DISPLAY!");
                        }else {
                            for (int i = 0; i < no_of_cars; i++) {
                                car[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        System.out.print("ENTER YOUR CHOICE: ");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.print("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }

    }
}