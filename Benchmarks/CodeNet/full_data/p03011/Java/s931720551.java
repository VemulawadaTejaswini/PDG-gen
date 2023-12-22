import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
    //    String s = sc.next();
      //  char a[]= s.toCharArray();
        int b[] = new int[3];
        for(int i= 0 ; i<3; i++){
              b[i] =sc.nextInt();
            
        }
        Arrays.sort(b);
        System.out.println(b[0]+b[1]); 
    }
}
