    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();

        // ビジネスロジックここから
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        int t[] = {p,q,r};
        int max = t[0];
        
        int sum = p + q + r;
        
        for (int i = 1; i < t.length; i++) {
        	max = Math.max(max, t[i]);
        }
       
        int ans = sum - max;

        
        System.out.println(ans);