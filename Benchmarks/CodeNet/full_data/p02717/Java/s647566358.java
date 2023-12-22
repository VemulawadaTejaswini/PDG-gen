public class Main {
    public static void main(String args[]) {
        int X = 1;
        int Y = 2;
        int Z = 3;
        int N;
        
        System.out.println(X + " " + Y + " " + Z);

        N = X;
        X = Y;
        Y = N;

        N = X;
        X = Z;
        Z = N;

        System.out.println(X + " " + Y + " " + Z);
    }
}