import java.util.Scanner:
class Main{
  punlic static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    short h = sc.nextShort();
    short a = sc.nextShort();
    System.out.println((int)Math.ceil(h/a));
  }
}