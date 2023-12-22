import java.util.*;

public class Main {
	static boolean reverse(int n) {
      int k =n;
      int rev = 0;
      while(n!=0){
        rev = rev*10+n%10;
        n /=10;
      }
      if(k==rev){
        return true;
      }
      else{
        return false;
      }
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0; 
		for(int i = a; i<= b; i++) {
			if(reverse(i)) ans++; 
		}
		System.out.println(ans); 
	}
}