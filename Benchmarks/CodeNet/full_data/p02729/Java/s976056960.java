import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int odd = sc.nextInt();
int even = sc.nextInt();
  int numodd = nCombination(odd);
  int numeven = nCombination(even);
System.out.println(numodd + numeven);
}
  
  private static int nCombination(int count) {
        int num = 0;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                num++;
            }
        }
    return num;
    }
  
}
