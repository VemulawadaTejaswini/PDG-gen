public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> candy = new HashSet<Integer>();
        while(sc.hasNext()){
            int d = sc.nextInt(); 
            for(int i = 0;i < d;i++) {
                candy.add(sc.nextInt());
            }
        }
        System.out.println(N - candy.size());
    }
}
