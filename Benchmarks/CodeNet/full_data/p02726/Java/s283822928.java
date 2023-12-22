import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        
        int befLong = y - 2; 
        //System.out.println(befLong);
        int aftLong = n - x - 1;
        //System.out.println(aftLong);
        
        for(int i = 1; i < n; i++){
            int sum = Math.max(0, befLong - i + 1) + Math.max(0, aftLong - i + 1);
            
            //System.out.println("上：" + Math.max(0, befLong - i + 1));
            //System.out.println("下：" + Math.max(0, aftLong - i + 1));
            
            sum -= Math.max(0, (y - 1) - (x + 1) + 1 - i);
            
            //System.out.println("hi:" + Math.max(0, (y - 1) - (x + 1) + 1 - i));
            
            sum += Math.max(0, (x - 1 + n - y + 1 + 1 - i) - Math.max(0, x - i) - Math.max(0, n - y + 1 - i));
            
            //System.out.println("み：" + Math.max(0, x - 1 + n - y + 1 + 1 - i) + " " + Math.max(0, x - i) + " " + Math.max(0, n - y + 1 - i));
            System.out.println(sum);
        }
        
        
        
        //boolean flag = true;
        
        // for(int i = 0; i < s.length(); i++){
        //     a[i] = c[i] - 48;
        //     System.out.println(a[i]);
        // }
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}

        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}
