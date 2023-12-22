public class Suger extends Condiments {

    Suger(Bevarage bvr)
    {
        this.bvr=bvr;
        des=" , Suger";
    }
    int cost() {
return bvr.cost()+5;
    }
    
}