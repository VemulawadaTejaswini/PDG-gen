public class Main {
	public static void main(String args[]){
	  	Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num = 0;
		while(true){
			num = scanner.nextInt();
			if(num == 0)
				break;
		    System.out.println("Case "+ (i+1) + ": "+ num );
		    i ++;
        }
		scanner.close();
    }
}
