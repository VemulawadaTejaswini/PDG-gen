class Main{
	public static void main(String[] args){
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x != 0){
			array.add(x);
			x = scan.nextInt();
		}
		int size = array.size();
		for(int i = 0; i < size; i++){
		    System.out.println("Case " + (i+1) + ": " + array.get(i));
		}
	}
}
