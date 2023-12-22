import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long num = Long.parseLong(W);

		ArrayList<Long> list = calc(num);
		long x=1;
		long y=1;
		for(long n:list){
			if(x<y){
				x*=n;
			}else{
				y*=n;
			}
        }

		System.out.println((x+y)-2);
		System.out.println(x+","+y);

	}

	public static ArrayList<Long> calc(long num){
		ArrayList<Long> list = new ArrayList<Long>();

		long m = num;
		long i=2;
		while(i<=m && i < 316227){
			if(m%i==0){
				list.add(i);
				m/=i;
			}else{
				if(i==2){
					i++;
				}else{
					i=i+2;
				}
			}
		}
		list.add(m);
		return list;
	}

}
