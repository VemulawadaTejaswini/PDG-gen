import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int [][] masu=new int[n][3];
	    for(int i=0;i<n;i++) {
	    	masu[i][0]=sc.nextInt();
	    	masu[i][1]=sc.nextInt();
	    	masu[i][2]=sc.nextInt();
	    	}
	    for(int x=0;x<=100;x++) {
	    	for(int y=0;y<=100;y++) {
	    		for(int h=1;h<=1000;h++) {
	    			boolean a=true;
	    			for(int i=0;i<n;i++) {
	    				if(masu[i][2]!=Math.max(h-Math.abs(x-masu[i][0])-Math.abs(y-masu[i][1]),0))
	    					a=false;
	    			}
	    			if(a) {
	    				System.out.print(x+" "+y+" "+h);
	    				break;
	    			}
	    		}
	    		
	    	}
	    }
		

	}

}
