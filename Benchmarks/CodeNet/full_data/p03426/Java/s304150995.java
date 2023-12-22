import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
        int n,m;
        int ans = 0;
		int masu[][] = new int[h][w];
        for(n=0;n<h;n++){
        	for(m=0;m<w;m++){
            	masu[n][m] = sc.nextInt();
            }
        }
      	int num[][] = new int[h*w+1][2];
        for(n=0;n<h;n++){
        	for(m=0;m<w;m++){
            	num[masu[n][m]][0]=n;
                num[masu[n][m]][1]=m;
            }
        }
      	int q = sc.nextInt();
        int lr[][] = new int[q][2];
      	for(n=0;n<q;n++){
        	for(m=0;m<2;m++){
            	lr[n][m] = sc.nextInt();
            }
        }
      	for(n=0;n<q;n++){
        	int s = (lr[n][1]-lr[n][0])/d;
          	int p = lr[n][0];
            for(int t=0;t<s;t++){
                ans += Math.abs(num[p+d*(t+1)][0]-num[p+d*t][0]);
                ans += Math.abs(num[p+d*(t+1)][1]-num[p+d*t][1]);
            }
        System.out.println(ans);
        }
	}
}
