import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
      int a,b,c;
      a=scan.nextInt();
      b=scan.nextInt();
      c=scan.nextInt();
      if(((Math.pow(a,0.5))+(Math.pow(b,0.5)))<(Math.pow(c,0.5))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
