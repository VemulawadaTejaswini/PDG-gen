public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int[][] a = new int[s.nextInt()][s.nextInt()];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(isSeisuDistance(a[i],a[j])) {
					sum++;
				}
			}
		}
		System.out.println(sum);

	}

	public static boolean isSeisuDistance(int y[], int z[]) {
		long sum = 0;
		for(int i=0;i<y.length;i++) {
			int diff = y[i]-z[i];
			sum += diff*diff;
		}
		double distance = Math.sqrt(sum);
		long dislong = (long)distance;

		return (dislong*dislong == sum)?true:false;
	}
}
