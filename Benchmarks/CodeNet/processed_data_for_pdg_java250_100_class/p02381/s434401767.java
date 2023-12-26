class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        	int n = sc.nextInt();
        	double[] db = new double[n];
        	double sum = 0;
        	double m = 0;
        	if( n == 0 ){
        		break;
        	}
        	for(int i = 0 ; i < n ; i++ ){
        		double s = sc.nextDouble();
        		db[i] = s;
        		sum = sum + s;
        	}
        	m = sum / n;
        	double sum2 = 0;
        	for(int i = 0 ; i < db.length ; i++ ){
        		db[i] = (db[i] - m) * (db[i] - m);
        		sum2 = sum2 + db[i];
        	}
        	double a = Math.sqrt(sum2 / n);
        	System.out.println(a);
        }
    }
}
