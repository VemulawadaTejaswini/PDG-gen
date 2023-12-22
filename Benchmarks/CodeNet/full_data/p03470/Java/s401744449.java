import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		  Scanner sc = new Scanner(System.in);
		  
		  int N = sc.nextInt();
		  int array [] = new int [N];

		  List<Integer> listA = new ArrayList<Integer>();
		  for(int i = 0; i<N;i++) {
			listA.add(sc.nextInt());
		  }
		  
		  List<Integer> listB = new ArrayList<Integer>(new HashSet<>(listA));
		  
		  
		  //Arrays.sort(array);
		  //System.out.println(Arrays.toString(array));
		   	   
		  System.out.println(listB.size());

	}

}
