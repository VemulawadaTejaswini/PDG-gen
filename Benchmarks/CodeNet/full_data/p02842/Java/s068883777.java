import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int count=0;
    
    for(int i=0;i<=50000;i++){
      double X=i*1.08;
    if(N==X){
      System.out.println("X");
      count+=1;
      break;
    }
  }
    if(count==0){
      System.out.println(":(");
    }
  }
}
  
