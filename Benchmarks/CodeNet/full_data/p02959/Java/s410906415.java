import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	     int N  = scan.nextInt();

	     List<Integer>monster = new ArrayList<Integer>();
	     	for(int i=0;i<N+1;i++) {
	     		monster.add(scan.nextInt());
	     	}
     	List<Integer>brave = new ArrayList<Integer>();
     	for(int i=0;i<N;i++) {
     		brave.add(scan.nextInt());
     	}


     	int count =0;
     	List<Integer>addPow = new ArrayList<Integer>();
     	addPow.add(0);
     	for(int i=0;i<N;i++) {
     		if(monster.get(i) >= (brave.get(i)+ addPow.get(i))) {
     			count += brave.get(i) + addPow.get(i);
     			addPow.add(0);
     			continue;
     		}
     		count += monster.get(i);
     		if(addPow.get(i) > monster.get(i)) {
     			addPow.add(brave.get(i));
     		}else {
     			addPow.add((brave.get(i) + addPow.get(i)) - monster.get(i));
     		}
     	}
     	
     	if(monster.get(N) < addPow.get(N) ) {
     		count += monster.get(N);
     	}else {
     		count +=   addPow.get(N);
     	}
     	System.out.println(String.valueOf(count));
	}
}