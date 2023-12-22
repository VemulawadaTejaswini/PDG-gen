import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Len = sc.nextInt();

		String data[] = new String[N];
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.next();
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length -1; i < j; j--) {
				if(0 >data[j].compareTo(data[j -1])){
					data = change(data, j, j-1);
				}
			}
	}
		StringBuilder str = new StringBuilder();
		for (String s : data) {
			str.append(s);
		}

		System.out.println(str);
		sc.close();
	}
	static String[] change(String[] s, int a, int b){
		String temp;
			temp = s[a];
			s[a] = s[b];
			s[b] = temp;
		return s;
	}
}
