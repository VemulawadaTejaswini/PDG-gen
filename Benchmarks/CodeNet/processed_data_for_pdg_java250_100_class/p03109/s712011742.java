public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String year =s.substring(0,4);
		String month =s.substring(5,7);
		String day =s.substring(8,10);
		int iYear = new Integer(year).intValue();
		int iMonth = new Integer(month).intValue();
		int iDay = new Integer(day).intValue();
		if(iYear>2020){
		    System.out.println("TBD");
		}else if (iYear<2018){
		    System.out.println("Heisei");
		}else{
			if(iMonth>=5){
			    System.out.println("TBD");
			}else if (iMonth<=3){
			    System.out.println("Heisei");
			}else{
				if(iDay>=31){
				    System.out.println("TBD");
				}else if (iMonth<=29){
				    System.out.println("Heisei");
				}else{
				    System.out.println("Heisei");
				}
			}
		}
	}
}
