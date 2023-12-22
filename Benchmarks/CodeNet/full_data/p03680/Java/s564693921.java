import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] push = new int[n];
        int index = 0;
        int count = 0;
        boolean ok = false;

        for(int i = 0;i < n;i++){
            push[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++){
            index = push[index]-1;
            count++;
            if(index == 1){
                ok = true;
                break;
            }
        }

        System.out.println(ok ? count : -1);
    }
}