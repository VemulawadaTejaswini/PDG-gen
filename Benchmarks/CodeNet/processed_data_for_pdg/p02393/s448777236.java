class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int t;
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    if(a > b){
    t = a;
    a = b;
    b = t;
    }
    if(b > c){
    t = b;
    b = c;
    c = t;
    }
    if(a > b){
    t = a;
    a = b;
    b = t;
    }
    System.out.println(a + " " + b + " " + c);
    }
}
