public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isContinue = true;
		int[] score = new int[3];
		ArrayList<String> list = new ArrayList<String>();
		while(isContinue){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int intScore = 0;
			if(m != -1 && f != -1){
				intScore = m + f;
			}
			if(m == -1 && f == -1 && r == -1){
				isContinue = false;
				scan.close();
			}else if(m == -1 || f == -1 || intScore < 30 ){
				list.add("F");
			}else if(80 <= intScore){
				list.add("A");
			}else if(65 <= intScore){
				list.add("B");
			}else if(50 <= intScore){
				list.add("C");
			}else if(30 <= intScore &&  50 <= r){
				list.add("C");
			}else{
				list.add("D");
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
