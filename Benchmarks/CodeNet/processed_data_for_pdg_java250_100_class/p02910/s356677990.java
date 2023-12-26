public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] s = str.toCharArray();
		String sl = "",sr="";
		for (int i=0;i<str.length();i++){
			if(i % 2==0){
				sl += s[i];
			}else{
				sr += s[i];
			}
		}
		boolean f = true;
		char[] cl = sl.toCharArray();
		char[] cr = sr.toCharArray();
		for (int i=0;i<sl.length();i++){
			if(cl[i] == 'R' || cl[i] =='U' || cl[i] =='D'){
			}else{
				f = false;
				break;
			}
		}
		for (int i=0;i<sr.length();i++){
			if(cr[i] == 'L' || cr[i] =='U' || cr[i] =='D'){
			}else{
				f = false;
				break;
			}
		}
		if(f)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}	
