package JavaBasic;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int healt = input.nextInt();
        int attack = input.nextInt();
        int manyattacks = 0;
        if (attack <= healt){
        while (healt > 0){
            healt = healt - attack;
            manyattacks++;
            if (healt <= 0){
                break;
            }
        }
           System.out.println(manyattacks);
        }
    }
}