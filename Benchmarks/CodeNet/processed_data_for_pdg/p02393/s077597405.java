public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a;
		a = new int[3];
		for(int i=0;i<3;i++){
		a[i] = sc.nextInt();
		}
		for(int i=0;i<2;i++){
			for(int j=2;j>i;j--){
				if(a[j-1]>a[j]){
					int tmp=a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
				}
			}
		}
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		sc.close();
	}
}
