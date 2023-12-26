public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  List<Integer> list = new ArrayList<>();
  list.add(sc.nextInt());
  list.add(sc.nextInt());
  list.add(sc.nextInt());
  int fi = 0;
  int se = 0;
  for (int i : list) {
   if (i == 5) {
    fi += 1;
   } else if (i == 7) {
    se += 1;
   }
  }
  if (fi == 2 && se == 1) {
   System.out.println("YES");
  }else{
   System.out.println("NO");
  }
 }
}
