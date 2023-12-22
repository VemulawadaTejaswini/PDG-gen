/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
/**
 *
 * @author jackt
 */
public class Test {

    /**
     * @param args the command line arguments
     */

    
    
    public static void main(String[] args) {
             
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        
        if (n % 2  == 1){
            System.out.println("No");
        }else{
            int mid = (int)n / 2;
            String s_1 = s.substring(0, mid);
            String s_2 = s.substring(mid);
            if (s_1.equals(s_2))
                System.out.println("Yes");
            else
                System.out.println("No");
           
        }        
            
        }
    }
    
