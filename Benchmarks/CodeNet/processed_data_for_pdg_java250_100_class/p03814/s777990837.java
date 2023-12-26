public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    char[] charArray = line.toCharArray();
    int firstA = 0;
    int lastZ = 0;
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == 'A') {
        firstA = i;
        break;
      }
    }
    for (int i = (charArray.length - 1); i > 0 ; i--) {
      if (charArray[i] == 'Z') {
        lastZ = i;
        break;
      }
    }
    System.out.println(lastZ - firstA + 1);
  }
}
