public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	            int a = Integer.parseInt(scan.next());
	            int b = Integer.parseInt(scan.next());
	            int c = Integer.parseInt(scan.next());
	            int num = a ; 
	            int count = 0; 
	            for (int i = a; i <= b ;i++){
	            	if(c % i == 0){
	            		num++;
	            		count++;
	            	}
	            }
	            System.out.println(count);
	}
}
