
import java.util.Scanner;

public class Main {
    static long print(long n){
        if(n<=1)
            return 1;
        else
            return(2*print(n/2)+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        
        if(num <= 1){
            System.out.println(1);
        }else{
            System.out.println(print(num));
        }
    }

}
/*
input : 1000000000000  // 4 // 2
output : 1099511627775 // 7 // 3


Caracal is fighting with a monster.

The health of the monster is 
H
.

Caracal can attack by choosing one monster. When a monster is attacked, depending on that monster's health, the following happens:

->If the monster's health is 1,it drops to 0
->If the monster's health X, is greater than 1, that monster disappears. Then, two new monsters appear, each with the health of 
X/2(flore value).(r) denotes the greatest integer not exceeding r.)

Caracal wins when the healths of all existing monsters become 0 or below.

Find the minimum number of attacks Caracal needs to make before winning.

Constraints
1≤H≤10^12
All values in input are integers.
*/
