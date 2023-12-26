public class Main {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String str = scan.next();
    	String[] gengou = str.split("/", 0);
		int i = Integer.parseInt(gengou[0]);
    	if(i <= 2019){
    		i = Integer.parseInt(gengou[1]);
    		if(i <= 4){
    			System.out.println("Heisei");
    		}else{
    			System.out.println("TBD");
    		}
    	}else{
    		System.out.println("Heisei");
    	}
	}
}
