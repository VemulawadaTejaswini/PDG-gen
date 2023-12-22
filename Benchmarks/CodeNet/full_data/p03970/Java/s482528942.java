import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ori = "CODEFESTIVAL2016";
		String str = s.next();
		String[] arr1 = ori.split("");
		String[] arr2 = str.split("");

		int count = 0;
		for(int i=0;i<arr1.length;i++){
			if(!arr1[i].equals(arr2[i])){
				count++;
			}
		}
		System.out.println(count);
	}
}