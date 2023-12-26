public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		long count=0;
		int[] array = new int[3];
		Arrays.sort(array);
		for(int i=0;i<3;i++) {
			if(s.substring(i,i+1).equals(s.substring(i+1,i+2))) {
				count=1;
				break;
			}
		}
		if(count==0) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}
