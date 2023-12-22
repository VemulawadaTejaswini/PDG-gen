import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      int[] E = new int[]{A,B,C};
      Arrays.sort(E);
      
      if(E[2]-E[1]<=D||E[1]-E[0]<=D||E[2]-E[0]<=D){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}