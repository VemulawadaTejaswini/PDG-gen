import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    int count = 0;
    int[] a = new int[n];
    int odd = 0;
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    while(odd<n){
      odd=0;
      for(i=0;i<n;i++){
        if(a[i]%2==1){
        }else if(a[i]<3){
          a[i]=a[i]*3;
        }else{
          a[i]=a[i]/2;
        }
      }
      count = count + 1;
      for(i=0;i<n;i++){
        if(a[i]%2==1){
          odd = odd + 1;  
      }
    }

  }
  System.out.println(count);
 }
}