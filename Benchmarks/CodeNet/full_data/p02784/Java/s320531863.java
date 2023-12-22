import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        long h = stdIn.nextLong();
        int n = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int a[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        int sum = 0;
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            sum += stdIn.nextInt();
        }
        
        if(sum >= h){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}