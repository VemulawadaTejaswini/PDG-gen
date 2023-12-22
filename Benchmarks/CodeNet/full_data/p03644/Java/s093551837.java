import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    
    for(int i=0;i<8;i++){
      if(n<Math.pow(2,i)){
        System.out.println((int)Math.pow(2,i-1));
        return;
      }
    }
  }
}