public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        for (int l = 0; l < list.size(); l++) {
            if (l == 0) {
                System.out.printf("%d", list.get(l));
            } else {
                System.out.printf(" %d", list.get(l));
            }
        }
        System.out.print("\n");
    }
}
