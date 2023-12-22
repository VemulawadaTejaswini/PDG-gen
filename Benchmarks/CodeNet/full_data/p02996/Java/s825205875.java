import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Long>> a = new ArrayList<ArrayList<Long>>();
		long cnt = sc.nextLong();
		for(int i = 0; i < cnt; i++){
		    long b = sc.nextLong();
		    long c = sc.nextLong();
		    ArrayList<Long> po = new ArrayList<Long>();
		    po.add(b);po.add(c);
		    a.add(po);
		}
		
		long now = 0;
		
		while(!a.isEmpty()){
		    long min = a.get(0).get(1);
		    long time = a.get(0).get(0);
		    int l = 0;
		    for(int i = 1;i < a.size(); i++){
		        if(min > a.get(i).get(1)){
		            min = a.get(i).get(1);
		            time = a.get(i).get(0); 
		            l = i;
		        }
		    }
		    a.remove(l);
		    now  += time;
		    if(now > min){
		        System.out.println("No");
		        return;
		    }
		}
		System.out.println("Yes");

	}

}