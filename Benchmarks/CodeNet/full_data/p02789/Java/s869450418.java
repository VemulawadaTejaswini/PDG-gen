import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        //int c = stdIn.nextInt();
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
        
        if(a == b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}