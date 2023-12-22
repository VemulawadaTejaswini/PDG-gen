import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int K = sc.nextInt(); //連続するK個が黒
int X = sc.nextInt(); //X番に位置する石は黒
int f = X-K+1; //最初の黒石
int l = X+K-1; //最後の黒石
int p = 0; //印字する
for(int i=f; i<=l; i++){
  p = i;
  System.out.printf(p+" ");
}
}
}