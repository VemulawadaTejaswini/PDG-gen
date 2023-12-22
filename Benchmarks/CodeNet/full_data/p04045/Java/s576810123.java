import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=""+sc.nextInt();
		int k=sc.nextInt();

	
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<k;i++) {
			al.add(sc.nextInt());
		}
	TreeSet<Integer> pq=new TreeSet<>();
		for(int i=0;i<10;i++) {
			if(!al.contains(i)) {
				
				pq.add(i);
			}
		}

	String sb="";
		
		int i=0;
	while(i<n.length()) {
		if(pq.contains(pq.ceiling(Integer.parseInt(""+n.charAt(i))))) {
		sb+=pq.ceiling(Integer.parseInt(""+n.charAt(i)));
	}else {
		sb+=sb+=pq.floor(Integer.parseInt(""+n.charAt(i)));
	}
	i++;
	
		
}
	System.out.println(sb);
		
		
	}
	
	static void readArray(int[] arr,Scanner sc) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	
	

}
