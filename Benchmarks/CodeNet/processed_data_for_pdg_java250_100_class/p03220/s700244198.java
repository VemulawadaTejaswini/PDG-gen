public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double t = sc.nextDouble();
		double a = sc.nextDouble();
		int result = 0;
		double min = Double.MAX_VALUE;
		for(int i = 0; i < n; i++){
		    double h = sc.nextDouble();
		    if(abs(a - (t - h * 0.006)) < min){
		        result = i + 1;
		        min = abs(a - (t - h * 0.006));
		    }
		}       
		System.out.println(result);
	}
}
