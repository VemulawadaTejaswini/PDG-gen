import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=String.valueOf(sc.nextInt());
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
//		for(int i:pq) {
//			System.out.println(i);
//		}

	String sb="";
		
		int i=0;
		int count=0;
	while(i<n.length()) {
		if(i>0&&Integer.parseInt(""+sb.charAt(0))>Integer.parseInt(""+n.charAt(0))) {
			sb+=pq.floor(Integer.parseInt(""+n.charAt(0)));
			count++;
			i++;
			continue;
		}else if(pq.contains(pq.ceiling(Integer.parseInt(""+n.charAt(i))))&&count<1) {
		
		sb+=pq.ceiling(Integer.parseInt(""+n.charAt(i)));
		
	}else {
		sb+=pq.floor(Integer.parseInt(""+n.charAt(i)));
	}
	i++;
	
		
}
	System.out.println(Integer.parseInt(sb));
		
		
	}
	
	static void readArray(int[] arr,Scanner sc) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	
	

}
