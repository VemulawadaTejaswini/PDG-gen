public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int num = sc.nextInt();
    while(sc.hasNext()){
      list.add(sc.nextInt());
    }
    Collections.sort(list,  Collections.reverseOrder());
    int alisNum = 0;
    int bobNum = 0;
    for(int i = 0; i < num; i++){
    	if(i % 2 == 0){
        	alisNum += list.get(i);
        } else {
          	bobNum += list.get(i);
        }  
    }  
    System.out.println(alisNum-bobNum);
  }
}
