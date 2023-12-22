    import java.util.Scanner;

    public class Main {

    	public void solve(String[] args) {

          	 Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int cst = 0;
        int tmp1=0;
        int tmp2=0;

        for (int i = 0;i<n;i++) {
        	tmp1 = sc.nextInt();
        	tmp2 = sc.nextInt();
        	if(tmp2<=t) {
        		if(cst==0) {
        			cst=tmp1;
        		}else {
        			if(tmp1<=cst) {
        				cst=tmp1;
        			}
        		}
        	}
        }
        if(cst!=0) {
        	System.out.println(cst);
        }else {
        	System.out.println("TLE");
        }

    }
    	}
    