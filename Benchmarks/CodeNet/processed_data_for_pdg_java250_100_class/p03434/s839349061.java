public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int a = 0;
        int b = 0;
        boolean isAlice = true;
        Integer val = null;
        while ((val = list.pollLast()) != null) {
            if (isAlice) {
                a += val;
            } else {
                b += val;
            }
            isAlice = !isAlice;
        }
        System.out.println(a-b);
    }
}
