public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean  flg = true;
		while (flg) {
	        list.add(Integer.valueOf(scanner.nextInt()));
	        for(int i=0; i<list.size(); i++){
	        	if(list.get(i) == 0){
	        		list.remove(i);
	        		flg = false;
	        		break;
	        	}
	        }
		}
		for(int i=0; i<list.size(); i++){
			System.out.println("Case " + (i+1) + ": " + list.get(i));
		}
	}
}
