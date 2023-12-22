/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author nai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nList[] = new int[N];
        int nvlist[] = new int[N+1];
        
        int maxvalue = 0,cou = 0;
        
        for(int i = 0; i< N ;i ++){
            nList[i] = sc.nextInt();
            nvlist[nList[i]] = i;
        }
        int remnum = -1 , temp;
        //nvlist tansaku
        for(int i = 1; i <= N ;i ++){
            temp = nvlist[i];
            if(remnum > temp){
                if(maxvalue < cou){
                    maxvalue = cou;
                    
                }
                if(temp < nvlist[i + 1]){
                        cou = 1;
                }
                remnum = temp;
                cou = 0;
            }
            remnum = temp;
            cou++;
        }
        
        System.out.println(N - maxvalue);
        
        
        
    }
    
}