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
    }
  }
}