import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M= sc.nextInt();
    int coin=0;
    int Max=Math.max(N,M);
    int Min=Math.min(N,M);
    coin=Max;
    if(Max-1>Min){
      coin+=Max-1;
    }else{
      coin+=Min;
    }
    System.out.println(coin);
  }}