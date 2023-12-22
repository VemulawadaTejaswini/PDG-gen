Public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String line = sc.nextLine();
    String[] spl = str.split("");
    spl[k-1].toLowerCase();
    line = "";
    for(int i = 0; i < n; i++){
      line += spl[i];
    }
    System.out.println(line);
  }
}