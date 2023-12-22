import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class Main{
   
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();
        int enokazu=0;
        int wnokazu=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='E'){
                enokazu++;
            }else{
                wnokazu++;
            }}
        int min=100000;
        int kaisuu=0;
        
        int i=S.length()/2;
            int eenokazu=0;
            int wwnokazu=0;
            for(int j=0;j<i;j++){
                if(S.charAt(j)=='E'){
                    eenokazu++;
                }else{
                    wwnokazu++;
                }


            }
            int eeenokazu=enokazu-eenokazu;
            int wwwnokazu=wnokazu-wwnokazu;
            int kokonomin=wwnokazu+eeenokazu;
            if(kokonomin<min){
                min=kokonomin;
            }
            for(int l=i+1;l<S.length();l++){
                if(kaisuu==3){
                    break;
                }
                eenokazu=0;
                wwnokazu=0;
            for(int j=0;j<l;j++){
                if(S.charAt(j)=='E'){
                    eenokazu++;
                }else{
                    wwnokazu++;
                }


            }
            eeenokazu=enokazu-eenokazu;
            wwwnokazu=wnokazu-wwnokazu;
            kokonomin=wwnokazu+eeenokazu;
            if(kokonomin<min){
                min=kokonomin;
            }else{kaisuu++;

            }

            }
            kaisuu=0;
            for(int l=i-1;l>0;l--){
                if(kaisuu==3){
                    break;
                }
                eenokazu=0;
                wwnokazu=0;
            for(int j=0;j<l;j++){
                if(S.charAt(j)=='E'){
                    eenokazu++;
                }else{
                    wwnokazu++;
                }


            }
            eeenokazu=enokazu-eenokazu;
            wwwnokazu=wnokazu-wwnokazu;
            kokonomin=wwnokazu+eeenokazu;
            if(kokonomin<min){
                min=kokonomin;
            }else{kaisuu++;

            }

            }

        
        System.out.println(min);
        

    }

        
        
    }
