/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package poisonouscookies;
import java.util.*;

/**
 *
 * @author Dheeresh
 */
public class Main {
    Scanner scanner;
    int a,b,c,d,i,j,k;
    String str;
    String[] strs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new PoisonousCookies();
    }
    
    public PoisonousCookies(){
        scanner = new Scanner(System.in);
        strs=scanner.nextLine().split(" ");
        a=Integer.parseInt(strs[0]);
        b=Integer.parseInt(strs[1]);
        c=Integer.parseInt(strs[2]);
        p(Math.min(a+b+1,c)+b);
    }
    
    void p(String s){
        System.out.println(s);
    }
    
    void p(long l){
        System.out.println(l);
    }
    
    void p(double d){
        System.out.println(d);
    }
    
    void p(int i){
        System.out.println(i);
    }
    
    void p(Object o){
        System.out.println(o);
    }
    
    void p(char c){
        System.out.println(c);
    }
    
    void p(){
        System.out.println();
    }
    
    void pp(String s){
        System.out.print(s);
    }
    
}
