import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int count = 0;
		for(int i=0;i<H;i++){
			String s = scan.next();
			for(int j=0;j<W;j++){
				if(s.substring(j, j+1).equals("#")){
					count++;
				}
			}
		}
		if(count==H+W-1){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}
		scan.close();
	}
}
