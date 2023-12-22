package Sample;

import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String l1 = cin.nextLine();
        String l2 = cin.nextLine();
        String l3 = cin.nextLine();
        System.out.println(new String(new char[] {l1.charAt(0), l2.charAt(1), l3.charAt(2)}));
    }
}