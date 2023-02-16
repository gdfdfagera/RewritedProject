import java.util.ArrayList;

public class Basket {
    private static ArrayList<Laptop> basket = new ArrayList<>();

    public void setBasket(ArrayList<Laptop> basket) {
        this.basket = basket;
    }

    public ArrayList<Laptop> getBasket() {
        return basket;
    }

    public static void addLaptop(int id) {
        
    }

    public static void showBasket (ArrayList bas) {
        for (Object p: bas) {
            System.out.println(p);
        }
    }

    public static void deleteLaptop (int id) {

    }
}
