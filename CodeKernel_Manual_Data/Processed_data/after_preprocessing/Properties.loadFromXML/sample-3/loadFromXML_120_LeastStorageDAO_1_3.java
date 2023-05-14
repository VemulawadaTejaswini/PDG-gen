public class A{
	public static DBInfo[] getAllDBInfo(){
		int STORE_ID=1;
		int TBL=2;
		int MAX_STORAGE=3;
		int CONCURRENT_STORAGE=4;
		int CONCURRENT_WX=5;
		int MAX_WX=6;
		int CONFIG_FILE=7;
		int BLOCK_SIZE=8;
		int DB_CONFIG=9;
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		Collection<DBInfo> array=new ArrayList<DBInfo>();
		DBInfo dbinfo=null;
		InputStream in=null;
		Properties prop=null;
		try{
			conn=DBRegistryManager.getConnection();
			ps=conn.prepareStatement("select STORE_ID, TBL, MAX_STORAGE, CURRENT_STORAGE, CONCURRENT_WRITE, MAX_CONCURRENT_WRITE, "+"CONFIG_FILE, BLOCK_SIZE, DB_CONFIG from db_info where "+"STATUS=? ");
			ps.setString(1, DB_READY);
			rs=ps.executeQuery();
			while(rs.next()){
				dbinfo=new DBInfo(rs.getString(STORE_ID));
				Logger.logDebug(LeastStorageDAO.class, "Get from dbregistry "+rs.getString(STORE_ID) );
				dbinfo.setTbl(rs.getString(TBL));
				dbinfo.setMaxStorage(rs.getDouble(MAX_STORAGE));
				dbinfo.setCurrentStorage(rs.getDouble(CONCURRENT_STORAGE));
				dbinfo.setConcurrentWrite(rs.getInt(CONCURRENT_WX));
				dbinfo.setMaxConcurrentWrite(rs.getInt(MAX_WX));
				dbinfo.setConfigFile(rs.getString(CONFIG_FILE));
				dbinfo.setBlockSize(rs.getInt(BLOCK_SIZE));
				in=rs.getBinaryStream(DB_CONFIG);
				if(in!=null ){
					if(in.available()>0){
						prop=new Properties();
						prop.loadFromXML(rs.getBinaryStream(DB_CONFIG));
						dbinfo.setDbcfg(prop);
						dbinfo.setDBUrl1(prop.getProperty("DB_URL"));
					}
					in.close();
				}
				if(dbinfo.getDbcfg()==null){
					prop=new Properties();
					in=ClassLoader.getSystemResourceAsStream(dbinfo.getConfigFile());
					if(in!=null){
						prop.load(in);
					}
					in.close();
					StringWriter writer=new StringWriter();
					OutputStream out =new XMLOutputStream();
					prop.storeToXML(out,"STORE ID "+dbinfo.getStoreId(),"UTF-8");
					dbinfo.setDbcfg(prop);
					dbinfo.setDBUrl1(prop.getProperty("DB_URL"));
					DBRegistryDAO.updateDBConfig(dbinfo.getStoreId(), out.toString(),prop.getProperty("DB_URL"),prop.getProperty("DB_URL"),conn);
					in.close();
					out.close();
				}
				array.add(dbinfo);
			}
			return (DBInfo[])array.toArray(new DBInfo[array.size()]);
		}catch(Exception e){
			e.printStackTrace();
			Logger.logError(LeastStorageDAO.class, e);
		}finally{
			try{
				if(ps!=null)ps.close();
				if(rs!=null)rs.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		return new DBInfo[0];
	}
}