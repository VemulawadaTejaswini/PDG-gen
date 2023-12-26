public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long count=0;
		long[] array=new long[3];
		Arrays.sort(array);
		int buff = Integer.parseInt(s.substring(0,4));
		int buff1 = Integer.parseInt(s.substring(5,7));
		if(buff>2019||buff1>4) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
	}
}
