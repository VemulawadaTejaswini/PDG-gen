import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
        int n,m;
        int ans;
      	int t;
        int x;
      	int num[][] = new int[h*w+1][2];
        for(n=0;n<h;n++){
        	for(m=0;m<w;m++){
            	x = sc.nextInt();
                num[x][0]=n;
                num[x][1]=m;
            }
        }
      	int q = sc.nextInt();
        int l;
        int r;
      	for(n=0;n<q;n++){
            l = sc.nextInt();
            r = sc.nextInt();
            ans = 0;
        	int s = (r-l)/d;
            for(t=0;t<s;t++){
                ans += Math.abs(num[l+d*(t+1)][0]-num[l+d*t][0])+Math.abs(num[l+d*(t+1)][1]-num[l+d*t][1]);
            }
       		System.out.println(ans);
        }
	}
}
