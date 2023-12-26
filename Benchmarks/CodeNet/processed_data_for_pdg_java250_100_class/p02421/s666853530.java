public class Main{
	public static void main(String[] args) {
		int taro=0;
		int hanako=0;
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.next());
		int[] num=new int[26];
		for(int i=0;i<26;i++) {
			num[i]=i+1;
		}
		for(int i=0;i<n;i++) {
			String a=sc.next();
			String b=sc.next();
			if(a.compareTo(b)>0) {
				taro+=3;
			}else if(a.compareTo(b)<0) {
				hanako+=3;
			}else if(a.compareTo(b)==0) {
				taro+=1;
				hanako+=1;
			}
		}
		System.out.println(taro+" "+hanako);
	}
}
