import java.util.Scanner;
public class Main {
	static long k = 0;
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int[] list = new int[n];
      for(int i=0;i<n;i++){
        list[i]=Integer.parseInt(sc.next());
      }
      int count = 0;
      for(int i=0;i<n-1;i++){
        if((list[i+1]-list[i])*a < b ){
          count = count + (list[i+1]-list[i])*a;
        }else{
          count = count + b;
        }        
      }
      System.out.println(count);
	}
}