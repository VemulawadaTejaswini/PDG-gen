class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sc = scanner.nextInt();
    int sc2 = scanner.nextInt();
    String i = Integer.toString(sc,sc2);
    int valLen = i.length(); 
    System.out.println(valLen);
}
}
