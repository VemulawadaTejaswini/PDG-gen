
public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer l = Integer.parseInt(scanner.next());


        Integer[] taste = new Integer[n];
        for(int i = 1; i <= n; i++) {
            taste[i-1] = l + i - 1;
        }


        int max = taste[0];
        int min = taste[1];
        for(int i = 0; i < taste.length; i++) {
            int v = Math.abs(taste[i]);
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }

        int sum = Stream.of(taste).mapToInt(Integer::intValue).sum();
        System.out.println(sum - min);
    }
}
