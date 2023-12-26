public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peopleNum = sc.nextInt();  
      	int snackNum = sc.nextInt();  
      	List<Integer> ownList = new ArrayList<Integer>();
      	for(int i = 0; i < snackNum; i++){
          	int ownNum = sc.nextInt();  
          	for(int j = 0; j < ownNum; j++){
              int people = sc.nextInt();  
              ownList.add(people);
            }
        }
      	List<Integer> ownListB = new ArrayList<Integer>(new LinkedHashSet<>(ownList));
      	int size = ownListB.size();
      	System.out.println(peopleNum - size);
    }
}
