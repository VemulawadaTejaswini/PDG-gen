import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(input.readLine());
		ArrayList<Long> arr = new ArrayList<Long>();
		String ae = input.readLine();
		StringTokenizer str = new StringTokenizer(ae);
		long a=0;
		while(str.hasMoreTokens()) {
			arr.add(Long.parseLong((String)str.nextElement()));
			a++;
		}
		while(arr.size()!=2) {
			System.out.println(arr.get(1)+"sffr"+arr.get(0));
			arr.set(0, (arr.get(0)+arr.get(1)));
			System.out.println(arr.get(0)+"Dg"+arr.get(1));
			arr.set(2,(arr.get(2)+arr.get(1)));
			arr.remove(1);
			System.out.println(arr);
		}
		System.out.println(arr.get(0)+" "+ arr.get(1));

	}

}
