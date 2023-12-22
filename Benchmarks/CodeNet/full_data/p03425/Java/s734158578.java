import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String march="MARCH";
    long[] a=new long[6];
    for(int i=0;i<n;i++){
      a[march.indexOf(sc.next().charAt(0))+1]++;
    }
    long ans=0; 
    for(int i=1;i<=3;i++){
      for(int j=i+1;j<=4;j++){
        for(int k=j+1;k<=5;k++){
          ans+=a[i]*a[j]*a[k];
        }
      }
    }
    System.out.println(ans);
  }
}