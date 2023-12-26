public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int stone = sc.nextInt();
      int coordinate = sc.nextInt();
    for(int i = (coordinate-stone)+1; i<=(coordinate+stone)-1; i++){
        System.out.print(i+" ");
     }
    }
}
