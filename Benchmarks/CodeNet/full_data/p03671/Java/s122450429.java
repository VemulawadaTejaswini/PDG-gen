import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Integer[] list = new Integer[2];
        for(int i = 0;i < 2; i++){
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        System.out.println(list[0]+list[1]);

    }
}