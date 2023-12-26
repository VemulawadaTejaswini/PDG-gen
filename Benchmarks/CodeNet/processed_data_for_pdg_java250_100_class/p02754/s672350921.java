public class Main {
	public static void main(final String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long hoge1 = n / (a + b);
        long hoge2 = n % (a + b);
        long count = 0;
        count = hoge1 * a;
        if(hoge2 >= a){
            count += a;
        }else{
            count += hoge2;
        }
        System.out.println(count);
	}
}
