import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	List<Integer> hoge = new ArrayList<>();
      	for(int i = 0; i < n; i++) {
      		hoge.add(sc.nextInt());
      	}
      	
      	int s1 = 0, s2 = 0, min = 1000;
      	for(int j = 1; j <= n; j++) {
      		int q = 0;
      		for(Integer p:hoge) {
      			if(q <= j) s1+=p;
      			else s2+=p;
      			q++;
      		}
      		if(min > Math.abs(s1 - s2)) min = Math.abs(s1 - s2);
      		s1 = 0;
      		s2 = 0;
      	}
      	System.out.println(min);
    }
}