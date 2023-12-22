import sun.misc.Unsafe;
public class Main {
  public static void main(String...args) {
    Unsafe.getUnsafe().allocateMemory(512L * 1024L * 1024L);
  }
}
