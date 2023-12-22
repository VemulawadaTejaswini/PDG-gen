import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        a=a+b;
        int d=Integer.parseInt(a);
        double c=Math.sqrt(d);
        if(d==(int)c*c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}