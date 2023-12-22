class App {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int add = 0;
        
        if(a > b) add = c - (a - b);
        if(add < 0) add = c;

        System.out.print(add);
    }
}
