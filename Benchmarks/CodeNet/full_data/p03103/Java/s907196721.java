import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[n][2];
		for(int i = 0; i < ab.length; i++){
			for(int j = 0; j < ab[i].length; j++){
				ab[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < ab.length; i++){
			a.add(ab[i][0]);
		}
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < ab.length; i++){
			b.add(ab[i][1]);
		}
		
		int min = Integer.MAX_VALUE;
		int posi = 0;
		long sum = 0L;
		while(true){
			for(int i = 0; i < a.size(); i++){
				if( a.get(i) < min ){
					min = a.get(i);
					posi = i;
				}
			}
			if( b.get(posi) < m){
				sum += (long)a.get(posi) * (long)b.get(posi) ;
			}else{
				sum += (long)m * (long)a.get(posi);
			}
			m -= b.get(posi);
			if( m <= 0 ){
				break;
			}
			a.remove(posi);
			b.remove(posi);
			min = Integer.MAX_VALUE;
		}
		System.out.println(sum);
	}
}