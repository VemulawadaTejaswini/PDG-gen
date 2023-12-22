import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int X[][] = new int[n][d];
		for(int y=0;y<n;y++){
			for(int x=0;x<d;x++){
				X[y][x] = sc.nextInt();
			}
		}
		int dis[] = new int[1000];
		int count=0;
		for(int ya=0;ya<n;ya++){
			for(int yb=ya+1;yb<n;yb++){
				for(int x=0;x<d;x++){
					int tmp = X[ya][x] - X[yb][x];
					dis[count] += (int)Math.pow(tmp,2);
				}
				count++;
			}
		}
		int number=0;
		for(int i=0;i<count;i++){
			for(int j=1;j<200;j++){
				if(dis[i]==j*j){
					number++;	
				}
				
			}
		}
		System.out.println(number);

	}
}
