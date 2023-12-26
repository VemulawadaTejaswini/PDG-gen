public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int length, side, area, circum;
    length = sc.nextInt();    
    side = sc.nextInt();
    area = length * side;
    circum = ( length + side ) * 2;
    System.out.println(area + " " + circum);
    }
}
