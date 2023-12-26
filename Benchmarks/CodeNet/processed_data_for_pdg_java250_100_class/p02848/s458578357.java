public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buff= "";
		int m = sc.nextInt();
		String s=sc.next();
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		int[] array = new int[3];
		Arrays.sort(array);
		for(int i=0;i<s.length();i++) {
			if((char)(s.charAt(i)+m)>'Z') {
				buff+=String.valueOf((char)(s.charAt(i) + m-26));
			}else {
				buff+=String.valueOf((char)(s.charAt(i) + m));
			}
		}
		System.out.println(buff);
	}
}
