import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Drinc{
	int A;

	long B;


	Drinc(int A,long B){
		this.A = A;
		this.B = B;
	}
}

class DrincSort implements Comparator<Drinc>{

	@Override
	public int compare(Drinc o1, Drinc o2) {
		// TODO 自動生成されたメソッド・スタブ
		return o1.A < o2.A ? -1:1;
	}
}

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int ans = 0;

		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());

		ArrayList<Drinc> drincList = new ArrayList<Drinc>();

		for(int i = 0;i< N;i++){
			int A = Integer.parseInt(scan.next());
			long B = Long.parseLong(scan.next());
			Drinc drinc = new Drinc(A,B);
			drincList.add(drinc);
		}

		Collections.sort(drincList, new DrincSort());

		for(int i = 0; i < drincList.size(); i++){
			long honsu = drincList.get(i).B;
			if(M < honsu){
				ans += (drincList.get(i).A * M);
			}else{
				ans += (drincList.get(i).A * honsu);
				M -= honsu;
			}
		}

		System.out.println(ans);
	}


}