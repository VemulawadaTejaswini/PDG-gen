public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer[] b = new Integer[a];
        List<Integer> total = new ArrayList<Integer>();
        boolean  flag = false;
        for(int i =0; i < a; i++) {
            b[i] = Integer.parseInt(scanner.next());
            if (b[i] % 2 == 0) total.add(b[i]);
        }
        for(int i =0; i < total.size(); i++) {
            if (!(total.get(i) % 3 == 0 || total.get(i) % 5 == 0)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("DENIED");
        } else{
            System.out.println("APPROVED");
        }
    }
}
