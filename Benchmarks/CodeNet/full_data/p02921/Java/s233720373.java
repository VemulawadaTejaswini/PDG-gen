public class A_0901 {
    public static void main(String[] args) {

        String inputS = new java.util.Scanner(System.in).nextLine();
        String[] arS = inputS.split("");
        String inputT = new java.util.Scanner(System.in).nextLine();
        String[] arT = inputT.split("");

        String[] S = new String[3];
        String[] T = new String[3];
        for (int i = 0; i < 3; i++) {
            S[i] = arS[i];
            T[i] = arT[i];
        }

        int m = 0;

        for(int j=0; j<3; j++) {
            if (S[j].equals(T[j])){
                m++;
            }
        }

        System.out.println(m);
    }
}