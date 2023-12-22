import java.util.ArrayList;

import org.graalvm.compiler.loop.MathUtil;

import java.util.*;
import java.lang.Math;
 class Main{
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       List<Integer> l=new ArrayList<>();
      // set<Integer> s=new LinkedSet();
      // int n=sc.nextInt();
      // int flag=0;
      // for(int i=0;i<n;i++){
      //       int j=sc.nextInt();      
      //       l.add(j);      
      // }
      // s.addAll(l);
      // if(l.size()==s.size()){
      //             System.out.println("No");
      //             System.exit(0);
      //       }else{
      //             System.out.println("Yes");
      //             System.exit(0);
      //       }     
      
            int total=sc.nextInt();
            int n=sc.nextInt();
            //int count=0;
            for(int i =0;i<n;i++)
                  l.add(sc.nextInt());
            
                  int s = 0;
                  for (int i: l) {
                      s += i;
                  }
            //System.out.println((total));
           // System.out.println(s);
            if((total-s)<=0 || total==s){
                  System.out.println("Yes");
                  System.exit(0);
            }else{
                  System.out.println("No");
                  System.exit(0);
            }     
      }
}  