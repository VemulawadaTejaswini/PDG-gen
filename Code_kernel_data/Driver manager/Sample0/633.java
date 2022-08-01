//632
public class func{
	public void fromParams(ConfigurationParams params){
    String connectionString = params.getString(TransformationsConfigurationParametersNames.CONNECTION_STRING_LIN_REUTERS_PARAMETER_NAME);
    Connection connection = DriverManager.getConnection(connectionString);
    return new LinReutersFromDBLexicalResource(
        connection,
        params.getInt(TransformationsConfigurationParametersNames.LIMIT_LIN_REUTERS_PARAMETER_NAME)
        );
}
}
