class Main{
    public static void main(String[] args){
        String str[];
        int a, b;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine().split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        System.out.println(a*b+" "+(2*a+2*b));
    }
}
