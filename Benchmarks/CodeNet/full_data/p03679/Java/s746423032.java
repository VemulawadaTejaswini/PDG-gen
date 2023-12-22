
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blulogix
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]list=new int[n+1];
        boolean[]isVisit=new boolean[n+1];
        for (int i = 1; i <= n; i++) {
           list[i]= in.nextInt();
        }
        int count=0;
        int start=1;
        
        while(true){
           if(isVisit[start]){
            System.out.println(-1);
            return;
        }
            isVisit[start]=true;
        
        if(start==2)
            break;
       
            start=list[start];
        count++;
        }
        
        
        System.out.println(count);
    }
}
