class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ( x > y ){
            int temp = x;
            x = y;
            y = temp;
        }
        if (x > z){
            int temp = x;
            x = z;
            z = temp;
        }
        if ( y > z){
            int temp = y;
            y = z;
            z = temp;
        }
        System.out.println(x + " " + y + " " + z);
    }
}
