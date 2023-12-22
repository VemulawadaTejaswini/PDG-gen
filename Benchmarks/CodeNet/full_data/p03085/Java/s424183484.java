public class Main {
  public static void main(String[] args) {
  	char c = (char)System.in.read();
    char res = '';
    switch (c) {
      case 'A': 
        res = 'T';
        break;
      case 'T': 
        res = 'A';
        break;
      case 'C': 
        res = 'G';
        break;
      case 'G': 
        res = 'C';
        break;
    }
    System.out.println(res); 
  }
}