import java.util.Scanner;
import java.util.ArrayList;

public class Main{

  static int h,w;
  static boolean[][] a;
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    h=stdIn.nextInt();
    w=stdIn.nextInt();
    a=new boolean[h][w];
    ArrayList<int[]> pos=new ArrayList<int[]>();
    for(int y=0;y<h;y++){
      String s=stdIn.next();
      for(int x=0;x<w;x++){
        if(s.charAt(x)=='#'){
          pos.add(new int[]{y,x});
          a[y][x]=true;
        }
      }
    }
    int max=0;
    for(int y=0;y<h;y++){
      for(int x=0;x<w;x++){
        if(!a[y][x]){
          int min=h+w;
          for(int i=0;i<pos.size();i++){
            int dist=Math.abs(pos.get(i)[0]-y)+Math.abs(pos.get(i)[1]-x);
            if(dist<min){
              min=dist;
              if(min>max){
                max=min;
              }
            }
          }
        }
      }
    }
    System.out.println(max);
  }
}
