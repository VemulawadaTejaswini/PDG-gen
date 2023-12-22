import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int s, m=0;
      LinkedList<Integer> a = new LinkedList<Integer>();
      
      s=Integer.parseInt(sc.next());
      a.add(s);
      out: for(int i=0; i<=1000000; i++){
        if(a.get(i)%2==0){
          a.add(a.get(i)/2);
        }else{
          a.add(a.get(i)*3+1);
        }
        for(int j=0; j<i+1; j++){
          if(a.get(i+1)==a.get(j)){
            m=i+2;
            break out;
          }
        }
      }

      System.out.println(m);
      
                
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
