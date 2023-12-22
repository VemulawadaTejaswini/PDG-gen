public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Y = scanner.nextInt();
		int man, ochun, chun;
		man = Y/10000;
		ochun= (Y%10000)/5000;
		chun= ((Y%10000)%5000)/1000;
		if(N>=(man+ochun+chun)) {
			System.out.println(man + " "+ ochun+ " "+ chun);
		} else {
			System.out.println("-1 -1 -1");
		}
		
		scanner.close();
		
		

	}

}