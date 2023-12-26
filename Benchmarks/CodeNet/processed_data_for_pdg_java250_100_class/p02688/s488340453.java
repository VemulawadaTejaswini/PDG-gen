public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashSet<Integer> sunuke = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sunuke.add(i+1);
        }
        for (int i = 0; i < k; i++) {
            int ki = sc.nextInt();
            for (int j = 0; j < ki; j++) {
                int temp = sc.nextInt();
                if (sunuke.contains(temp)) {
                    sunuke.remove(temp);
                }
            }
        }
        System.out.println(sunuke.size());
    }
}
