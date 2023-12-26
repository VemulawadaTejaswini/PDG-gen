public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		scan.close();
		byte[] charNum = new byte[S.length()];
		for(int i=0;i<S.length();i++){
			int tmp=S.codePointAt(i)+N;
			while(tmp>90) {
				tmp=tmp-26;
			}
			charNum[i]=(byte) (tmp);
		}
		for(int i=0;i<S.length();i++){
			System.out.print((char) (charNum[i]));
		}
	}
}
