import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> numOfMonster = new ArrayList<Integer>();
        List<Integer> manPowerOfMan = new ArrayList<Integer>();

        int result = 0;
        for (int index = 0 ; index <= n ; index++) {
          numOfMonster.add(scanner.nextInt());
         }

        for (int index = 0 ; index < n ; index++) {
          manPowerOfMan.add(scanner.nextInt());
        }

        while(manPowerOfMan.size() > 0) {
          System.out.println("numOfmonsters " + numOfMonster.toString());
          System.out.println("manPowerOfMan " + manPowerOfMan.toString());
          System.out.println("current result " + result);
          result+=tail(numOfMonster,manPowerOfMan);
        }
        System.out.println(result);
    }

    private static int tail(List<Integer> mons, List<Integer> manPower) {
      int length = manPower.size();
      if (length==1) {
        int result = Math.min(mons.get(0)+mons.get(1), manPower.get(0));
        manPower.remove(0);
        return result;
      } else {
        //head
        int result = 0;
        //tail
        
        int monsTailIndex = mons.size()-1;
        int monsSemiTailIndex = mons.size()-2;
        
        int tailMonstars = mons.get(monsTailIndex);
        int semiTailMonstars = mons.get(monsSemiTailIndex);
        
        int tailManPowerIndex = manPower.size()-1;
        int tailManPower = manPower.get(tailManPowerIndex);
        
        if(tailMonstars < tailManPower) {
          result += tailMonstars;
          int remainManPower = tailManPower-tailMonstars;
         if(semiTailMonstars <remainManPower) {
           result += semiTailMonstars;
           mons.set(monsSemiTailIndex,0);
         } else {
           result += remainManPower;
           mons.set(monsSemiTailIndex, semiTailMonstars-remainManPower);
         }
       } else {
         result+= tailManPower;
       }
        mons.remove(monsTailIndex);
        manPower.remove(tailManPowerIndex);
        return result;
      }
    }
}