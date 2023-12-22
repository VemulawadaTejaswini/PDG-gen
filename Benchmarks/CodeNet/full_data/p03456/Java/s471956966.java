import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String s="No";
        int n=Integer.parseInt(a+b);
        for(int i=1;i<=1000;i++){
            if(i*i==n){
                s="Yes";
            }
        }
        System.out.println(s);
    }
}