class Main{
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        BigDecimal div = aa.divide(bb, 8, BigDecimal.ROUND_HALF_UP);
        DecimalFormat format = new DecimalFormat("#.#");
        format.setMaximumFractionDigits(8);
        System.out.println(a/b + " " + a%b + " "+ format.format(div) );
        scan.close();
    }
}
