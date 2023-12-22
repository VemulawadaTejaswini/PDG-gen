import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int m=scan.nextInt();
    int c=scan.nextInt();
    int b[]=new int[m];
    for(int j=0;j<m;j++) b[j]=scan.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j]=scan.nextInt()*b[j];
      }
    }
    int count=0;
    int sum;
    for(int i=0;i<n;i++){
      sum=0;
      for(int j=0;j<m;j++){
        sum=sum+a[i][j];
      }
      if(sum+c>0){
        count+=1;
      }
    }
    System.out.println(count);
  }
}
