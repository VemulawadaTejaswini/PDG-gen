public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		Integer[] ary;
		while(scan.hasNext()){
			ary = new Integer[2];
			ary[0] = scan.nextInt();
			ary[1] = scan.nextInt();
			if(ary[0] != 0 && ary[1] != 0){
				list.add(ary);
			}else{
				scan.close();
				break;
			}
		}
		for(int i = 0; i < list.size(); i++){
			ary = list.get(i);
			for(int j = 0; j < ary[0]; j++){
				for(int k = 0; k < ary[1]; k++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
