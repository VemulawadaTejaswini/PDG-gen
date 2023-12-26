public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int positionA = Integer.MAX_VALUE;
        int positionZ = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                if (positionA > i) positionA = i;
            } else if (s.charAt(i) == 'Z') {
                if (positionZ < i) positionZ = i;
            }
        }
        System.out.println(positionZ-positionA+1);
    }
}
