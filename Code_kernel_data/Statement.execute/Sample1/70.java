//69
public class func{
	public void exchangeSubpartition(Connection connection,OracleTable table,String subPartitionName,OracleTable subPartitionTable){
        String.format("ALTER TABLE %s EXCHANGE SUBPARTITION %s WITH TABLE %s",
            table.toString(), subPartitionName, subPartitionTable.toString());
    statement.execute(sql);
    statement.close();
}
}
