 public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();
        int L = s1.nextInt();
        String[] stringArray=new String[N];
          for(int i=0;i<N;i++){
            stringArray[i]=s1.next();
            }
          Arrays.sort(stringArray);
          for(String s : stringArray){
          System.out.print(s);
          }
          System.out.println("");
    }
}
