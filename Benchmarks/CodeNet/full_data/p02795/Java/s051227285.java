import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int H=sc.nextInt();
    int W=sc.nextInt();
    int N=sc.nextInt();
    double Ans=0;
    
    if(H>W){
      Ans=Math.floor(N/H)+1;
    }
    else{
      Ans=Math.floor(N/W)+1;
    }
    System.out.println(Ans);
  }
}