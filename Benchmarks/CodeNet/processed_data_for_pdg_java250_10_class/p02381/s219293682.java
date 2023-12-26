public class Main{
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
    		double total = 0.0; 
            double m = 0.0; 
            double a = 0.0; 
            double stdev = 0.0;
            int n = Integer.parseInt(sc.next());
        	if(n==0){
        		break;
        	}
        	int points[] = new int[n];
            for (int i=0; i<n; i++) {
                points[i] = Integer.parseInt(sc.next());
                total += points[i];
            }
            m = total / n;
            for (int i=0; i<n; i++) {
                a += ((points[i] - m)*(points[i] - m));
            }
            stdev = Math.sqrt(a/n);
            System.out.println(stdev);
        }
	}
}
