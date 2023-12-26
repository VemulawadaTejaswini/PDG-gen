class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numHP = sc.nextInt();
        double numAtk = sc.nextInt();
        Integer cnt = 0;
        cnt = (int)Math.ceil(numHP / numAtk);
        System.out.println(cnt);
    }    
}
