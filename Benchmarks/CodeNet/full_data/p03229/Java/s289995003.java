import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String n1 = sn.nextLine();
		int n = Integer.parseInt(n1);
		int result = 0;

		for(int i=0; i < n; i++) {
		    String str = sn.nextLine();
		    list.add(Integer.parseInt(str));
		}
		Collections.sort(list);
		result = result + list.get(n-1) - list.get(0);
		result = result + list.get(n-2) - list.get(0);
		
		for(int j = 1; j < n/2; j++) {
			result = result + list.get(n-j) -list.get(j);
			result = result + list.get(n-j-2) -list.get(j);
		}
		System.out.println(result);
	}

}
