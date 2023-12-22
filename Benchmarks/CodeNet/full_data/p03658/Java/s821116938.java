public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int k= s.nextInt();
		Integer array[] = new Integer[n];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		s.close();
		System.out.println(Main.calc(n,k,array));
	}

	private static int calc(int n,int k,Integer[] array) {
		java.util.Arrays.sort(array, java.util.Collections.reverseOrder());
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=array[i];
		}
		return sum;
	}
}