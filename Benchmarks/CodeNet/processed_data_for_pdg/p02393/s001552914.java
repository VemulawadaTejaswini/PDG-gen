public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int min,temp, top = 0,index = 0;
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) 
			a[i] = scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			index = i;
			for(int j = top; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					index = j;
				}
			}
			top++;
			temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}
