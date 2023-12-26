public class Main {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new FileReader("in.txt"));
        } catch (Exception e) { }
        in = new Scanner(System.in);
        int result = in.nextInt() * in.nextInt();
        if(result%2 == 0){
          System.out.println("Even");
        }
        else{
          System.out.println("Odd");
        }
    }
}
