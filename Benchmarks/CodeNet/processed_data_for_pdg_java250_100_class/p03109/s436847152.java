public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int yy=Integer.parseInt(s.substring(0,4));
		int mm=Integer.parseInt(s.substring(5,7));
		int dd=Integer.parseInt(s.substring(9,10));
		boolean x=false;
		if(yy==2019){
			if(mm>4){
				x=true;
			}
		}
		if(yy > 2019){
			x=true;
		}
		if(x){
			System.out.println("TBD");
		}else{
			System.out.println("Heisei");
		}
	}
}
