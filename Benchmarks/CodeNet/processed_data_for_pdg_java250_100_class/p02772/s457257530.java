public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        sc.close();
        boolean isOk = true;
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(arr[i]);
            if (val % 2 == 0) {
                if (val % 3 == 0 || val % 5 == 0) {
                    continue;
                } else {
                    isOk = false;
                    break;
                }
            } else {
                continue;
            }
        }
        if (isOk) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}
