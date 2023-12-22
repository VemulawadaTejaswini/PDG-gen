import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numOfSpell = sc.nextInt();
        String blank = sc.nextLine();
        String str = sc.nextLine();

        //System.out.print("num:"+num+"numOfSpell:"+numOfSpell+"str:"+str);
        ArrayList<Integer> golem = new ArrayList<>();
        int count = 0;
        //String tidi = "";
        char ti = ' ';
        char di = ' ';

        for(int i=0; i<num+2; i++){
            golem.add(1);
        }

        for(int i=0; i<numOfSpell; i++){
            ti = sc.next().charAt(0);
            di = sc.nextLine().charAt(1);
            
            //System.out.println("ti:"+ti+","+"di:"+di);
            for(int j=0; j<num; j++){
                if(str.charAt(j) == ti){
                    if(di == 'L'){
                        golem.set(j, golem.get(j)+golem.get(j+1));
                    }
                    else if(di == 'R'){
                        golem.set(j+2, golem.get(j+2)+golem.get(j+1));
                    }
                    golem.set(j+1, 0);
                }
            }
        }
        /*
        for(int i=1; i<num+1; i++){
            count += golem.get(i);
        }
        */
        count = num - golem.get(0) - golem.get(golem.size()-1) + 2;
        System.out.println(count);
    }
}