import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
		
    	int ans = 0;
    	int ans1 = 0;
    	int ans2 = 0;
    	int ans3 = 0;
    	
    	
        for(int i = 0;i <= A;i++){
            ans1 =+ 500 * i;
                    if(ans1 == X){
                        ans++;
                    	break;
                    }
        	for(int j = 0;j <= B; j++){
                ans2 =+ 100 * j;
                    if(ans2 == X){
                        ans++;
                    	break;
                    }
            	for(int k = 0;k <= C;k++){
                    ans3 =+ 50 * k;
                    if(ans3 == X){
                        ans++;
                    	break;
                    }
                }
            }
        }
        ans = ans1 + ans2 + ans3;
    	System.out.print(ans);
    }
}
}