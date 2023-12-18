public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number=3;
    int array[]=new int[number];
    for(int i=0;i<number;i++){
      array[i]=sc.nextInt();
    }
    Arrays.sort(array);
    for(int i=0;i<number-1;i++) System.out.print(array[i]+" ");
    System.out.println(array[number-1]);
      sc.close();
  }
}
