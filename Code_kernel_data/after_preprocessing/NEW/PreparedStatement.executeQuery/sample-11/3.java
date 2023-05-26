//3
public class func{
public void execute(){
            for (int i = 0; i < values.size(); ++i) {
                stmt.setObject(
                    i + 1,
                    values.get(i));
            }
            return stmt.executeQuery();
}
}
