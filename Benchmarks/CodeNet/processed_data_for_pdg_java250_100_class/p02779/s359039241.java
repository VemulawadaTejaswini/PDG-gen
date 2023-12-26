public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        List<Long> listA = new ArrayList<Long>();
        Integer[] a = new Integer[n];
        for(int i = 0; i < a.length; i++) {
            listA.add(scanner.nextLong());
        }
        List<Long> listB = new ArrayList<Long>(new HashSet<>(listA));
        if(listA.size() == listB.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
