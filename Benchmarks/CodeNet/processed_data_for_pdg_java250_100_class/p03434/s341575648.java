public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int a = 0;
        int b = 0;
        boolean isAlice = true;
        for (int i = list.size()-1; i >= 0; i--){
            if (isAlice) {
                a += list.get(i);
            } else {
                b += list.get(i);
            }
            isAlice = !isAlice;
        }
        System.out.println(a-b);
    }
}
