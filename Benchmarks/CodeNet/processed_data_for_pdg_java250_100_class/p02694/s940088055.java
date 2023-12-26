public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long X = sc.nextLong();
    	int year = 0;
    	long sum = 100;
    	while(sum < X) {
    		year = year + 1;
    		sum = (long) (sum + Math.floor(sum * 0.01));
    	}
    	System.out.println(year);
    }
}
