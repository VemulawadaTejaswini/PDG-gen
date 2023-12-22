import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        //int d1 = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        boolean flag = false;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        for(int i = 1; i < 54001; i++){
            if(i * 1.08 == n){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        
        if(!flag){
            System.out.println(":(");
        }
        
        //System.out.println();
        //System.out.print();
    }
}