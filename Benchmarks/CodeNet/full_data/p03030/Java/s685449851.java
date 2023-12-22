import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static class shop implements Comparable<shop>{
		shop(String name,int point,int number){
			this.name=name;
			this.point=point;
			this.number=number;
		}
		String name;
		int point;
		int number;

		public int compareTo(shop obj) {
				int r1=this.name.compareTo(obj.name);
				if(r1!=0) {
					return r1;
				}
				return obj.point-this.point;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<shop> array = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			shop temp = new shop(sc.next(),sc.nextInt(),i);
			array.add(temp);
		}

		Collections.sort(array);
		for(int i=0;i<n;i++) {
		System.out.println(array.get(i).number);
		}
	}
}
