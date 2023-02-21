public class A{
	public void loadOriginalDB(Connection user1Conn, Connection user2Conn) throws SQLException {
		Statement user1Stmt = user1Conn.createStatement();
		
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_0 ("+	"dtvarchar1			varchar(500),"+	"dtvarchar2			varchar(1000),"+	"dtvarchar3			varchar(1500),"+	"dtvarchar4			varchar(3000),"+	"dtvarchar5			varchar(4000),"+	"dtvarchar6			varchar(4000),"+	"dtvarchar7			varchar(4000),"+	"dtvarchar8			varchar(4000),"+	"dtvarchar9			varchar(4000),"+	"dtvarchar10		varchar(4000),"+	"dtvarchar12 		varchar(4000),"+	"dtvarchar13		varchar(4000),"+	"dtvarchar14		varchar(4000),"+	"dtvarchar15		varchar(4000),"+	"dtvarchar16		varchar(4000),"+	"dtvarchar17		varchar(4000),"+	"dtvarchar18		varchar(4000),"+	"dtvarchar19		varchar(4000),"+	"dtvarchar20		varchar(4000),"+	"dtvarchar21		varchar(4000),"+	"dtvarchar22		varchar(4000),"+	"dtvarchar23		varchar(4000),"+	"dtvarchar24		varchar(4000),"+	"dtvarchar25		varchar(4000),"+	"dtvarchar26		varchar(4000),"+	"dtvarchar27		varchar(4000),"+	"dtvarchar28		varchar(4000),"+	"dtvarchar29		varchar(4000),"+	"dtvarchar30		varchar(4000),"+	"dtnumber1			number(38,10),"+	"dtfloat1			float(126),"+	"dtblob1			blob"+")");
		user1Stmt.addBatch("create table "+TABLE_PREFIX+"_1 ("+	"dtvarchar1			varchar(1000),"+	"dtvarchar2			varchar(2000),"+	"dtvarchar3			varchar(3000),"+	"dtvarchar4			varchar(4000),"+	"dtnumber1			number(30,5),"+	"dtnumber2			number(30,5)"+")");
		user1Stmt.executeBatch();
		
		
		user1Stmt.close();
	}
}