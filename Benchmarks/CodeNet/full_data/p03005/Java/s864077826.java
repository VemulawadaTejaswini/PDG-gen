import sun.misc.Unsafe;
public class Main {
  public static void main(String...args) {
    Unsafe.getUnsafe().allocateMemory(1024L * 1024L * 1024L * 2L);
  }
}
