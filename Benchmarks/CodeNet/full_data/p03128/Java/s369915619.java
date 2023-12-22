import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int m=scan.nextInt();
    int p[]=new int[8];
    for(int i=2;i<8;i++){
      p[i]=0;
    }
    int hoge;
    for(int i=0;i<m;i++){
      hoge=scan.nextInt();
      switch(hoge){
        case 1:
          p[2]=1;
          break;
        case 7:
          p[3]=7;
          break;
        case 4:
          p[4]=4;
          break;
        case 2:
        case 3:
        case 5:
          p[5]=max(p[5],hoge);
          break;
        case 6:
        case 9:
          p[6]=max(p[6],hoge);
          break;
        case 8:
          p[7]=8;
          break;
      }
      int mi=10;
      int a[]=new int[8];
      for(int i=2;i<8;i++){
        a[i]=0;
        if(p[i]!=0){
          a[i]=i;
          mi=min(mi,i);
        }
      }
      a[mi]=0;
      m=n%mi;
      int k;
      for(int i=0;i<10;i++){
      for(int p=0;p<mi;p++){
      for(int q=0;q<mi;q++){
      for(int r=0;r<mi;r++){
      for(int s=0;s<mi;s++){
      for(int t=0;t<mi;t++){
        k=p*a[3]+q*a[4]+r*a[5]+s*a[6]+t*a[7];
        if(k==m+(i*mi)) i=114514;
      }
      }
      }
      }
      }
      }
      
    }
  }
}
