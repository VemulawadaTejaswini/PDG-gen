import java.io.*;
import java.util.Scanner;

class f {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        int a3 = s.nextInt();
        if (a1<=13 && a1>=0 && a2<=13 && a2>=0 && a3<=13 && a3>=0){
            int sum =a1+a2+a3;
            if(sum>=22){
                System.out.println("bust"); 
            }
            else {
                System.out.println("win");
            }
        }
    }
}
