public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int size = Integer.parseInt(sc.nextLine());
    int[] cell = new int[size];
    for(int i = 0; i < size; i++){
      cell[i] = Integer.parseInt(sc.next());
    }
    int maxmove = 0;
    int nowmove = 0;
    for(int i = 0; i < size-1; i++){
      if(cell[i] >= cell[i+1])
      {
        nowmove++;
      }
      else
      {
        if(maxmove < nowmove){
          maxmove = nowmove;
        }
        nowmove = 0;
      }
    }
    if(maxmove < nowmove){
          maxmove = nowmove;
    }
    System.out.println(maxmove);
  }
}
