import java.util.Scanner;

public class Main {

	static int N;

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	sc.close();
    	System.out.println(dfs(0, false, false, false));
    }

    static int dfs(long now, boolean is3, boolean is5, boolean is7){
    	if(now > N) return 0;
    	int ans = 0;
    	if(is3 && is5 && is7) ans++;
    	ans += dfs(now * 10 + 3, true, is5, is7);
    	ans += dfs(now * 10 + 5, is3, true, is7);
    	ans += dfs(now * 10 + 7, is3, is5, true);
    	return ans;
    }
}
