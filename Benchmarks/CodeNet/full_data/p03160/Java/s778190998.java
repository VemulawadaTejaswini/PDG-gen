

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] height = new int[n];
		for(int i=0; i<n; i++) {
			height[i] = sc.nextInt();
		}
		int[] cost = new int[n];
		cost[0] = 0;
		int[] temp = new int[n];
		for(int i=1; i<n; i++) {
			cost[i] = cost[i-1] + Math.abs(height[i]-height[i-1]);
			if(i-2>=0) {
				for(int j=2; j<k+1; j++) {
					if(i-j < 0) {
						break;
					}
					temp[i] = cost[i-j] + Math.abs(height[i]-height[i-j]);
					if(temp[i] < cost[i]) {
						cost[i] = temp[i];
					}
				}
				
			}
		}
		System.out.println(cost[n-1]);
