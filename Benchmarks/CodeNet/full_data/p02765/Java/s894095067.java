import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,r;
        n=scan.nextInt();
        r=scan.nextInt();
        if(n<10){
            System.out.println(r+(100*(10-n)));
        }
        else {
            System.out.println(r);
        }
        
    }
}