public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numAll = Integer.parseInt(br.readLine());
    String[] numsStr = br.readLine().split(" ");
    Set<String> numSet = new HashSet<>();
    for(int i=0; i<numAll; i++){
      numSet.add(numsStr[i]);
    }
    if(numAll == numSet.size()){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
