public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder Newfile = new StringBuilder(); 
        while (true) {
            String[] array = sc.nextLine().split(" ");
            int H = Integer.parseInt(array[0]);
            int W = Integer.parseInt(array[1]);
            if (H == 0 && W == 0) break ;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if((i+j)%2 == 0)         
                        Newfile.append("#");
                    else                      
                        Newfile.append(".");
                }
                Newfile.append("\n");
            }
            Newfile.append("\n");
        }
        System.out.print(Newfile);
        sc.close();
    }
}
