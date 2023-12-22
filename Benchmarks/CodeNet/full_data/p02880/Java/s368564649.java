import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    String check = "No";
		for(int i = 1; i <= 9; i++){
      for(int j = 1; j <= 9; j++){
        if(i*j == N)
          check = "Yes";
      }
    }
    System.out.println(check);
	}
}