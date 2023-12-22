import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		C_73 c_73 =new C_73();
		int N = sc.nextInt();
		int num;
		for(int i=0;i<N;i++) 
		{
			num = sc.nextInt();
			if(c_73.search(list, num)==false) list.add(num);
			else								 list.remove(c_73.Idx(list, num));
		}
		System.out.println(list.size());
	}
	
	boolean search(ArrayList<Integer> list,int target) 
	{
		for(int i=0;i<list.size();i++) 
			if(list.get(i) == target) return true;
		return false;
	}
	int Idx(ArrayList<Integer> list,int n) 
	{
		int idx=0;
		for(int i=0;i<list.size();i++) 
			if(list.get(i) == n) idx = i;
		return idx;
	}
	
}
