public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		Integer array[] = new Integer[s.nextInt()];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		s.close();
		System.out.println(Main.calc(array));
	}

	private static int calc(Integer[] array) {
		java.util.Arrays.sort(array, java.util.Collections.reverseOrder());
		boolean alice=true;
		int res=0;
		for(Integer e:array) {
			res+=(alice)?e:-e;
			alice=(alice)?false:true;
		}
		return res;
	}
}