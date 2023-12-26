public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int ans = 0; 
        double best = 100000000; 
        for(int n=1;n<=N;n++){
        	int h = sc.nextInt();
        	double temp = T - h*0.006; 
        	double err = Math.abs(A-temp); 
        	if(err<best){
        		best = err;
        		ans = n;
        	}
        }
        System.out.println(ans); 
    }
}
