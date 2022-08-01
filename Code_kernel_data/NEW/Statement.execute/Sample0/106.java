//105
public class func{
	public void createDerby2041Triggers(Statement s){
        s.execute("create trigger d2041_tr5 after insert on d2041_t "
                + "for each row mode db2sql call d2041_proc()");
}
}
