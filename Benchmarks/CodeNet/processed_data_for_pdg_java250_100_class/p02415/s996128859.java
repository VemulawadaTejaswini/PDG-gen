public class Main {
    public static void main (String[] args)  {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String S = sc.nextLine();
        char[] C = S.toCharArray();
        char c = '?';
        for (int i = 0; i < S.length(); i ++) {
            if (Character.isUpperCase(C[i])) { System.out.print(Character.toLowerCase(C[i])); }
            else if (Character.isLowerCase(C[i])) { System.out.print(Character.toUpperCase(C[i])); }
            else { System.out.print(C[i]); }
        }
        System.out.println();
    }
}
