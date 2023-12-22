import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int h=sc.nextInt(),w=sc.nextInt();
    char[][] ch=new int[h][w];
    int[] dx={1,0,-1,0,1,-1,1,-1};
    int[] dy={0,1,0,-1,1,-1,-1,1};
    for(int i=0;i<h;i++){
      ch[i]=sc.next().toCharArray();
    }
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(ch[i][j]=='#'){
          System.out.print(ch[i][j]);
        }else{
          int num=0;
          for(int d=0;d<8;d++){
            int ni=i+dx[d];
            int nj=j+dy[d];
            if(ni<0||ni>=h){
              continue;
            }else if(nj<0||nj>=w){
              continue;
            }else{
              if(ch[ni][nj]=='#'){
                num++;
              }
            }
          }
          System.out.print(num);
        }
      }
      System.out.print("\n");
    }
  }
}
