import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tapOrder = sc.next();
        int len = tapOrder.length();
        boolean danceable = true;

        for(int i = 1; i <= len; i++) {
            char t = i % 2 == 0 ? 'R' : 'L';

            if(tapOrder.charAt(i-1) == t){
                danceable = false;
                break;
            }
        }

        System.out.println(danceable ? "Yes" : "No");

    }
}