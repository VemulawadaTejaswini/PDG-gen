class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt(),
        K=sc.nextInt(),
        point[] = new int[N],
        Q=sc.nextInt();
        Arrays.fill(point,0);
        for(int i=0;i<Q;i++) {
            point[sc.nextInt()-1]++;
        }
        for(int i=0;i<N;i++){
                System.out.println(point[i]-Q+K>0?"Yes":"No");
        }
    }
}
