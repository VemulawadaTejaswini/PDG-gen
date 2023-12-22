import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// setOut();

		int n=ni();
		int m=ni();
		ns();
		String[] data=new String[m];
		for(int i=0;i<data.length;i++)
			data[i]=ns();
		
		int[] intData=new int[m];
		for(int i=0;i<m;i++)
			intData[i]=ni();
		
		int[] code=new int[m];
		for(int i=0;i<m;i++) {
			String[] strr=data[i].split(" ");
			int k=0;
			for(int j=1;j<strr.length;j++) {
				int bin=Integer.parseInt(strr[j]);
				int number=1<<(bin-1);
				k=k|number;
			}
			code[i]=k;
		}

		int count=0;
		for(int i=0;i<(1<<n);i++) {
			boolean state=true;
			
			for(int j=0;j<code.length;j++) {
				int tmp=code[j]&i;
				if(Integer.bitCount(tmp)%2!=intData[j]) {
					state=false;
					break;
				}
			}
			
			if(state) {
				count++;
			}
		}
		System.out.println(count);
		
	}

	private static void out(String[] strs) {
		// TODO Auto-generated method stub
		for(String str:strs) {
			out(str);
		}
		
	}

	private static void setOut() throws FileNotFoundException {
		sc = new Scanner(new FileInputStream("in.txt"));
		System.setOut(new PrintStream(new FileOutputStream("out.txt")));

	}

	private static void out(List<Integer> l) {
		// TODO Auto-generated method stub
		for (int i : l)
			System.out.println(i);

	}

	private static void out(int[] b) {
		// TODO Auto-generated method stub
		for (int i : b)
			System.out.println(i);

	}

	public static void out(String str) {

		if (dbg)
			System.out.println(str);
	}

	public static void out(int str) {

		if (dbg)
			System.out.println(str);
	}

	public static int ni() {

		return sc.nextInt();

	}

	public static String ns() {

		return sc.nextLine();
	}

	public static int[] ni(int k) {
		int[] res = new int[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextInt();
		sc.nextLine();
		return res;
	}

	public static String[] ns(int k) {
		String[] res = new String[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextLine();
		return res;
	}

	public static int[][] ni(int a, int b) {
		int[][] res = new int[a][b];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = sc.nextInt();
		sc.nextLine();
		return res;
	}
}
