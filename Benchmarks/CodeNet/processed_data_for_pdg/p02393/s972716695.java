public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int[] a = new int[3];
		a[0] = sin.nextInt();
		a[1] = sin.nextInt();
		a[2] = sin.nextInt();
		java.util.Arrays.sort(a);
		System.out.println(a[0] + " " + a[1] + " " + a[2]);	
	}
}
