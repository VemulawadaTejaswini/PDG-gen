import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;



public class Main{

        static final Scanner sc=new Scanner(System.in);






        public static void main(String[]args){
                String S=sc.next();
                String T=sc.next();
                int s[S.size()];
  int t[S.size()];
  for(int i=0;i<S.size();i++){
    s[i]=moji(S.at(i));
    t[i]=moji(T.at(i));
  }
  bool ok=true;
  for(int i=1;i<=26;i++){
    int a[200000];
    int sum=0;
   for(int j=0;j<S.size();j++){
      if(s[j]==i){
        a[sum]=j;
        sum++;
      }
    }
    
    
    for(int i=0;i<sum;i++){
      if(t[a[i]]==t[a[i+1]]){
        

      }else{
        ok=false;

      }

    }
    

    }
    if(ok){
      System.out.println("Yes");
    }else{

      System.out.println("No");
    }






                



        }








        
        private static int gcd(int m, int n) {
                if(m < n) return gcd(n, m);
                if(n == 0) return m;
                return gcd(n, m % n);
            }
        private static int moji(char i){
                if(i=='a'){
                        return 1;
                      }
                      if(i=='b'){
                        return 2;
                      }
                      if(i=='c'){
                        return 3;
                      }
                      if(i=='d'){
                        return 4;
                      }
                      if(i=='e'){
                        return 5;
                      }
                      if(i=='f'){
                        return 6;
                      }
                      if(i=='g'){
                        return 7;
                      }
                      if(i=='h'){
                        return 8;
                      }
                      if(i=='i'){
                        return 9;
                      }
                      if(i=='j'){
                        return 10;
                      }
                      if(i=='k'){
                        return 11;
                      }
                      if(i=='l'){
                        return 12;
                      }
                      if(i=='m'){
                        return 13;
                      }
                      if(i=='n'){
                        return 14;
                      }
                      if(i=='o'){
                        return 15;
                      }
                      if(i=='p'){
                        return 16;
                      }
                      if(i=='q'){
                        return 17;
                      }
                      if(i=='r'){
                        return 18;
                      }
                      if(i=='s'){
                        return 19;
                      }
                      if(i=='t'){
                        return 20;
                      }
                      if(i=='u'){
                        return 21;
                      }
                      if(i=='v'){
                        return 22;
                      }
                      if(i=='w'){
                        return 23;
                      }
                      if(i=='x'){
                        return 24;
                      }
                      if(i=='y'){
                        return 25;
                      }
                      if(i=='z'){
                        return 26;
                      }
                      return 100;
                      
        }






}
