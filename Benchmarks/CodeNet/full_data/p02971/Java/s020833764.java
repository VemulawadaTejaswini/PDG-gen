import java.util.*;
public class Main{
    public static void main(String sp[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());	
		}
		Collections.sort(al,Collections.reverseOrder());
		int max = al.get(0);
		int smax= al.get(1);
		
		for(int i=0;i<n;i++){
			int val = al.get(i);
			if(val==max){
				System.out.println(smax);
			}else if(val!=max){
				System.out.println(max);
			}
		}
	}
}