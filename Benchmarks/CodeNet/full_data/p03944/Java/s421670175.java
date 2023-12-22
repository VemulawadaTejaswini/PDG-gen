import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    int w = 0;
    int h = 0;
    int xN[] = new int[N];
    int yN[] = new int[N];
    int aN[] = new int[N];
    for(int i=0;i<N;i++){
      xN[i] = sc.nextInt();
      yN[i] = sc.nextInt();
      aN[i] = sc.nextInt();
    }
    for(int a=0;a<N;a++){
      if(aN[a]==1&&xN[a]>w){
        w = xN[a];
      }else if(aN[a]==2&&W>xN[a]){
        W = xN[a];
      }else if(aN[a]==3&&yN[a]>h){
        h = yN[a];
      }else if(aN[a]==4&&H>yN[a]){
        H = yN[a];
      }
    }
    if((W-w)*(H-h)>=0){
      System.out.println((W-w)*(H-h));
    }else{
      System.out.println(0);
    }
  }
}