

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0;
        for(int i=1;i<3;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                System.out.println("BAD");
                return;
            }
        }
        System.out.println("GOOD");
    }
}
