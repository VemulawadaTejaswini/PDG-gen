    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
          List<Integer> aList = new ArrayList<>();
          List<Integer> bList = new ArrayList<>();

            for (int i = 1; i <= a; i++) {
              if (a % i == 0) {
                aList.add(i);
              }
            }
           for (int i = 1; i <= b; i++) {
              if (b % i == 0) {
                bList.add(i);
                                    
              }
            }

          List<Integer> list = new ArrayList<>();
          for (int aa : aList) {
           for (int bb : bList) {
          		if (aa == bb) {
                  list.add(aa);
                    System.out.println(list);
                }
 	         }
          }
          if (list.size() < k) {
            System.out.println(list.get(0));
          } else {
            System.out.println(list.get(k - 1));
          }
        }
    }