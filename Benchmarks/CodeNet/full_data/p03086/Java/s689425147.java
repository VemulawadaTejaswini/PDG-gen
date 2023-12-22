import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int cnt = 0;
		int ans = 0;

		char [] a = s.toCharArray();

		for(int i=0;i<a.length;i++){
		  if(a[i]=='A' ||a[i]=='C' ||a[i]=='G'||a[i]=='T') {
				 cnt++;
		  	} else {
		//連続が終わった時の長さをansに入れる		  
				  if(ans<cnt){
					ans=cnt;
					cnt = 0;
				  }
			  }
		}
		if(ans<cnt){
			ans=cnt;
		}
		System.out.println(ans);
	  }
	}
	