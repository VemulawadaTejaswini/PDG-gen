import java.util.*;
// . >
class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine(), b = in.nextLine(), c = in.nextLine();
		int ind1 = 0, ind2 = 0, ind3 = 0;
		int res = a.length() + b.length() + c.length();
		char t = 'a';
		for(int i = 0; i < res; i++){
			if(t == 'a' && ind1 < a.length()){
				t = a.charAt(ind1);
				ind1++;
			}else if(t == 'b' && ind2 < b.length()){
				t = b.charAt(ind2);
				ind2++;
			}else if(t == 'c' && ind3 < c.length()){
				t = c.charAt(ind3);
				ind3++;
			}else{
				break;
			}
		}
			
		System.out.println((t == 'a') ? "A" : (t == 'b') ? "B" : "C");
		
	}

}
