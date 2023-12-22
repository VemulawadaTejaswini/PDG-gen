public class a {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> num = new ArrayList<>();
        while (N >0){
            num.add(0,N % 10);
            N /= 10;
        }

        int flag = 0;

        for (Integer integer : num) {
            if (integer == 7) {
                flag = 1;
                break;
            }
        }
        if (flag==1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}