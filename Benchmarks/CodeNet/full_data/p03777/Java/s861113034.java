import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        int flag=0;
        if(a.charAt(0)=='H'){
            System.out.println(b);
        }
        else{
            if(b.charAt(0)=='H'){
                System.out.println("D");
            }
            else{
                System.out.println("H");
            }
        }
    }
}