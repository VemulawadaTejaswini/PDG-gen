import java.util.*;

class Main{
	public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
      	Set<Integer> moti = new HashSet<>();
      	
      	for(int i = 0; i < N; i++){
        	int di = sc.nextInt();
        	moti.add(di);
        }
      	System.out.println(moti.size());
    }
}
