import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ns = sc.nextLine();
        int n;
        int sn=0;

        sc.close();
        n = Integer.parseInt(ns);
        for(int i=0; i<ns.length(); i++) {
            sn += Integer.parseInt("" + ns.charAt(i));
        }

        if(n%sn == 0) System.out.println("Yes");
        else System.out.println("No"); 
    }
}