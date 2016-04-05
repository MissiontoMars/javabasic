
public class Cast{
    int internal;
    Cast(int i) {
        this.internal = i;
    }

    public static void main(String... args) {
        Cast c = new Cast(100);
        Object o = (Object)c;
        Cast c2 = (Cast)o;

        Object o2 = new Object();
        Cast c3 = (Cast)o2;
    }
}
