public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean check = true;
		Integer temp;
		while(check) {
			temp = scan.nextInt();
			if(temp.equals(0)) {
				check = false;
			}else {
				list.add(temp);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Case" + " " + (i + 1) + ": " + list.get(i));
		}
	}
}
