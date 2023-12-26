public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t= sc.next();
		long count=0;
		long count1=0;
		int[] array = new int[3];
		Arrays.sort(array);
		for(int i=0;i<3;i++) {
			if(s.substring(i,i+1).equals(t.substring(i,i+1))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
