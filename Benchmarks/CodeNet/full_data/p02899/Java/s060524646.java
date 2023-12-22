import java.util.*;

class Main{
	public static void main(String[] $){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ans[] = new int [n+1];
    
    
    for(int i  = 1 ; i <= n ; i++){
        ans[in.nextInt()] = i;
    }
    for(int i = 1;i <= n;i++){
        System.out.print(ans[i] + " ");
    }
		
	}
}
