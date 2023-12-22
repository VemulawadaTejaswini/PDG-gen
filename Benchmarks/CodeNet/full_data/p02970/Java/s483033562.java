import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int human = 0;

        for(int i=1; i<n; i++) { 
        	int down = i - d;
        	int up = i + d;
        	if(up<n){
        		i += up;
        	}
        	human++;
        }
        System.out.println(human);

	}

}