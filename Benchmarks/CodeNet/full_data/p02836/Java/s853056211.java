import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String SS=sc.nextLine();
    String[]sr=SS.split("");
    int count =0;
    int K=SS.length();
    if(K!=1){
      for(int i=0;i<K/2;i++){
        if(sr[i]==sr[K-1-i]){
          count+=0;
        }else if(sr[i]!=sr[K-1-i]){
          count+=1;
        }
      }
    }
          if(K==1){
      System.out.println("0");
    }
    if(count!=0){
      System.out.println("count");
    }
    }
  }

          
          
