public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        String whole = input.nextLine();
        int Z = 0; 
        ArrayList<Integer> lens = new ArrayList<Integer>();
        if (whole.indexOf("A") >= 0 && whole.lastIndexOf("Z") >= whole.indexOf("A"))
        {
            int A = whole.indexOf("A"); 
            whole = whole.substring(A); 
            Z = whole.lastIndexOf("Z"); 
        }
        System.out.println(Z+1);
    }
}
