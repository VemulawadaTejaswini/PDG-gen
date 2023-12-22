import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String[] Array = s.split("");
		int[]intArray=new int[Array.length];
		
		for (int i=0;i<Array.length;i++) {
			intArray[i]=Integer.parseInt(Array[i]);
			}
		
		int A=intArray[0];
		int B=intArray[1];
		int C=intArray[2];
		int D=intArray[3];
		
		if((A+B+C+D)==7) {
			System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
		}else if((A-B+C+D)==7) {
			System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
		}else if((A-B-C+D)==7) {
			System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
		}else if((A-B-C-D)==7) {
			System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
		}else if((A-B+C-D)==7) {
			System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
		}else if((A+B-C+D)==7) {
			System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
		}else if((A+B+C-D)==7) {
			System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
		}else if((A+B-C-D)==7) {
			System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
		}
		sc.close();
	}

}
