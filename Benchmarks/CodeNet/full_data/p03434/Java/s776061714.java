import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Integer [] list = new Integer[num];
        int Alice = 0;
        int Bob = 0;

        for(int i = 0; i < num; i++) {
            list[i] = scan.nextInt();
        }
        Arrays.sort(list, Collections.reverseOrder());
        for(int i = 0; i < num; i++){
            if(i % 2 == 0){
                Alice += list[i];
            }
            else{
                Bob += list[i];
            }
        }
        System.out.println(Alice - Bob);
    }
}