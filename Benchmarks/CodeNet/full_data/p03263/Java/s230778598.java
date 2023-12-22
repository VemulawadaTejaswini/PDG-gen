import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] a = new int[h][w];
		for(int i = 0; i<h; i++){
			for(int j = 0; j<w; j++){
				a[i][j]=sc.nextInt();
			}
		}
		StringBuilder sb= new StringBuilder();
		int count=0;
		int hi=0;
		int wj=0;
		int c=0;
		for(int i = 0; i<h; i++){
			for(int j = 0; j<w; j++){
				if(a[i][j]%2==1){
					if(c==1){
						if(Math.abs(hi-i)!=0){
							if(a[hi][wj]==1){
								for(int k=1; k<=Math.abs(hi-i);k++ ){
									sb.append(i+2-k).append(" ").append(j+1).append(" ").append(i-k+1).append(" ").append(j+1).append("\n");	
									count++;
								}
							}else{
								for(int k=1; k<=Math.abs(hi-i);k++ ){
									sb.append(hi+k).append(" ").append(wj+1).append(" ").append(hi+k+1).append(" ").append(wj+1).append("\n");	
									count++;
								}
							}
						}
						if(Math.abs(wj-j)!=0){
							if(a[hi][wj]==1){
								for(int y=1; y<=Math.abs(wj-j);y++ ){
									sb.append(i+1-Math.abs(hi-i)).append(" ").append(j+2-y).append(" ").append(i+1-Math.abs(hi-i)).append(" ").append(j+1-y).append("\n");	
									count++;
								}
							}else{
								for(int y=1; y<=Math.abs(wj-j);y++ ){
									sb.append(hi+1+Math.abs(hi-i)).append(" ").append(wj+y).append(" ").append(hi+1+Math.abs(hi-i)).append(" ").append(wj+1+y).append("\n");	
									count++;
								}
							}
						}
						c=0;
					}else{
						c=1;
						hi=i;
						wj=j;
					}
				}
			}
		}
		System.out.println(count);
		System.out.print(sb);
	}
}