import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		Restaurant[] r=new Restaurant[N];

		for(int i=0;i<N;i++) r[i]=new Restaurant(sc.next(),sc.nextInt(),i+1);

		Arrays.sort(r);


		for(int i=0;i<N;i++) {
			System.out.println(r[i].row);
		}

		sc.close();

	}

}

class  Restaurant implements Comparable<Object>{

	String name;
	int score;
	int row;

	public Restaurant(String name,int score,int row) {
		this.name=name;
		this.score=score;
		this.row=row;
	}

	public int compareTo(Object object) {

		Restaurant r=(Restaurant)object;

		if(this.name.compareTo(r.name)==0) {
			return r.score-this.score;
		}else {
			return this.name.compareTo(r.name);
		}

	}
}

