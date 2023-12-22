import java.util.Scanner;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BigInteger N = new BigInteger(scan.nextLine());

    BigInteger F = new BigInteger("1");
    BigInteger I = N;
    BigInteger A = F;

    while (I.compareTo(A) != 0){
      F = F.multiply(I);
      I = I.subtract(A);
    }
    
    System.out.println(nbDivisor(F));
  }

  public static long nbDivisor(BigInteger n){

    long nbDivi = 1;
    BigInteger zero     = new BigInteger("0");
    BigInteger un       = new BigInteger("1");
    BigInteger compteur = un;

    while (compteur.compareTo(n) < 0){

      if (n.mod(compteur).compareTo(zero) == 0){
          nbDivi++;
      }

      compteur = compteur.add(un);
    }
    return nbDivi;
  }

}
