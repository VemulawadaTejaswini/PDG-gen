import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long ans=0;
		long[] w=new long[n];
		long[] b=new long[n];
		int b1=0;
		int w1=0;
		boolean ch=s.charAt(0)=='.'?false:true;
		boolean ju=ch;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)=='#'){
				if(!ch){
					w1++;
				}
				b[b1]++;
				ch=true;
			}else{
				if(ch){
					b1++;
				}
				w[w1]++;
				ch=false;
			}
		}
		if(ju){
			int count=0;
			int kk=0;
			for(long i:b){
				if(count<w.length){
					ans+=Math.min(i+kk,w[count]);
					if(w[count]<i+kk){
						kk+=w[count];
					}else{
						kk=0;
					}
				}
				count++;
			}
		}else{
			int count=0;
			int kk=0;
			for(long i:b){
				if(count+1<w.length){
					ans+=Math.min(i+kk,w[count+1]);
					if(w[count]<i+kk){
						kk+=w[count+1];
					}else{
						kk=0;
					}
				}
				count++;
			}
		}
		System.out.println(ans);
	}
}
