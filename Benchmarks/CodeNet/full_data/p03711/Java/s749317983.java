import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    private static int[] group1 = {1,3,5,7,8,10,12};
    private static int[] group2 = {4,6,9,11};
    private static int[] group3 = {2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] str = line.split(" ");

        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);

        int x_group = Classification(x);
        int y_group = Classification(y);

        if(x_group == y_group){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    private static int Classification(int num){
        if(num==1||num==3||num==5||num==7||num==8||num==10||num==12){
            return 1;
        }
        else if(num==4||num==6||num==9||num==11){
            return 2;
        }
        else{
            return 3;
        }
    }
}
