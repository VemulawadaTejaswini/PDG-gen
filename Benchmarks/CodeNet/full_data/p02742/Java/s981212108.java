import java.util.Scanner;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      
      int ans = (h+w+1)/2;
      
      if(h==1 || w == 1){
        ans =1;
      }
      System.out.println(ans);
    }
}
