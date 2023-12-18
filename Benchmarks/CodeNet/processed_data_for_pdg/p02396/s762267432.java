public class Main {
	static Scanner scan = new Scanner(System.in);
		public static void main(String[] args){
			for(int i =0;scan.hasNextLine();i++){
				int test = scan.nextInt();
				if(test != 0){
					System.out.println("Case "+(i+1)+": "+test);
				}else{
					break;
				}
			}
		}
}
