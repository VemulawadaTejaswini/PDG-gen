{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X[] = new int[N];
        int sum = 0;
        int ans = 0;
        for (int i = 0 ; i< N ; i++){
            X[i] = sc.nextInt();
            sum = sum + X[i];
        }
        double M =(double)Math.round(sum/N);
        int ans1 = 0;
        for (int i= 0 ; i< X.length;i++ ){
            ans1=X[i];
            ans +=(int) Math.pow(ans1-M,2);
        }
        System.out.println(ans);
    }
}