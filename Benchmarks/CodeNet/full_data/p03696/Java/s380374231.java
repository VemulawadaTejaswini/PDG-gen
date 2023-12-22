class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        
	        int lcnt=0;
	        int rcnt=0;
	        
	        int fcnt=0;
        	while(c[fcnt]==')') {
        		fcnt++;
        	}
	        for(int i=fcnt;i<N;i++) {
	        	if(c[i]=='(')lcnt++;
	        	else rcnt++;
	        }
	        
	        char[] ap = new char[1000];
	        for(int i=0;i<fcnt;i++) {
	        	System.out.print("(");
	        }
	        if(lcnt>rcnt) {
        		System.out.print(S);
	        	for(int i=0;i<lcnt-rcnt;i++) {
	        		System.out.print(")");
	        	}
	        		System.out.println("");
	        } else {
	        	for(int i=0;i<rcnt-lcnt;i++) {
	        		System.out.print("(");
	        	}
	       		System.out.print(S);
	      		System.out.println("");

	        }
	         
	 }
	 

}
