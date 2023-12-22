import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
      
      	int neta = a * 100;
      	int netb = b * 100;
      
      	List<Integer> wlist = new ArrayList<>();
      	List<Integer> slist = new ArrayList<>();
      
      	for(int i = 0; i <= f / neta; i++){
          for(int j = 0; j <= f / netb; j++){
            int total = neta * i + netb * j;
            if(total <= f) wlist.add(total);
          }
        }
      
      	for(int i = 0; i <= f / c; i++){
          for(int j = 0; j <= f / d; j++){
            int total = c * i + d * j;
            if(total <= f) slist.add(total);
          }
        }
      
      	float rate = 0;
      	int total = 0;
      	int s = 0;

        for(int i = 0; i < wlist.size(); i++){          
          for(int j = 0; j < slist.size(); j++){
            if(wlist.get(i) + slist.get(j) > f) continue;
            if(100 * slist.get(j) > wlist.get(i) * e) continue;
            
            if(100 * slist.get(j) > rate * wlist.get(i)){
              rate = 100 * slist.get(j) / (float)wlist.get(i);
              total = slist.get(j) + wlist.get(i);
              s = slist.get(j);
            }
          }
        }

        System.out.println(total + " " + s);
	}
}