import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] number = line.split(" ");
        int x = Integer.parseInt(number[0]);
        int y = Integer.parseInt(number[1]);
        int[] groupB = new int[4];
        groupB[0] = 4;
        groupB[1] = 6;
        groupB[2] = 9;
        groupB[3] = 11;
        boolean yorn = false;
        boolean firstif = true;
        
        if((x == 2) || (y == 2)) {
            yorn = false;
        } else {
            for(int i = 0; i < 4; i++) {
                if((groupB[i] == x) && firstif){
                    for(int j = i + 1; j < 4; j++) {
                        if(groupB[j] == y) {
                            yorn = yorn || true;
                        } else {
                            yorn = yorn || false;
                        }
                        firstif = false;
                    }
                } else if(firstif) {
                    yorn = true;
                    for(int j = i + 1; j < 4; j++) {
                        if(groupB[j] == y) {
                            yorn = yorn && false;
                            firstif = false;
                        } else {
                            yorn = yorn && true;
                        }
                    }
                }
            }
        }
        if(yorn) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}