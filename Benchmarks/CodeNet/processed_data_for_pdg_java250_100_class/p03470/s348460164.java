public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    List<Integer> numList = new ArrayList<>();
    while(sc.hasNextInt()){
      numList.add(sc.nextInt());
    }
    numList = numList.stream().distinct().collect(Collectors.toList());
    System.out.println(numList.size());
  }
}
