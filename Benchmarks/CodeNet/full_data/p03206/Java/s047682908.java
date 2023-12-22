public class Main {
  public void main(String args[]) {
    int d = Integer.parseInt(args[0]);
    int eve = 25 - d;
    StringBuilder out = new StringBuilder();
    out.append("Christmas");
    for (int i=0; i<eve; i++) {
      out.append(" Eve");
    }
    System.out.println(out.toString());
  }
}