import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    char[] sa= s.next().toCharArray();
    char[] sb= s.next().toCharArray();
    char[] sc= s.next().toCharArray();

    int i1=0;
    int i2=0;
    int i3=0;
    char next='a';
    while(true) {
      if(next=='a') {
        if(i1==sa.length) {
          System.out.println("A");
          break;
        }
        next=sa[i1++];
      }

      if(next=='b') {
        if(i2==sb.length) {
          System.out.println("B");
          break;
        }
        next=sb[i2++];
      }

      if(next=='c') {
        if(i3==sc.length) {
          System.out.println("C");
          break;
        }
        next=sc[i3++];
      }
    
      
    }

  }
}