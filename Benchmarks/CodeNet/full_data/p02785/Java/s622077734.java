class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] mns = new int[n];
		int k = sc.nextInt();
		Long ans = 0;

		for(int i=0;i<n;i++){
			mns[i] = sc.nextInt();
		}

		Arrays.sort(mns);

		for(int j=0;j<k;j++){
			mns[n - j - 1] = 0;
		}

		for(int m=0;m<n;m++){
			ans += mns[m];
		}

		System.out.println(ans);

		}
	}