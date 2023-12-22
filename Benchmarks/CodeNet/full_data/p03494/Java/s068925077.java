import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");

        int count = 0;
        boolean flag = true;
        while(flag) {
            for(int i = 0;i < n;i++){
                int tmp = Integer.parseInt(input[i]);
                if(tmp % 2 != 0){
                    flag = false;
                    break;
                }
                input[i] = Integer.toString(tmp/2);
            }
            if(flag) count++;
        }
        System.out.println(count);
    }
}