public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        Integer[] array = new Integer[n];
        for(int i = 0; i < n; ++i) {
            int item = sc.nextInt();
            array[i] = item;
            sum += item;
        }
        Arrays.sort(array, Collections.reverseOrder()); 
        double item_v = sum / (4d * m);
        if(array[m - 1] < item_v ) System.out.println("No");
        else System.out.println("Yes");
    }
}
