import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> kList = new ArrayList<>();

        ArrayList<Integer> okList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
          kList.add(sc.nextInt());
        }
        for (int i = 0; i < 10;  i++) {
          if (kList.indexOf(i) == -1) {
            okList.add(i);
          }
        }
      
        String price = String.valueOf(n);
        int okIndex = 0;
        boolean isNine = false;
        for (int i = 0; i < 10; i++) {
          String s = String.valueOf(i);
          
          if (kList.indexOf(s) > -1 &&
             price.indexOf(s) > -1) {
            if (i == 9) {
              while (price.indexOf(String.valueOf(i) > -1)) {
                n += Math.pow(10, price.length() - price.indexOf(i));
                price = String.valueOf(n);						
              }
              
              isNine = true;
            } else {
              if (okList.get(okIndex) < i) {
                okIndex++;
              }
              price.replaceAll(s, String.valueOf(okList.get(okIndex)));
              n = Integer.parseInt(price);
            }
          }
        }
        if (isNine) {
          int lim = okList.get(0);
          String limS = String.valueOf(lim);
          for (int i = 0; i < lim; i++) {
            String target = String.valueOf(i);
            if (price.indexOf(target) > -1) {
              price.replace(target, String.valueOf(lim));
            }
          }
        }
        
        System.out.println(price);
    }
}
