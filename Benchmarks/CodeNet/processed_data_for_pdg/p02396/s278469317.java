class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = -1;
        for (int i = 1 ;; i++){
            n = sc.nextInt();
            sc.nextLine();
            if (n == 0) break;
            System.out.println("Case "+i+": "+n);
        }
        sc.close();
    }
}
