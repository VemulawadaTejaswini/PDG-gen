import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt(),w=sc.nextInt();
		int[][] a=new int[h][w];
		for(int i=0;i<h;i++) {
			String buff=sc.next();
			for(int j=0;j<w;j++) {
				if(buff.substring(j,j+1).equals("#")) {
					a[i][j]=1;
				}else {
					a[i][j]=0;
				}
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				boolean flag=false;
				if(a[i][j]==1) {
					if(i!=0&&a[i-1][j]==1)flag=true;
					if(j!=0&&a[i][j-1]==1)flag=true;
					if(i!=h-1&&a[i+1][j]==1)flag=true;
					if(j!=w-1&&a[i][j+1]==1)flag=true;
				}
				if(!flag&&a[i][j]==1) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
	}
}

