class Main {
    public static void main(String[] args) {
        int t[] = new int[10001];
        Scanner input = new Scanner(System.in);
        int n = 0;
        while(true){
            t[n++] = input.nextInt();
            if (t[n-1] == 0){
                break;
            }
        }
        for (int i = 0; i < (n-1); i++){
            System.out.printf("Case %d: %d\n",i+1,t[i]);
        }
    }
}
