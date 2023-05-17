public class func{
public void redraw(GL2 gl){
      Runtime rt = Runtime.getRuntime();
      long free = rt.freeMemory(), total = rt.totalMemory();
      FastText.aprintf(g, new Coord(10, y -= 15), 0, 1, "Mem: %,011d/%,011d/%,011d/%,011d", free, total - free, total, rt.maxMemory());
}
}
