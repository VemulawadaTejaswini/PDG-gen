public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            al.add(a);
        }
        Collections.sort(al);
        for (int i = 0; i < 3; i++) {
            System.out.print(al.get(i));
            if (i==2) System.out.println();
            else System.out.print(" ");
        }
    }
}
