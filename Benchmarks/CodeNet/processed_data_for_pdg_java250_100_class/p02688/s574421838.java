public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        Set set = new HashSet();
        for (int i = 1; i <= N; i++) {
            set.add(i);
        }
        for (int i = 0; i < K; i++) {
            if(set.size()<=0){break;}
            int di = s.nextInt();
            for (int j = 0; j < di; j++) {
                int num = s.nextInt();
                if(set.contains(num)) {
                    set.remove(num);
                }
            }
        }
        System.out.println(set.size());
    }
}
