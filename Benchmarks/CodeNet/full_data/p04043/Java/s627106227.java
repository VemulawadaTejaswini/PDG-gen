import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         int b=in.nextInt();
         int c=in.nextInt();
         if((a==5 && b==5)||(b==5 && c==5)||(a==5 && c==5)){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
    }
}