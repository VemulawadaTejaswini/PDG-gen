import java.util.Scanner;

public class Otoshidama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c = -1;
        int z = 0;

       int x = scan.nextInt();
       int y = scan.nextInt();

       for(int i = 0; i <= x;i++){
            a = i;
           for(int k = 0;k <= x-i;k++){
               b = k;
               c = x - i - k;
               z = 10000*a + 5000*b + 1000*c;
               if(y == z){
                  System.out.println(a+" "+b+" "+c);
                  break;
               }
           }
       }
    }
}
