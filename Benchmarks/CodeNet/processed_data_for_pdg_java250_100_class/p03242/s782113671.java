public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args){
		List <Integer> list = new ArrayList<Integer>();
		List <String> list2 = new ArrayList<String>();
		String s = sc.next();
		int answer = 0;
		String d = "";
		for(int i = 0;i <s.length();i++){
			list2.add(String.valueOf(s.charAt(i)));
		}
		for(int i = 0;i <list2.size();i++){
			if(list2.get(i).equals("9")){
				list2.set(i, "1");
			}else if(list2.get(i).equals("1")){
				list2.set(i, "9");
			}
			d += list2.get(i);
		}
		System.out.println(d);
		System.out.flush();
		sc.close();
	}
}
