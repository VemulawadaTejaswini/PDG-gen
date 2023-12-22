import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int c =0;
    for(int i=0;i<n-1;i++){
      if(a[i]>=a[i+1])
        c++;
      else
        c=0;
    }
    System.out.println(c);
  }
}
    
