public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tmp;
		int[] x;
		x = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(x[i]>x[j]){
					tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
		sc.close();
	}
}
