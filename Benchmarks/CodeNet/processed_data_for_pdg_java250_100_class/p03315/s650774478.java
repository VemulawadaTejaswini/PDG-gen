public class Main {
	public static void main(String[] args){
	String s;
	int ans = 0;
	Scanner sc = new Scanner(System.in);
	s = sc.next();
	String a[] = new String[4];
	a = s.split("");
	for(int i =0 ; i<4 ; i++){
		 if(a[i].equals("+")){
			 ans++;
		 }else{
			 ans--;
		 }
	}
	System.out.println(ans);
}}
