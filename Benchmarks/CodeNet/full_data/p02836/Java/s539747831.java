import java.util*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String SS=sc.next();
    String[]b=SS.split("");

    int count =0;
    
    int K=SS.length();
      for(int i=0;i<=K/2;i++){
        if(b[i].equals(b[K-1-i])){
        count=count+1;
        }else{
          count=count+0;
        }
      }
    
    import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String SS=sc.next();
    String[]b=SS.split("");

    int count =0;
    
    int K=SS.length();
      for(int i=0;i<=K/2;i++){
        if(b[i].equals(b[K-1-i])){
        count=count+1;
        }else{
          count=count+0;
        }
      }
    
    
    if(K==1){
      System.out.println("0");
    }else if(K!=1){
                 System.out.println("count");
    }
    
   }
  }

          
          
 
    
   }
  }

          
          
