import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s=sc.next();
		String y=s.split("/")[0];
		String m=s.split("/")[1];
		String d=s.split("/")[2];
		int year=Integer.parseInt(y);
		int month=Integer.parseInt(m)+10;
		int day=Integer.parseInt(d);
		if(year>=2020 || (year==2019 && month>=15)){
			System.out.println("TBD");
		}else if((year==2019 && month <=14 )|| year<=2018){
			System.out.println("Heisei");
		}


	}
}
