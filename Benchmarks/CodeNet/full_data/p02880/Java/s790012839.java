import java.util.*;
public class Main{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int x[]={1,2,3,4,5,6,7,8,9};
    int n=sc.nextInt();

    for(int i=0;i<x.length;i++){
      for(int j=x.length-i;j<x.length-1;j++){
        if(x[i]*x[j]==n){
          System.out.println("Yes");
          break;
        }else{
          System.out.println("No");
        }
      }
    }
  }
}