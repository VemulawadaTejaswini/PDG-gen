public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int data, cnt = 0;
		while(true){
			data = scan.nextInt();
			if(data == 0){
				break;
			}
			System.out.println("Case " + ++cnt +  ": " + data);
		}
        scan.close();
    }
}
