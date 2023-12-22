import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();

    long quo = n / 15;
    long rem = n % 15;
    long laps = calcLaps(quo);
    long rems = calcRems(quo, rem);

    System.out.println(laps + rems);
  }

  private static long calcLaps(long quo) {
    if (quo == 0) {
      return 0;
    } else {
      long l = quo * quo;
      int aLap = 60;
      return aLap * l;
    }
  }

  private static long calcRems(long quo, long rem) {
    if (rem == 0) {
      return 0;
    } else {
      long lapBottom = 15 * quo;
      int i = 1;
      int valid = 0;
      int fraction = 0;

      while (i <= rem) {
        if (i % 3 == 0 || i % 5 == 0){
          i++;
        } else {
          fraction += i;
          valid++;
          i++;
        }
      }
      return lapBottom * valid + fraction;
    }
  }
}
