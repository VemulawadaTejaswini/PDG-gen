import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int x = sc.nextInt();
      	int ans = 0;
      	for(int i = a; i <= b; i++){
          if(i % x == 0){
            ans++;
          	}
        }
		System.out.println(ans);
	}
}
