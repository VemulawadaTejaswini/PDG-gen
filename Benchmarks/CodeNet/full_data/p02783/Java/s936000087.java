
public class MyMacin {
 public static void main(String[] args) {
	int hp = Integer.valueOf(args[0]);
    int attack = Integer.valueOf(args[1]);
   	int result = hp / attack;
    return result == 0 ? 1 : result;
 }
}