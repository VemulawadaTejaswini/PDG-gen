import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static int h,w,ans=0;
	public static void main(String[] args) {
		h=sc.nextInt();
		w=sc.nextInt();
		int field[][]=new int[h][w];

		for(int i=0;i<h;i++){
			String s=sc.next();
			char c[]=s.toCharArray();
			for(int j=0;j<w;j++){
				if(c[j]=='#')field[i][j]=1;
			}
		}

		for(;;){
			boolean flag=false;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(field[i][j]==0){
						flag=true;
						int min=2147483646;
						if(i>0&&field[i-1][j]>0){
							min=Math.min(min, field[i-1][j]);
						}
						if(i<h-1&&field[i+1][j]>0){
							min=Math.min(min,field[i+1][j]);
						}
						if(j<w-1&&field[i][j+1]>0){
							min=Math.min(min,field[i][j+1]);
						}
						if(j>0&&field[i][j-1]>0){
							min=Math.min(min,field[i][j-1]);
						}
						if(min!=2147483646){
							ans=Math.max(min, ans);
							field[i][j]=min+1;
						}
					}
				}
			}
			if(flag==false)break;
		}
		System.out.println(ans);
	}
}

