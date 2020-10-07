package DNK;

public class LoopBuffer {
    char elements [];
    int len;
    private int strelka;

    LoopBuffer(int len){
        this.len = len;
        strelka = 0;
        elements = new char [len];
    }
    public void put (char c) {
        elements[strelka] = c;
        strelka = (strelka + 1) % len;
    }

    public String get() {
        String s1 = "";
        for(int i = strelka; i < len; i++){
            s1 += elements[i];
        }

        for(int i = 0; i < strelka; i++){
            s1 += elements[i];
        }
        return s1;
    }


}
