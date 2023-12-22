	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N= Integer.parseInt(s);

        s = sc.nextLine();
        String[] array = s.split(" ");
        int sum = 0;
        int abs=0;
        int x=0;
        for(int j = 0, i=0; i < N*N; i++,j=i/N) {
        	if(i%N==j)continue;
        	abs=(Integer.parseInt(array[i%N]) -x);
        	if(abs<0) abs*=-1;
        	sum+=abs;
        	x=Integer.parseInt(array[i%N]);
        if(i%N==N-1) {
        if(x<0) x*=-1;
        sum+=x;
        System.out.println(sum);
        sum=0;
        x=0;
        }

        }
        if(x<0) x*=-1;
        sum+=x;
        System.out.println(sum);

	}