import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
        int B = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        for(int i = 0; i < A; i++){
        	a[i] = sc.nextInt();
        }
        for(int i = 0; i < B; i++){
        	b[i] = sc.nextInt();
        }
        int dis = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
        	int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
            int disnow = a[x - 1] + b[y - 1] - c;
            dis = Math.min(dis, disnow);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Math.min((a[0] + b[0]), dis));
	}
}