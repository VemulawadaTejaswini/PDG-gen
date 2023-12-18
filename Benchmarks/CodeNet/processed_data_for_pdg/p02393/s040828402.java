public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		int kari=0;
		for(int i=0;i<3;i++) {
			for(int j=2;j>i;j--) {
				if(a[j]<a[j-1]) {
					kari=a[j];
					a[j]=a[j-1];
					a[j-1]=kari;
				}
			}
		}
		for(int i=0;i<3;i++) {
			System.out.printf(a[i]+"");
			if(i==2) {
				System.out.println("");
			}else {
				System.out.printf(" ");
			}
		}
	}
}
