import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int ans = 0;
		int lans = 0;
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i=0; i<n; i++){
		    String str1 = str.substring(0,i+1);
		    String str2 = str.substring(i+1);
		    for(int j=0; j<n-i-1; j++){
		        char c1 = str1.charAt(i);
		        char c2 = str2.charAt(j);
		        if(c1==c2){
		            ans++;
		        }
		        if(lans < ans){
		            lans = ans;
		        }
		        ans = 0;
		    }
		}
		
		System.out.println(lans);   
        
    }
}
