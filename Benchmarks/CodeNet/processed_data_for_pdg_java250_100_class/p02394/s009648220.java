public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int W = Integer.parseInt(l[0]); 
        int H = Integer.parseInt(l[1]); 
        int x = Integer.parseInt(l[2]); 
        int y = Integer.parseInt(l[3]); 
        int r = Integer.parseInt(l[4]); 
        if(x + r > W || x - r < 0 || y + r > H || y - r < 0) {
          System.out.println("No");
        } else {
          System.out.println("Yes");
        }   
    }   
}
