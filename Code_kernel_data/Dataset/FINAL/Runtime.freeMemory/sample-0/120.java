public class func{
public void create(int rows,int cols,boolean isDense){
        Runtime r = Runtime.getRuntime();
        long available = r.freeMemory();
        if (size < available) {
            if (isDense) {
                if (size > Integer.MAX_VALUE) {
                    LOGGER.finer("too big for ArrayMatrix; creating new " + 
                         "OnDiskMatrix");
                    return new OnDiskMatrix(rows, cols);
                } else {
                    LOGGER.finer("creating new (in memory) ArrayMatrix");
                    return new ArrayMatrix(rows, cols);
                }
            } else {
                LOGGER.finer("can fit sparse in memory; creating " + 
                         "new SparseMatrix");
                return new YaleSparseMatrix(rows, cols);
            }
        } else { 
            LOGGER.finer("cannot fit in memory; creating new OnDiskMatrix");
            return new OnDiskMatrix(rows, cols);
        }
}
}
