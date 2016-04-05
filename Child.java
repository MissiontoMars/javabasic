
public class Child extends Base {
    public Child(String name) {
        System.out.println("Child constructor before calling super");
        super(name);
    }

    public static void main(String[] args) {
        Child c = new Child("child");
        c.printName();
    }
}
