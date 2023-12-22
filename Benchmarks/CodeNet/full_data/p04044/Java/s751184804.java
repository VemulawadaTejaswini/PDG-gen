import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] NLarr = scan.nextLine().split(" ");
		
		//N개의 string을 입력받는다
		int N = Integer.parseInt(NLarr[0]);
		
		//각 string은 L의 길이를 갖는다
		int L = Integer.parseInt(NLarr[1]);
		
		
		//N개의 string을 배열화 한다
		String[] strArr = new String[N];
		String str = "";
		
		//N개의 string을 입력받아 string배열에 초기화한다.
		for(int i=0; i<N;){
			str = scan.next();
			if(str.length() == L){
				strArr[i] = str;
				i++;
			}
		}
		
		scan.close();
		
		//앞자리의 숫자별(오름차순)으로 정렬한다.
		String temp = "";		
		for(int start=0; start<strArr.length-1; start++){
			for(int end=start+1; end<strArr.length; end++){
				if(strArr[start].charAt(0) > strArr[end].charAt(0)){
					temp = strArr[start];
					strArr[start] = strArr[end];
					strArr[end] = temp;
				}
			}
		}
		
		//최종 출력
		String print="";
		
		for(String _print : strArr){
			print += _print;			
		}
		
		System.out.println(print);
	}
}