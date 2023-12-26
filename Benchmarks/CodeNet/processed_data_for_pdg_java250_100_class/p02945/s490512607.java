public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int r1 = a + b;
        int r2 = a - b;
        int r3 = a * b;
        if(r1 >= r2){
            if(r1 >= r3){
                System.out.println(r1);
            }else{
                System.out.println(r3);
            }
        }else if(r3 >= r2){
            System.out.println(r3);
        }else{
            System.out.println(r2);
        }
    }
}
