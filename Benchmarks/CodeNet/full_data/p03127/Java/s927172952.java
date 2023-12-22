import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++){
		    int a = sc.nextInt();
		    list.add(a);
		}
		Collections.sort(list);
//		System.out.println(list);
		
		boolean flag=true;
		
		while(flag){
		    int smallest = list.get(0);
            int nextSmallest = list.get(1);
            int calclated = nextSmallest-smallest;
//            System.out.println(calclated);
            if(calclated <=0){
                flag=false;
            }else{
                list.add(0, calclated);
            }
		}
		

        System.out.println(list.get(0));
 
	}
}