public class func{
public void setupCouchbase(final int couchbasePort){
        final CouchbaseMock couchbase = new CouchbaseMock("localhost", couchbasePort, 1, 1);
        couchbase.setRequiredHttpAuthorization(null);
        final Thread thread = new Thread(couchbase);
        thread.start();
        return Pair.of(couchbase, thread);
}
}
