import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
      
      for(int i = 0;i < W + 2; i++){
      	System.out .print("#");
      }System.out .println();
      
      
      for(int i = 0;i < H; i++){
        	System.out .print("#");
            String s = sc.next();
            System.out .print(s);
        	System.out .println("#");
            }
      
       for(int i = 0;i < W + 2; i++){
      	System.out .print("#");
      }System.out .println();
      
    }
}