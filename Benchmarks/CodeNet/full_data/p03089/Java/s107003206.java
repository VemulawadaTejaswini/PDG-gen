
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		StringBuilder str = new StringBuilder();
		List<Integer> b = new ArrayList<>();
		//int[] b = new int[N];
		for(int i=0; i<N; i++){
			b.add(Integer.parseInt(sc.next()));
		}
		boolean flag = true;
		while(b.size()>0){
			flag = true;
			for(int i=b.size()-1; i>=0; i--){
				if(b.get(i) == i+1){
					b.remove(i);
					str.insert(0,""+(i+1)+"\n");
					flag = false;
					break;
				}
			}
			
			//System.out.println(b.size());
			if(flag)break;
		}
		if(flag){
			System.out.println("-1");
		}else{
			System.out.println(str);
		}
		
		sc.close();
	}

	
}
