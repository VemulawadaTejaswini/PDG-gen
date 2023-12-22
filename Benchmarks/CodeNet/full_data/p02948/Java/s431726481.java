import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static final int MINUS_INF = -1001001001;

	public static void main(String[] args) {
		
		Main main = new Main();
		main.exec();
		
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		String[] firstArr = sc.nextLine().split(" ");
		int n = Integer.parseInt(firstArr[0]);
		int m = Integer.parseInt(firstArr[1]);
		ArrayList<Arbeit> arbeitList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String[] arbeitStrArr = sc.nextLine().split(" ");
			arbeitList.add(new Arbeit(Integer.parseInt(arbeitStrArr[1]), Integer.parseInt(arbeitStrArr[0])));
		}
		
		sc.close();
		
		Comparator<Arbeit> salaryComparator = Comparator.comparing(Arbeit::getSalary).reversed();
		Comparator<Arbeit> transferDateComparator = Comparator.comparing(Arbeit::getTransferDate).reversed();
		
		arbeitList.sort(transferDateComparator);
		arbeitList.sort(salaryComparator);
		
		int[] emptyScheList = makeSegmentTree(m+1);
//		System.out.println(Arrays.toString(emptyScheList));
		
		int sumOfSalary = 0;
		
		for(Arbeit arbeit : arbeitList) {
			
			int transferDate = arbeit.getTransferDate();
			int choice = m - transferDate;
			
			int arbeitDay = getMax(emptyScheList, 0,choice+1, 0, 0, m+1);
//			System.out.println(arbeitDay);
//			System.out.println(Arrays.toString(emptyScheList));
			
			if(arbeitDay == m) {
				return;
			}
			if(arbeitDay >= 0) {
				updateSegTree(emptyScheList, arbeitDay, MINUS_INF);
				sumOfSalary += arbeit.getSalary();
			}
		}
		System.out.println(sumOfSalary);
//		System.out.println(Arrays.toString(emptyScheList));
	}

	/**
	 * 0-n-1を葉に持つsegment木を作る
	 * @param intArr
	 * @param n
	 */
	public int[] makeSegmentTree(int n) {
		int[] intArr = new int[2*n-1]; 
		for(int i = n - 1; i >= 0; i--) {
			intArr[intArr.length - (n - i)] = i;
		}
		
		for(int i = n -2; i >= 0; i--) {
			intArr[i] = Math.max(intArr[2*i + 1], intArr[2*i+2]);
		}
		return intArr;
	}
	
	public int getMax(int[] segTree, int a, int b, int k, int l, int r) {
		
		if(r <= a || b <= l) {
			return MINUS_INF;
		}
		
		if(a <= l && r < b ) {
			return segTree[k];
		}
		
		return Math.max(getMax(segTree, a, b, 2*k+1,l, (r+l)/2) , getMax(segTree, a,b,2*k+2, (l+r)/2, r));
	}
	
	public void updateSegTree(int[] segTree, int pos, int value) {
		pos += (segTree.length + 1)/2 - 1;
		segTree[pos] = value;
		while(pos > 0) {
			pos = (pos - 1) / 2;
			segTree[pos] = Math.max(segTree[pos*2 +1], segTree[pos*2 +2]);
		}
	}
	
	public class Arbeit{
		int salary;
		int transferDate;
		
		public Arbeit(int salary, int transferDate){
			this.salary = salary;
			this.transferDate = transferDate;
		}
		
		public int getSalary() {
			return this.salary;
		}
		public int getTransferDate(){
			return this.transferDate;
		}
	}
}
