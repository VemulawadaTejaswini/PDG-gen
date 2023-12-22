import java.util.*;


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int N = S.length();
		
		List<String> s1 = new ArrayList();
		List<String> aa = new ArrayList();
		List<String> bb = new ArrayList();
		for(int i = 0;i < N;i++){
			s1.add(S.substring(i,i+1));
			if(i < (N-1)/2){
				aa.add(S.substring(i,i+1));
			}
			if(i > (N+3)/2){
				bb.add(S.substring(i,i+1));
			}
		}
		Collections.reverse(aa);
		Collections.reverse(bb);
		
		for(int i = 0;i < aa.size();i++){
			if(!aa.get(i).equals(s1.get(i))){
				System.out.println("No");
				return;
			}
		}
		for(int i = 0;i < bb.size();i++){
			if(!bb.get(i).equals(s1.get((i+3)/2+1))){
				System.out.println("No");
				return;
			}
		}
		
		
		System.out.println("Yes");
	}

}