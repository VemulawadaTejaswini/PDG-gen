import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans,start_s,end_s;
		Integer q,i,t,f,t1;

		t1=0;
		start_s="";
		end_s="";
		ans=sc.next();
		q=sc.nextInt();

		for (i=0;i<q;i++){
			t=sc.nextInt();
			if(t==1){
				t1++;
			} else{
				f=sc.nextInt();
				if((t1+f)%2==0){
					end_s = end_s+sc.next();
				} else {
					start_s = sc.next()+start_s;
				}
			}
		}

		ans= start_s+ans+end_s;
		StringBuffer ans_buf = new StringBuffer(ans);
		if(t1%2==1){
			ans=ans_buf.reverse().toString();
		}
		System.out.println(ans);
		sc.close();
	}
}