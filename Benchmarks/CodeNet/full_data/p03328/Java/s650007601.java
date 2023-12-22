public static int solution(int a,int b) {
		int x=1001*500-b;
		int n=1,count=2;
		if(x<3) {
			return 1;
		}else {
		while(n<=x) {
			count++;
			n=1;
			for(int i=2;i<count;i++) {
				n=n+i;
			}
		}
		return count-2;
	}
	}