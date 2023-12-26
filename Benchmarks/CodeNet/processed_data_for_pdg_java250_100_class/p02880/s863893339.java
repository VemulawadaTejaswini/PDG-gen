public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buff= "";
		int m = sc.nextInt();
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		int[] array = new int[100];
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				array[count3]=i*j;
				count3++;
			}
		}
		for(int i=0;i<100;i++) {
			if(array[i]==m) {
				count=1;
				break;
			}
		}
		if(count==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
