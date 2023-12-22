

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        new Main().q1();
    }
    
    
    public void q1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();
       
        for(int i = 0; i < n; i++) {
          list.add(sc.next());
        }
        String ret = "";
        
        for(char target = 'a' ; target  <= 'z'; target++) {
            List<Integer> count = new ArrayList<Integer>();
             for (String string :list){
                 int x = 0;
                 for(char c:string.toCharArray()){
                     if(c==target){
                       x ++;
                     }
                 }
                 count.add(x);
             }
            int max = Collections.min(count);
            for(int i = 0; i < max; i++) {
              ret += target;
            }
            
        }
    
        System.out.println(ret);
        
        
    }
    
    
}

