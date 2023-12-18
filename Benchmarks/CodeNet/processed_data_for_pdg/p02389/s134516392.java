class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h, w, area, syu;
    h = scan.nextInt();
    w = scan.nextInt();
    area = h * w;
    syu = (h + w) * 2;
    System.out.println(area + " " + syu);
  }
}
