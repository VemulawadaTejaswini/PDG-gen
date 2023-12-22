class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(5);
        format.setMinimumFractionDigits(5);
        format.setGroupingUsed(false);
        System.out.println("" + (a/b) + " " + (a%b) + " " + format.format(a/(double)b));
    }
}
