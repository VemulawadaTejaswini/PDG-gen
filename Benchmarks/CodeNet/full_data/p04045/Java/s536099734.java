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
		ArrayList<String> alList=new ArrayList<>();
		for(int i=0;i<10;i++) {
			if(!al.contains(i)) {
				
				alList.add(""+i);
			}
		}
		Collections.reverse(alList);

	String sb="";
		int j=0;
		int i=0;
	while(i<n.length()&&j<alList.size()) {
		if(Integer.parseInt(""+n.charAt(i))<=Integer.parseInt(""+alList.get(j))) {
			if(Integer.parseInt(""+n.charAt(i))<=Integer.parseInt(""+alList.get(j+1))) {
				sb+=alList.get(j+1);
				i++;
			}else {
			sb+=alList.get(j);
			i++;
			}
		}else {
			j++;
		}
	
		
}
	System.out.println(sb);
		
		
	}
	
	static void readArray(int[] arr,Scanner sc) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	
	

}
