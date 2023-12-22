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
                    }
        	for(int j = 0;j <= B; j++){
                ans2 =+ 100 * j;
                    }
            	for(int k = 0;k <= C;k++){
                    ans3 =+ 50 * k;
                    if(and1 + and2 + and3 == X){
                        ans++;
                    	break
                    }
                }
            }
        }
    	System.out.print(ans);
    }
}
