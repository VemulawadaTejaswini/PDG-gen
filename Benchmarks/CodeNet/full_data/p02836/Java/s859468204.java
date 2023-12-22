import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String SS=sc.next();
    String[]b=SS.split("");

    int count =0;
    
    int K=SS.length();
      for(int i=0;i<=K;i++){
        if(b[i].equals(b[K-1-i])){
        count=count+1;
        }else{
          count=count+0;
        }
      }
      System.out.println("count");
    if(K==1){
      System.out.println("0");
    }
    }
  }

          
          
