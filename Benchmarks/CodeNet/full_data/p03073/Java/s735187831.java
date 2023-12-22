import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str=sc.next();;
		 String array[] = new String[str.length()];
		int cnt1=0,cnt2=0;

		for(int i=0;i<str.length();i++){
			array[i] = str.substring(i, i + 1);
			if(array[0].equals('1')){
				array[0]="0";
				cnt1+=1;
			}
			if(i!=0&&array[i-1].equals('0')&&array[i].equals('0')){
				array[i]="1";
			}
			if(i!=0&&array[i-1].equals('1')&&array[i].equals('1')){
				array[i]="0";
			}
		}
		for(int i=0;i<str.length();i++){
			array[i] = str.substring(i, i + 1);
			if(array[0].equals('0')){
				array[0]="1";
				cnt2+=1;
			}
			if(i!=0&&array[i-1].equals('0')&&array[i].equals('0')){
				array[i]="1";
			}
			if(i!=0&&array[i-1].equals('1')&&array[i].equals('1')){
				array[i]="0";
			}
		}
		if(cnt1<cnt2)System.out.println(cnt1);
		if(cnt2<=cnt1)System.out.println(cnt2);
	}

}
