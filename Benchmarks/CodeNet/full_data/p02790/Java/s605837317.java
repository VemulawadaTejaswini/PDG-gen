import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt();
        String str1 = (String.valueOf(a));
        String str2 = (String.valueOf(b));
        if(b>=a){
            System.out.println(str1.repeat(b));
        }
        else{
            System.out.println(str2.repeat(a));
        }
    }
}