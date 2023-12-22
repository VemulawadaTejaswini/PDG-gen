import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int k=scan.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=scan.nextInt();
      a[i]=k+1-a[i];
      a[i]=Math.max(a[i],0);
    }
    int sum=0;
    for(int i=0;i<n;i++){
      sum+=a[i];
      if(2*a[i]>k+1){
        i=n;
        sum=k+1;
      }
    }
    if(sum>k){
      System.out.println(-1);
    }else{
    int b[]=new int[k+2];
    int c=0;
    b[0]=-1;
    for(int i=0;i<k+1;i++){
      c=0;
      for(int j=0;j<n;j++){
        if((j!=b[i])&&(a[j]>a[c])) c=j;
      }
      a[c]--;
      b[i+1]=c;
    }
    for(int j=0;j<k+1;j++){
    for(int i=0;i<n;i++){
      if(b[j+1]!=i) System.out.print((i+1)+" ");
    }
    }
    }
  }
}
