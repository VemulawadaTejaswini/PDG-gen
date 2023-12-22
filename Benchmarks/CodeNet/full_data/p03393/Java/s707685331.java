import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(s.contains("a")){
      System.out.println(s + "b");
    }else if(s.contains("a&b")){
      System.out.println(s + "c");
    }else if(s.contains("a&b&c")){
      System.out.println(s + "d");
    }else if(s.contains("a&b&c&d")){
      System.out.println(s + "e");
    }else if(s.contains("a&b&c&d&e")){
      System.out.println(s + "f");
    }else if(s.contains("a&b&c&d&e&f")){
      System.out.println(s + "g");
    }else if(s.contains("a&b&c&d&e&f&g")){
      System.out.println(s + "h");
    }else if(s.contains("a&b&c&d&e&f&g&h")){
      System.out.println(s + "i");
    }else if(s.contains("a&b&c&d&e&f&g&h&i")){
      System.out.println(s + "j");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j")){
      System.out.println(s + "k");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k")){
      System.out.println(s + "l");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l")){
      System.out.println(s + "m");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m")){
      System.out.println(s + "n");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n")){
      System.out.println(s + "o");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o")){
      System.out.println(s + "p");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p")){
      System.out.println(s + "q");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q")){
      System.out.println(s + "r");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r")){
      System.out.println(s + "s");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r&s")){
      System.out.println(s + "t");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r&s&t")){
      System.out.println(s + "u");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r&s&t&u")){
      System.out.println(s + "v");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r&s&t&u&v")){
      System.out.println(s + "w");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r&s&t&u&v&w")){
      System.out.println(s + "x");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r&s&t&u&v&w&x")){
      System.out.println(s + "y");
    }else if(s.contains("a&b&c&d&e&f&g&h&i&j&k&l&m&n&o&p&q&r&s&t&u&v&w&x&y")){
      System.out.println(s + "z");
    }else{
      System.out.println("-1");
    }
  }
}