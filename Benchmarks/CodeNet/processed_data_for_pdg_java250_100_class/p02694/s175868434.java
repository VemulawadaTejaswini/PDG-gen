public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
      	int count = 0; 
        long f = 100;
      	while (a > f)
       	{ f*= 1.01;
          count++;
        }				
		System.out.println(count);
	}
}
