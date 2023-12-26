public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args){
		ArrayList <Integer> list = new ArrayList<Integer>();
		int a = Integer.parseInt(sc.next());
		int total = 0;
		String answer;		
		for(int i = 0;i<a;i++){
			list.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(list);
		for(int i = 0;i<a-1;i++){
			total += list.get(i);
		}
		if(list.get(a-1)<total){
			answer = "Yes";
		}else{
			answer = "No";
		}
		System.out.println(answer);
		System.out.flush();
		sc.close();
	}
}
