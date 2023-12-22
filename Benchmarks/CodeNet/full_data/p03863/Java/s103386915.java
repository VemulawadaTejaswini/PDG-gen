

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int moves = calMoveable(str);
        if(moves%2==0){
            System.out.println("Second");
        }
        else{
            System.out.println("First");
        }

    }

//    private static String calNextString(String inputStr, boolean isFrist ){
//
//    }

    private static int calMoveable(String input){
        int cnt=0;
        for(int i=1;i<input.length()-1;i++){
            if(input.charAt(i-1)!=input.charAt(i+1)){
                cnt++;
            }
        }
       // System.out.println("move;" + cnt);
        return cnt;
    }

}
