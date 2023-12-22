import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();
        
        boolean lastFlag = str.charAt(size-1) == '#' ? true : false;
        int breakInt = -1;
        if(lastFlag) {
            int index = 0;
            for(int i = size-1; i >=0; i--) {
                if(str.charAt(i) == '.') {
                    breakInt = size - index;
                    break;
                }
                index++;
            }
        }

        int count1 = 0;
        int count2 = 0;
        boolean flag = false;
        for(int i = 0; i < size; i++) {
            if(!flag && str.charAt(i) == '#') flag = true;
            if(flag) {
                if(i == breakInt) break;
                if(str.charAt(i) == '.') count1++;
                if(str.charAt(i) == '#') count2++;
            }
        }

        int count = count1 > count2 ? count2 : count1;

        System.out.println(count);
    }
}