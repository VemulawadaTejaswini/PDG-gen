import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] NLarr = scan.nextLine().split(" ");
		
		//N개의 string을 입력받는다
		int N = Integer.parseInt(NLarr[0]);
		
		//각 string은 L의 길이를 갖는다
		int L = Integer.parseInt(NLarr[1]);
		
		
		//N개의 string을 저장할 배열을 생성한다.
		String[] strArr = new String[N];
		String str = "";
		
		//N개의 string을 입력받아 배열을 초기화한다.
		for(int i=0; i<N;){
			str = scan.next().toLowerCase();
			if(str.length() == L){
				strArr[i] = str;
				i++;
			}
		}
		
		scan.close();
			
		Arrays.sort(strArr);
		
		//최종 출력
		String print="";
		
		for(String _print : strArr){
			print += _print;			
		}
		
		System.out.println(print);
	}
}