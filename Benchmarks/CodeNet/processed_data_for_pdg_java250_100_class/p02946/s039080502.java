public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        String out = "";
        for(int i = b-(a-1);i <= a+b-1;i++){
            out += " "+i;
        }
        System.out.println(out.replaceFirst(" ",""));
    }
}
