public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> d = new ArrayList<Integer>();
        d.add(sc.nextInt());
        d.add(sc.nextInt());
        d.add(sc.nextInt());
        List<Integer> s = d.stream().sorted().collect(Collectors.toList());
        for(int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(s.get(i));
            }else {
                System.out.print(s.get(i) + " ");
            }
        }
    }
}
