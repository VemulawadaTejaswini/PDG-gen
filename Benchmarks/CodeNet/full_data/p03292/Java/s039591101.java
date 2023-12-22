import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		ArrayList<Integer> listA = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		listA.add(a);
		listA.add(b);
		listA.add(c);

		ArrayList<Integer> listB = new ArrayList<Integer>(new HashSet<>(listA));
		
		Collections.sort(listB);

		int cost = 0;
		
		//最大の数から素数を探す
		for(int i = 1;i < listB.size();i++)
		{
			int tmp =  listB.get(i-1) - listB.get(i);
			cost = cost + Math.abs(tmp);
		}

   		System.out.println(cost);
   		sc.close();
        return ;

    }
    
}

