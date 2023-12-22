import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean flag = true;
        
        if(a <= b){
            System.out.println(a);
        }else{
            System.out.println(a - 1);
        }
        
        
        //System.out.println();
        //System.out.print();
    }
}
