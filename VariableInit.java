
public class VariableInit {
    static class Inner {
        private int innerInt;
        public void printVariable() {
                System.out.println("innerInt=" + innerInt);
            }
    }
    public static void main(String[] args) {
        int localInt=0;
        System.out.println("localInt=" + localInt);
        Inner var = new Inner();
        var.printVariable();
    }
}
