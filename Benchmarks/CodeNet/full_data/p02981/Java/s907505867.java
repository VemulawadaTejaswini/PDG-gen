import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int train_one =  scanner.nextInt();
        int taxi_people =  scanner.nextInt();
      
        int min_price = Math.min(people * train_one, taxi_people);
        System.out.println(min_price);
    }
}