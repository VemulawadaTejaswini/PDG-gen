import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		ArrayList<String> array = new ArrayList<String>();
		int num = 0;
		String[] strArray=new String[str.length()];
		for(int k=0;k<str.length();k++) {
			String str2=String.valueOf(str.charAt(k));
			strArray[k]=str2;
		}
		for(int i=0;i<strArray.length;i++) {
			array.add(strArray[i]);
		}
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i)!=array.get(i+1)) {
				array.remove(i);
				array.remove(i+1);
				num++;
			}

		}
		System.out.println(num);
	}

}
