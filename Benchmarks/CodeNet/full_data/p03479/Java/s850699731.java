import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextLong();
        double y=sc.nextLong();
        if(x==1&&y<100000000000000&&100<y){
            System.out.println((int)(Math.log(y/2)/Math.log(2)+1));
        }else{
            System.out.println((int)(Math.log(y/x)/Math.log(2)+1));
        }
    }
}
