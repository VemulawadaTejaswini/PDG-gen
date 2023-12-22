public class Main {

    public static void main(String[] args) {
         int N ;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        boolean contained = isContainedNine(N);
        System.out.println(contained);
    }

    private static boolean isContainedNine(int n) {
        if ((n >= 10) && (n <= 99)){
            String strNumber = String.valueOf(n);
            String first = String.valueOf(strNumber.charAt(0));
            String second = String.valueOf(strNumber.charAt(1));
            if (first.equals("9") || second.equals("9"))
                return true;
        }
        else {
            System.out.println("Number not in range");
        }
        return false;
    }
}