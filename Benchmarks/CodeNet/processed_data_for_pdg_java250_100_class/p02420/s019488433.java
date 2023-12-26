public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int length[] = new int[10];
        while(true){
        String str = sc.next();
        if(str.equals("-")) break;
        int m = sc.nextInt();
        int h[] = new int[str.length()];
        char har[] = new char[1000];
        for(int i=0; i<m; i++) h[i] = sc.nextInt();
        for(int i=0; i<str.length(); i++){
            har[i] = str.charAt(i);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<h[i]; j++){
                har[j+str.length()] = har[j];
            }
            for(int j=0; j<=str.length(); j++){
                har[j] = har[j+h[i]];
            }
        }
        for(int i=0; i<str.length(); i++) System.out.print(har[i]);
        System.out.println("");
    }
    }
}
