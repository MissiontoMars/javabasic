public class Base{
    public Base(String name) {
        this.name = name;
    }
    public Base() {
        this.name = "_base";
    }
    
    public void printName() {
        System.out.println("name = " + this.name);
    }

    private String name;
}
