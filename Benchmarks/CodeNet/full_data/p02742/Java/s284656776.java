import java.util.Scanner;
public class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int H = scn.nextInt();
      int W = scn.nextInt();
      int ans;
      if(H%2 = 0){
      	ans = W*(H/2);
      } else {
      	ans = W*(Math.floor(H/2))+Math.ceil(W/2);
      }
      System.out.println(ans);
    }
}
