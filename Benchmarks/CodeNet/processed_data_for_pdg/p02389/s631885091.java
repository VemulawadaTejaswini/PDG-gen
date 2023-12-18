class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int area = a * b;
        int len = 2*a + 2*b;
        System.out.println(area + " " + len);
    }
}
