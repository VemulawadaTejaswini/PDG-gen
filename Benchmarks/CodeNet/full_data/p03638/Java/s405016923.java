import java.util.*;
import java.math.*;


public class Main {

public static void main(String[] args) {

   Scanner in = new Scanner(System.in);

   int H = in.nextInt();
   int W = in.nextInt();
   int N = in.nextInt();
   int a[] = new int[N];

   for(int cnt = 0; cnt < N; cnt++){
       a[cnt] = in.nextInt();
   }
   for(int cnt = 0; cnt < W; cnt++){
       for(int cnt2 = 0; cnt2 < H; cnt2++){
           System.out.print("0 ");
       }
       System.out.println("");
   }

   in.close();
}
}