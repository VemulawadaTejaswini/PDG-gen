import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		int maxAbs=0;
		int argMaxAbs=0;
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(Math.abs(a[i])>maxAbs) {
				maxAbs=Math.abs(a[i]);
				argMaxAbs=i;
			}
		}
		int count=0;
		int[] first=new int[2*n];
		int[] second=new int[2*n];
		if(a[argMaxAbs]>0) {
			for (int i=0;i<n-1;i++) {
				while(a[i]>a[i+1]) {
					first[count]=argMaxAbs+1;
					second[count]=i+2;
					count++;
					a[i+1]+=a[argMaxAbs];
					if(Math.abs(a[i+1])>maxAbs) {
						maxAbs=Math.abs(a[i+1]);
						argMaxAbs=i+1;
					}
				}
			}
		}
		else if (a[argMaxAbs]<0){
			for (int i=n-1;i>0;i--) {
				while(a[i-1]>a[i]) {
					first[count]=argMaxAbs+1;
					second[count]=i;
					count++;
					a[i-1]+=a[argMaxAbs];
					if(Math.abs(a[i-1])>maxAbs) {
						maxAbs=Math.abs(a[i-1]);
						argMaxAbs=i-1;
					}
				}
			}
		}
		System.out.println(count);
		for(int i=0;i<count;i++) {
			System.out.println(first[i]+" "+second[i]);
		}
	}

}
