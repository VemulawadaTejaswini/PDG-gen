import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int m=scan.nextInt();
    int c=scan.nextInt();
    int b[]=new int[m];
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j]=scan.nextInt();
      }
    }
    c=-c;
    int count=0;
    int sum;
    for(int i=0;i<n;i++){
      sum=0;
      for(int j=0;j<m;j++){
        sum+=a[i][j]*b[j];
      }
      if(sum>c) count++;
    }
    System.out.println(count);
  }
}