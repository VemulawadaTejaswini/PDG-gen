import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	String ans = "No";
      	int num = 0;
		for(int i=1; i<10; i++){
			for(int j=1; j<10; j++){
              num = i*j;
              if(num==n) ans = "Yes";
            }
		}
      	System.out.println(ans);
	}
}
