import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int num[] = new int[3];
        String s = stdIn.next();
        char c[] = s.toCharArray();
        int sum = 700;
        //boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            if(c[i] == 'o'){
                sum += 100;
            }
        }
        
        System.out.println(sum);
        
        
        //System.out.println();
        //System.out.print();
    }
}
