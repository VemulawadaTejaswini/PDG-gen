import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int ans=0;
    for(int i=1;i<N+1;i++){
    	ans+=i;
    }
    System.out.print(ans);
    System.out.flush();
    sc.close();
  }
}