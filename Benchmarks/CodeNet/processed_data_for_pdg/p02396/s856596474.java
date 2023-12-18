class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true){
            int a = sc.nextInt();
            if (a == 0 ) break;
            i++;
            System.out.println("Case " + i + ": " + a);
        }
    }
}
