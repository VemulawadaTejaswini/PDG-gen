import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int things = sc.nextInt();
        int tickets = sc.nextInt();
        ArrayList<Integer> price = new ArrayList<>(things);
        for(int i=0; i<things; i++){
            price.add(sc.nextInt());
        }

        for(int i=0; i<tickets; i++){
            Collections.sort(price, Comparator.reverseOrder());
            price.set(0,price.get(0)/2);
        }

        long minimal = 0;
        for(int p : price){
            minimal += p;
        }
        System.out.println(minimal);
    }
}