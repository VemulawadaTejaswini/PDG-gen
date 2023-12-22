
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPerson = sc.nextInt();
        Boolean[] judgeFlag = new boolean[totalPerson];
        int count = 0;

        for(int i=0; i<totalPerson; i++){
            judgeFlag[i] = true;    //正直者
        }

        for(int i=0; i<totalPerson; i++){
            int person = sc.nextInt();
            for(int j=0; j<person; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                if(y == 1){
                    judgeFlag[x-1] = true;
                }else if(y == 0){
                    judgeFlag[x-1] = false;
                }
            }
        }
        for(int i=0; i<totalPerson; i++){
            if(judgeFlag[i] == true){ //正直者
                count++;
            }
        }
        System.out.println(count);
    }
}