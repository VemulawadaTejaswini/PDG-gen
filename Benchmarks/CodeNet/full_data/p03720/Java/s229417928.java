import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int n=scanner.nextInt();
		int m=scanner.nextInt();

		Map<Integer,Integer> data=new TreeMap<Integer,Integer>();

		for(int i=1;i<=n;i++) {
			data.put(i,0);
		}
		
		while(scanner.hasNext()) {

			Integer buf=scanner.nextInt();

			data.put(buf,data.get(buf)+1);
			
		}

		for(Integer key:data.keySet()) {
			System.out.println(data.get(key));
		}



		scanner.close();

	}

	public static int getsumofkakuketa(int n) {

		int result=0;

		while(true) {

			result+=n%10;

			if(n/10!=0) {
				n/=10;
			}else {
				return result;
			}
		}



	}

	public static boolean isMacthed(int a,int b,int sum) {

		if(sum>=a && sum<=b) {
			return true;
		}else {
			return false;
		}

	}



}





