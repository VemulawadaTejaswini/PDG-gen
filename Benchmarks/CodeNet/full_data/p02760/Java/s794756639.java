public class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int A11 = sc.nextInt();
	    int A12 = sc.nextInt();
	    int A13 = sc.nextInt();
	    int A21 = sc.nextInt();
	    int A22 = sc.nextInt();
	    int A23 = sc.nextInt();
	    int A31 = sc.nextInt();
	    int A32 = sc.nextInt();
	    int A33 = sc.nextInt();

	    HashMap<Integer, Integer> map = new HashMap<>();
	    map.put(A11, 0);
	    map.put(A12, 0);
	    map.put(A13, 0);
	    map.put(A21, 0);
	    map.put(A22, 0);
	    map.put(A23, 0);
	    map.put(A31, 0);
	    map.put(A32, 0);
	    map.put(A33, 0);


	    int N = sc.nextInt();
	    for(int i = 0; i < N; i++) {
	    	int b = sc.nextInt();
	    	map.get(b);
	    	map.put(b, 1);
	    }


	    boolean flg = false;
	    // 縦
	    if(map.get(A11)==1 && map.get(A21)==1 && map.get(A31)==1) {flg = true;}
	    if(map.get(A12)==1 && map.get(A22)==1 && map.get(A32)==1) {flg = true;}
	    if(map.get(A13)==1 && map.get(A23)==1 && map.get(A33)==1) {flg = true;}

	    // 横
	    if(map.get(A11)==1 && map.get(A12)==1 && map.get(A13)==1) {flg = true;}
	    if(map.get(A21)==1 && map.get(A22)==1 && map.get(A23)==1) {flg = true;}
	    if(map.get(A31)==1 && map.get(A32)==1 && map.get(A33)==1) {flg = true;}

	    // 斜め
	    if(map.get(A11)==1 && map.get(A22)==1 && map.get(A33)==1) {flg = true;}
	    if(map.get(A31)==1 && map.get(A22)==1 && map.get(A13)==1) {flg = true;}

	    if (flg) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	    
	}
}