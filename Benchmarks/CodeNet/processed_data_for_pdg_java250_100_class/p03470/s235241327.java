public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer val;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            val = sc.nextInt();
            if (!list.contains(val)) {
                list.add(val);
            }
        }
        System.out.println(list.size());
    }
}
