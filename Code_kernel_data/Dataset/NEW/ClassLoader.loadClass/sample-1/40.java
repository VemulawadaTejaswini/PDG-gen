//40
public class func{
public void load(ClassLoader classLoader,String ejbClass){
        if (ejbClass != null) {
            try {
                return classLoader.loadClass(ejbClass);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
}
}
