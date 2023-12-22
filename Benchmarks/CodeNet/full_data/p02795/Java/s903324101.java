import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int h = stdIn.nextInt();
        int w = stdIn.nextInt();
        int n = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        if(n % Math.max(h, w) == 0){
            System.out.println(n / Math.max(h, w) );
        }else{
            System.out.println(n / Math.max(h, w) + 1);
        }
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}