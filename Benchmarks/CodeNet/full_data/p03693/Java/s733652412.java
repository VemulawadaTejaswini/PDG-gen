public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r,g,b,inputval;
        r = Integer.valueOf(args[0]);
        g = Integer.valueOf(args[1]);
        b = Integer.valueOf(args[2]);
        
        inputval = r * 100 + g * 10 + b;

        if (inputval % 4 == 0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }        
}
