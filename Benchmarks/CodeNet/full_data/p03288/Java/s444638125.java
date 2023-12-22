public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int rating = s.nextInt();
        if(rating < 1200)
            System.out.println("ABC");
        else if(rating < 2800)
            System.out.println("ARC");
        else
            System.out.println("AGC");
        s.close();
    }
}