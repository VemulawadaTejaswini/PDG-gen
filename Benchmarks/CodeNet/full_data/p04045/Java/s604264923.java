import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[k];

        String price = n.toString();
        for (int i = 0; i < k; i++) {
          list[i] = sc.nextInt();
          while (price.indexOf(list[i].toString() > -1)){
            int index = price.indexOf(list[i].toString());
            n += Math.pow(10, price.length() - index);
            price = n.toString();
          }
        }
      
      for (int i = 0; i < k; i++) {
        while (price.indexOf(list[i].toString() > -1)){
            int index = price.indexOf(list[i].toString());
            n += Math.pow(10, price.length() - index);
            price = n.toString();
        }
      }

        
        System.out.println(price);
    }
}
