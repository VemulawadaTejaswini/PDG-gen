import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int N=sc.nextInt();
		int[]a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		int[][]color=new int[W][H];
		int x=0;
		int y=0;
		for(int i=0;i<N;i++){
			while(a[i]>0){
				color[x][y]=i+1;
				a[i]--;
				
				if(y%2==0){
					if(x==W-1){
						y++;
					}else{
						x++;
					}
				}else{
					if(x==0){
						y++;
					}else{
						x--;
					}
				}
			}
		}
		for(int yi=0;yi<H;yi++){
			for(int xi=0;xi<W;xi++){
				System.out.print(color[xi][yi]);
				if(xi!=W-1)System.out.print(" ");
			}
			System.out.println();
		}
	}
}