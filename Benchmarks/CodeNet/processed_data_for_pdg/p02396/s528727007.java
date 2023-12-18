class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i;
		int x = sc.nextInt();
		while(x != 0){
			arr.add(x);
			x = sc.nextInt();
		}
		int size = arr.size();
		for(i = 0; i < size; i++){
			System.out.println("Case"+" "+(i+1)+":"+" "+arr.get(i));
		}
	}
}
