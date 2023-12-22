import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner reader=new Scanner(System.in);
    int n=reader.nextInt();
    int k=reader.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=reader.nextInt();
    }
    Arrays.sort(a);
    int sum=0;
    for(int i=a.length-1;i>a.length-1-k;i--){
      sum+=a[i];
    }
    System.out.println(sum); 
  }
}