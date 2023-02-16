import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class shopForUser {
    public static void crudUser(ConnectionUtil s, ConnectionUtilUsers r, Connection con, double bal) throws SQLException {
        int choice, chosenId;
        Laptop curLap = new Laptop();
        Scanner sc = new Scanner(System.in);
        while (true){
            Menu.showMenuForUser();
            choice = sc.nextInt();
            if (choice == 1){
                s.showLaptops(con, "laptops");
            }
            else if (choice == 2){
                s.showLaptops(con, "laptops");
                System.out.println("Choose a laptop");
                int k = sc.nextInt();
                Basket.addLaptop(k);
            }

            else if (choice == 3){
                System.out.println("----------------");
                break;
            }
            else {
                System.out.println("Write correct number");
            }
        }
    }
}
