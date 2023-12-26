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
		if(m%2!=0) {
			System.out.println("No");
			System.exit(0);
		}
		for(int i=0;i<s.length()/2;i++) {
			if((char)s.charAt(i)!=(char)s.charAt(i+s.length()/2)) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
