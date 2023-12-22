import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int m1 = 0, m2 = 0;
		int index1 = 0, index2 = 0;
		ArrayList<int[]> indexX = new ArrayList<int[]>();
		
		for(int i = 0; i < N; i++){
			int index = i;
			int X = sc.nextInt();
			int[] ix = {index, X};
			indexX.add(ix);
		}
		
		Collections.sort(indexX, new XComparator());
		
		for(int i = 0; i < N; i++){
			if(i == (N + 1) / 2 - 1){
				m1 = indexX.get(i)[1];
				index1 = indexX.get(i)[0];
			}
			if(i == (N + 1) / 2){
				m2 = indexX.get(i)[1];
				index2 = indexX.get(i)[0];
			}
		}
		
		for(int i = 0; i < N; i++){
			if(i <= (N + 1) / 2 - 1){
				indexX.get(i)[1] = m2;
			}else{
				indexX.get(i)[1] = m1;
			}
		}
		
		Collections.sort(indexX, new indexComparator());
		
		for(int i = 0; i < N; i++){
			System.out.println(indexX.get(i)[1]);
		}
		
		/*
		for(int i = 0; i < N; i++){
			System.out.println(indexX.get(i)[0] + " " + indexX.get(i)[1]);
		}
		System.out.println(m1 + " " + m2);
		System.out.println(index1 + " " + index2);
		*/
	}
	
	public static class XComparator implements Comparator<int[]> {
		@Override
		public int compare(int[] indexX1, int[] indexX2) {
			return indexX1[1] < indexX2[1] ? -1 : 1;
		}
	}
	
	public static class indexComparator implements Comparator<int[]> {
		@Override
		public int compare(int[] indexX1, int[] indexX2) {
			return indexX1[0] < indexX2[0] ? -1 : 1;
		}
	}
}