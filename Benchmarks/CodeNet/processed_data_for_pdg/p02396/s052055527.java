public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        while (true) {
            A.add(sc.nextInt());
            if (A.get(A.size() - 1) == 0) {
                break;
            }
        }
        int i = 1;
        while(i < A.size()){
            System.out.println("Case " + i +": " + A.get(i-1));
            i++;
        }
        sc.close();
    }
}
