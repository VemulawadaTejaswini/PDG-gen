import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			StringBuilder str=new StringBuilder(sc.next());
			int k=sc.nextInt();
			StringBuilder res=new StringBuilder();
			for(int i=0;i<str.length();i++){
				if(i+1==str.length()){
					int a=str.charAt(i)-'a'+k;
					a%=26;
					res.append((char)('a'+a));
				}
				else if('z'-str.charAt(i)+1<=k){
					res.append("a");
					k-=(int)('z'-str.charAt(i))+1;
				}
				else res.append(str.charAt(i));
			}
			System.out.println(res);
		}
	}
}