import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int m = scan.nextInt();
	    int x = scan.nextInt()-1;
	    int a[]=new int[m];
	    for(int i=0;i<m;i++) {
	    	a[i]=scan.nextInt();
	    }
	    scan.close();
	    int check=0;
	    int cnt[]= {0,0};
	    for(int i=1;i<n;i++) {
	    	if(i==x)check=1;
	    	else {
	    		for(int j=0;j<m;j++) {
	    			if(a[j]==i) {
	    				cnt[check]+=1;
	    				break;
	    			}else if(a[j]>i)break;
	    		}
	    	}
	    }
	    System.out.println(Math.min(cnt[0], cnt[1]));
	}

}