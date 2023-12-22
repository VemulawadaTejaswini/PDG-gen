/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anvit
 */
import java.util.*;
public class ColoringDominoes {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s1=in.next();
        String s2=in.next();
        //int[] arr=new int[n];
        int p=1;
        if(s1.charAt(0)==s2.charAt(0))
            p=3;
        else if(s1.charAt(0)==s1.charAt(1))
            p=6;
        for(int i=1;i<s1.length();i++){
            if(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)){
                p*=2%1000000007;
            }
            else if(s1.charAt(i)==s2.charAt(i)){
                if(s1.charAt(i-1)==s2.charAt(i-1))
                    p*=2%1000000007;
            }
            p=p%1000000007;
        }
        System.out.println(p);
    }
}
