import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] A = new int[N];
    int[] order = new int[N];
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<N;i++){
      order[Integer.parseInt(sc.next())-1] = i+1;
    }
    sb.append(order[0]);
    for(int i=1;i<N;i++){
      sb.append(" "+order[i]);
    }
    System.out.print(sb.toString());
    System.out.flush();
  }
}
