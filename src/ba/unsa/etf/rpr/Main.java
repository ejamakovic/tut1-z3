package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args){
    Sat s = new Sat (15,30,45);
    s.write();
    s.next();
    s.write();
    s.moveFor(-48);
    s.write();
    s.set(0,0,0);
    s.write();
    }
};
