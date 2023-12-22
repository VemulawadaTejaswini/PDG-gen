import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int x=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int total=x;
    for(int i=0;i<n;i++){
      for(int s=0;;s++){
        if(a[i]*s+1>d){
          break;
        }else{
          total++;
        }
      }
    }
    System.out.println(total);
  }
}
