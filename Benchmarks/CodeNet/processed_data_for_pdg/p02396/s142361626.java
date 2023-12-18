public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(int i =0;sc.hasNext();i++){
			int value = Integer.parseInt(sc.next());
			if(value == 0){
				break;
			}
			System.out.println("Case "+(i+1) + ": "+value);
		}
		sc.close();
	}
}
