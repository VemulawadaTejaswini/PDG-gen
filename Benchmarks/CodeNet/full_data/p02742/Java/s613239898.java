import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int h,w;
    h=sc.nextInt();
    w=sc.nextInt();
    int sum=0;
    if((h%2)==0){
      sum=(h/2)*w;
    }else{
      for(int i=1;i<=h;i++){
        if((i%2)==0){
          sum+=((h-1)/2);
        }else{
          sum+=((h+1)/2);
        }
      }
    }
    System.out.print(sum);
  }
}