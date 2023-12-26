public class Main {
    public static void main(String[] args) {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int answer=0;
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        int array1[] = new int[5];
        int array2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int a=T/A;
        int b=B*a;
        answer=b;
        System.out.println(answer);
    }
}
