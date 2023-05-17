//0
public class func{
public void openResultSet(InspectionContext inspectionContext,I inspectionScope,PreparedStatement statement,Query query){
            for (Object parameter : ((ParameterizedQuery) query).getParameters()) {
                statement.setObject(index++, parameter);
            }
        return statement.executeQuery();
}
}
