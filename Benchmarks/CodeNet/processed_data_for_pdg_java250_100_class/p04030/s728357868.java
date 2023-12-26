public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
	String ans = "";
	for(int i = 0; i < s.length(); i++){
	    if(s.charAt(i) == '0'){
		ans += "0";
	    }else if(s.charAt(i) == '1'){
		ans += "1";
	    }else{
		if(ans.length() != 0){
		    ans = ans.substring(0,ans.length()-1);
		}
	    }
	}
	System.out.println(ans);
    }
}
