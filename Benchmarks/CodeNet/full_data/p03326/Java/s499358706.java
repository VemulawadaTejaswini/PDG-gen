import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long xyz[][] = new long[N][3];
		for(int i=0;i<N;i++) {
			long x = sc.nextLong(),y = sc.nextLong() ,z = sc.nextLong();
			xyz[i][0]=x;
			xyz[i][1]=y;
			xyz[i][2]=z;
		}
		sc.close();
		
		//各項目について、正負のどちらとして足すかで場合分け
		int pmset[][] = {{-1,1,1},{-1,-1,1},{-1,1,-1},{-1,-1,-1},{1,-1,1},{1,-1,-1},{1,1,-1},{1,1,1}};
		
		long points[][] = new long[8][N];
		
		for(int i=0;i<pmset.length;i++) {		
			int first = pmset[i][0], second=pmset[i][1], third=pmset[i][2];			
			for(int j=0;j<N;j++) {
				long sum = 0;
				for(int k=0;k<3;k++) {
					if(pmset[i][k]==1) {
						sum += xyz[j][k];
					}
					else {
						sum -= xyz[j][k];
					}
				}
				points[i][j]=sum;
			}
		}
		
		long ans = 0;
		for(int i=0;i<8;i++) {
			long tmp[] = points[i];
			rsort(tmp);
			long sum = 0;
			for(int j=0;j<M;j++) {
				sum += tmp[j];
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
		
	}
	static void rsort(long array[]) {
		Arrays.sort(array);
		int len = array.length;
		for(int i=0;i<len/2;i++) {
			long tmp = array[i];
			array[i]=array[len-1-i];
			array[len-1-i]=tmp;
		}
	}
}

