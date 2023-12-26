public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String W = line.toUpperCase();
        int count = 0;
        while(!((line = sc.nextLine()).equals("END_OF_TEXT"))) {
          String[] l = line.split(" ");
          for(int i = 0; i < l.length; i++) {
            if(W.equals(l[i].toUpperCase())) {
              count++;
            }
          }
        }
        System.out.println(count);
    }
}
