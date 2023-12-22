import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static boolean isFinished(char[] chars, char target, int length) {
		for(int i=0; i<length; i++)
			if(chars[i]!=target)
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		int[] table = new int['z'-'a'+1];
		Arrays.fill(table, 0);
		for(int i=0; i<table.length; i++) {
			char c = (char)('a'+i);
			String[] tmp = str.split(c+"");
			for(String tmp2: tmp)
				if(tmp2.length()>table[i])
					table[i]=tmp2.length();
		}

//		for(int i=0; i<table.length; i++)
//			System.out.println((char)('a'+i)+" : "+table[i]);

		int min=0;
		for(int i=1; i<table.length; i++) {
			if(table[min]>table[i]) {
				min = i;
			}
		}
		char target = (char)('a'+min);
		char[] outputs = str.toCharArray();
		int length=outputs.length;

		int count = 0;
		while(!isFinished(outputs, target, length)) {
			for(int i=0; i<length-1; i++) {
				if(outputs[i] != target)
					outputs[i] = outputs[i+1];
			}
			if(outputs[length-1]!=target)
				length--;
//			for(int i=0; i<length; i++)
//				System.out.print(outputs[i]+"");
//			System.out.println();
			count++;
		}

		System.out.println(count);
	}
}
