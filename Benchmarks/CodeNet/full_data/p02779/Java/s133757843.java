
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= in.nextInt();
        }
        int c = 0; 
  
    
    for (int i = 0; i < n-1; i++)  
    { 
        
        for (int j = i+1; j < n; j++) {
            if (a[i] == a[j]) {
                c++;
                
        }
  
        
        }
    } 
            if(c==0)
                System.out.println("YES");
            else
               System.out.println("NO");
        
    }}
