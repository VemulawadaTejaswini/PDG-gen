import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] p = new int[N];
		for(int i=0;i<N;i++){
			p[i] = scan.nextInt();
		}

		long[] a = new long[N+1];
		long[] b = new long[N+1];

		a[0]=b[0]=0;
		long tmp = N+1;
		for(long i=1;i<N+1;i++){
			a[(int)i] = i;
			b[N+1-(int)i] = tmp++;
		}

		long[] ab = new long[N+1];
		for(int i=1;i<N+1;i++){
			int index = p[i-1];
			ab[i] = a[index] + b[index];
		}
		for(int i=1;i<N;i++){
			while(ab[i]>=ab[i+1]){
				int index = p[i-1];
				for(int j=p[i];j>0;j--){
					b[j]++;//System.out.println("b++");
				}
				for(int j=index+1;j<N+1;j++){
					if(b[j-1]<=b[j]&&b[j]>0){
						b[j]--;//System.out.println("b--");
					}else{
						break;
					}
				}
				if(a[index]+b[index]>=a[p[i]]+b[p[i]]){
					for(int j=index+1;j<N+1;j++){
						a[j]++;//System.out.println("a++");
					}
				}
				for(int j=i;j<N+1;j++){
					int re = p[j-1];
					ab[j] = a[re] + b[re];
				}
			}
		}

		for(int i=1;i<N+1;i++){
			System.out.print(a[i]+" ");
		}System.out.println();
		for(int i=1;i<N+1;i++){
			System.out.print(b[i]+" ");
		}

		scan.close();
	}

	private static int search(int[] p,int number){
		int index = 0;
		for(int i=0;i<p.length;i++){
			if(p[i]==number){
				index = i;
			}
		}
		return index;
	}
}
