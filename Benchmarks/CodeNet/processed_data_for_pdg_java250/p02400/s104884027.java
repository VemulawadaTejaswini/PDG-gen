public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[] = br.readLine().split(" ");
        double r = Double.parseDouble(st[0]);
        if(!(0 < r && 10000 > r)){System.exit(1);}
        double circumference = Math.PI  * 2 * r;
        double circleArea = r * r * Math.PI;
        BigDecimal x = new BigDecimal(circumference);
        BigDecimal y = new BigDecimal(circleArea);
        x = x.setScale(5, BigDecimal.ROUND_HALF_UP);
        y = y.setScale(5, BigDecimal.ROUND_HALF_UP);
        System.out.printf("%.5f %.5f",y,x);
        System.out.println();
    }
}
