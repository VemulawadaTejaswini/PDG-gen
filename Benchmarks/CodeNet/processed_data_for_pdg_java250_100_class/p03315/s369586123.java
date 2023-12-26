public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long count=0;
		for(int i=0;i<=3;i++) {
			if(s.substring(i,i+1).equals("+")) {
				count++;
			}else {
				count--;
			}
		}
		System.out.println(count);
	}
}
