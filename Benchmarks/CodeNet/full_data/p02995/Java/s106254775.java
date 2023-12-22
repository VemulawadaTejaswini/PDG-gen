import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();
    long D = scan.nextLong();
    long CD = lcm(C , D);

    long cStart = 0;
    long dStart = 0;
    long cdStart = 0;
    long cEnd = 0;
    long dEnd = 0;
    long cdEnd = 0;

    long i = 1;
    long j = 1;
    long k = 1;

    while(true) {
      if (i * C >= A) {
        cStart = i;
        break;
      }
      i++;
    }
    while(true) {
      if (i * C > B) {
        cEnd = i - 1;
        break;
      }
      i++;
    }

    while(true) {
      if (j * D >= A) {
        dStart = j;
        break;
      }
      j++;
    }
    while(true) {
      if (j * D > B) {
        dEnd = j - 1;
        break;
      }
      j++;
    }


    while(true) {
      if (k * CD >= A) {
        cdStart = k;
        break;
      }
      k++;
    }
    while(true) {
      if (k * CD > B) {
        cdEnd = k - 1;
        break;
      }
      k++;
    }

//    System.out.println(cEnd);
//    System.out.println(cStart);
//    System.out.println(dEnd);
//    System.out.println(dStart);
//    System.out.println(cdEnd);
//    System.out.println(cdStart);

    long cn = cEnd - cStart + 1;

    long dn = dEnd - dStart + 1;

    long cdn = cdEnd - cdStart;
    if(cdn != 1) {
      cdn++;
    }

    long result = B - A + 1 - cn - dn + cdn;




//    for(int i = (int) A; i <= B; i++) {
//      if(i % CD == 0 || i % C == 0 || i % D == 0) {
//        // nothing
//      } else {
//        count++;
//      }
//    }

    System.out.println(result);

  }

  static long lcm (long a, long b) {
    long temp;
    long c = a;
    c *= b;
    while((temp = a%b)!=0) {
      a = b;
      b = temp;
    }
    return (long)(c/b);
  }
}

