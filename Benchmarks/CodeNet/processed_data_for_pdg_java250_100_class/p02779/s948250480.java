public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        int num;
        for(int i=0;i<N;i++){
            num = sc.nextInt();
            list.add(num);
            set.add(num);
        }
        int a = list.size();
        int b = set.size();
        if(a==b){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
