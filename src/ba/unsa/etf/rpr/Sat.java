package ba.unsa.etf.rpr;

public class Sat {
    int sati,minute,sekunde;
    public Sat(int h,int m, int s){
        set(h,m,s);
    }
    public void set(int h, int m, int s){
        sati=h; minute=m; sekunde=s;
    }
    public void next() {
        sekunde++;
        if(sekunde==60) { sekunde=0; minute++;}
        if(minute==60) { minute=0; sati++;}
        if(sati==24) sati=0;
    }
    public void preveius() {
        sekunde--;
        if(sekunde==-1) { sekunde=59; minute--;}
        if(minute==-1) { minute=59; sati--;}
        if(sati==-1) sati=23;
    }
    public void moveFor(int r) {
        if(r>0)
            for(int i=0;i<r;i++) next();
        else
            for(int i=0;i<-r;i++) preveius();
    }
    public int getSati(){
        return  sati;
    }
    public int getMinute(){
        return  minute;
    }
    public int getSekunde(){
        return  sekunde;
    }
    public void write(){
        System.out.println(sati+":"+minute+":"+sekunde);
    }
};
