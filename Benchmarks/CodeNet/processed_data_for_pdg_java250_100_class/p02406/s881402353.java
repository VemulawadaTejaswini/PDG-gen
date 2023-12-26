public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int end_val = scan.nextInt();
		for(int cnt = 1; cnt <= end_val; cnt++){
			if(cnt % 3 == 0){
				System.out.print(" " + cnt);
			}else{
				for(int i = cnt; i > 0;){
					if(i % 10 == 3){
							System.out.print(" " + cnt);
							break;
					 }
					 i /= 10;
				}
			}
		}
		System.out.println();
	    scan.close();
    }
}
