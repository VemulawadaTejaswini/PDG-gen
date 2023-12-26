public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] NLarr = scan.nextLine().split(" ");
		int N = Integer.parseInt(NLarr[0]);
		int L = Integer.parseInt(NLarr[1]);
		String[] strArr = new String[N];
		String str = "";
		for(int i=0; i<N;){
			str = scan.next().toLowerCase();
			if(str.length() == L){
				strArr[i] = str;
				i++;
			}
		}
		scan.close();
		Arrays.sort(strArr);
		String print="";
		for(String _print : strArr){
			print += _print;			
		}
		System.out.println(print);
	}
}
