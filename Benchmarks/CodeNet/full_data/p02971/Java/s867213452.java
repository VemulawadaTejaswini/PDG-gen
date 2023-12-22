import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			int tmp[] = new int[n];
			for(int j=0;j<a.length;j++){
				if(j!=i){
					tmp[j] = a[j];
				}else{
					tmp[j] = 0;
				}
			}

			for(int j=0;j<a.length-1;j++){
				for(int k=1;k<a.length;k++){
					if(tmp[k-1]<tmp[k])
					{
						int t = tmp[k];
						tmp[k] = tmp[k-1];
						tmp[k-1] = t;
					}
				}
			}
			System.out.println(tmp[0]);
		}

	}
}
