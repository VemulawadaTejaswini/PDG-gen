public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int count = 0;
  int wcount = 0;
  String[] array = new String[4];
  array = sc.next().split("");
  ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
  for(int i=0; i<4; i++){
    for(int j=0;j<4; j++){
      if(array[i].equals(array[j])){
        count += 1;
      }
    }
    if(count==2){
      wcount += 1;
    }
    count = 0;
  }
  if(wcount == 4){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }
}
}
