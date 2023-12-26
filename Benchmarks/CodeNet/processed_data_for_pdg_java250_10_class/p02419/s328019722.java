public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<String>();
        String str;
        int count = 0;
        String W = sc.nextLine();
        while (true) {
            str = sc.nextLine();
            if (str.equals("END_OF_TEXT")) {
                while (A.contains(W)) {
                    A.remove(A.indexOf(W));
                    count++;
                }
                System.out.println(count);
                break;
            }
            str = str.toLowerCase();
            String[] S = str.split(" ");
            for (int i=0; i<S.length; i++) {
                A.add(S[i]);
            }
        }
    }
}
