import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");        

        int num = Integer.parseInt(line[0]);
        int yen = Integer.parseInt(line[1]);

        for(int ichiman = 0; ichiman <= num;ichiman++){
            for(int gosen = 0;ichiman + gosen <= num;gosen++){
                int sen = num - ichiman - gosen;
                if(yen == 10000*ichiman+ gosen*5000 + 1000*sen){
                    System.out.println(ichiman + " " + gosen + " " + sen);
                    return;
                }
            }
        }

        System.out.println("-1" + " " + "-1" + " " + "-1");
        return;
    }
}