public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Integer array[] = {a+b,a-b,a*b};
        Arrays.sort(array, Collections.reverseOrder()); 
        System.out.println(array[0]);
    }
}
