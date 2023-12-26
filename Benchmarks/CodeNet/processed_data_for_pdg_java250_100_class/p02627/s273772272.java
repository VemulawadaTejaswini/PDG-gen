class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char input = sc.nextLine().charAt(0);
    if(input >= 'A' && input <= 'Z'){
      System.out.println('A');
    } else {
      System.out.println('a');
    }
  }
}
