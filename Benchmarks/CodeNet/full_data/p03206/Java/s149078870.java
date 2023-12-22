import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int d = stdIn.nextInt();
        int eve = 25 - d;
        //int c = stdIn.nextInt();
        //int w = stdIn.nextInt();
        //int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean heisei = true;
        
        System.out.print("Christmas");
        
        for(int i = 0; i < eve; i++){
            System.out.print(" Eve");
        }
        
        System.out.println();
        //System.out.print();
    }
}
