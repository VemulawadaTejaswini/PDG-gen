public class Main{
	public static void main(String[]args) {
		int higth[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10 ; i++)higth[i]=sc.nextInt();
		Arrays.sort(higth);
		System.out.println(higth[9]);
		System.out.println(higth[8]);
		System.out.println(higth[7]);
	}
}
