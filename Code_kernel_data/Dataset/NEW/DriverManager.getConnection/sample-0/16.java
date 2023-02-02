//16
public class func{
public void MergeDatabase(){
        mergedConn = DriverManager.getConnection("jdbc:h2:/home/cruise/projects/cruise-dbs/merged/db/h2db/cruise", "sa", null);
        printScalar(mergedConn, "SELECT MAX(id) FROM buildStateTransitions");
        fromConn = DriverManager.getConnection("jdbc:h2:/home/cruise/projects/cruise-dbs/mingle/db/h2db/cruise", "sa", null);
        printScalar(fromConn, "SELECT MAX(id) FROM buildStateTransitions");
}
}
