import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectionUtil s = new ConnectionUtil();
        ConnectionUtilUsers r = new ConnectionUtilUsers();
        Connection con = s.connect_to_db("project", "postgres", "2222");
        Connection noc = r.connect_to_db("project", "postgres", "2222");
        s.createTable(con, "laptops");
        r.createTableUser(noc, "users");

        Scanner sc = new Scanner(System.in);
        int choice, chosenId;
        Laptop curLap = new Laptop();
        System.out.println("1.Running as an administrator");
        System.out.println("2.Running as an User");
        choice = sc.nextInt();
        if (choice == 1) {
            if (ShopAdmin.adminAuthentication()) {
                System.out.println("Authentication was successful");
                ShopAdmin.crudAdmin(s,con);
            }
            else {
                System.out.println("Login or password incorrect");
            }
        }

        else if (choice==2) {
            System.out.println();
            System.out.println("1. Log in");
            System.out.println("2. Sign up");
            choice = sc.nextInt();
            if (choice==1) {
                User.createUser(r, noc);
            } else if (choice == 2){
                User user = new User();
                user = User.enterUser(r, noc);
                shopForUser.crudUser(s, r, noc, user.getBalance());
            }
        }

    }

}
