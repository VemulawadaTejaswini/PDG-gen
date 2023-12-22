public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] spl = s.split(" ");
    int a = Integer.parseInt(spl[0]);
    int b = Integer.parseInt(spl[1]);
	double x = (a + b) / 2;
    System.out.prinrln((int)Math.ceil(x));
    sc.close();
  }
}