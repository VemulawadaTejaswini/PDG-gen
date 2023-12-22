import java.util.*;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {

               Scanner sc = new Scanner(System.in);
               int loop = sc.nextInt();
               int arr [] = new int [loop];
               boolean  go = true;
               for(int i = 0; i < loop; i++) {
                  arr[i] = sc.nextInt();
                  if(arr[i] % 2 != 0) {
                            go = false;
                  }    
    }

                   sc.close();
                int num = 0;
           
               while (go) {
                    for(int i = 0; i < loop; i++) {
                          arr[i] /= 2;
                          if(arr[i] % 2  != 0) {
                          go = false;
                         break;
                 }
         }
                     num++;      
} //-------- END while
              System.out.println(num);
        }
}