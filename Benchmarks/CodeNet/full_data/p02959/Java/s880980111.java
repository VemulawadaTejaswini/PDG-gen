import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int a[]=new int[n+1];
    int b[]=new int[n];
    int count=0;

    for(int i=0;i<=n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<=n-1;i++){
      b[i]=sc.nextInt();
    }


    if(a[0]>=b[0]){
      count+=b[0];
      b[0]=0;
    }else{
      count+=a[0];
      b[0]=b[0]-a[0];
    }


    for(int i=1;i<n;i++){
      if(a[i]>=b[i-1]){
        count+=b[i-1];
        a[i]=a[i]-b[i-1];
      }else{
        count+=a[i];
        a[i]=0;
      }

      if(a[i]>=b[i]){
        count+=b[i];
        b[0]=0;
      }else{
        count+=a[i];
        b[i]=b[i]-a[i];
      }
    }
    if(a[n]>=b[n-1]){
      count+=b[n-1];
    }else{
      count+=a[n];
    }

    System.out.println(count);

  }
}
