public class OuterClass {


    // Outer class members and methods
    private int outerField = 42;
    // Inner class definition


    OuterClass outer = new OuterClass();
    OuterClass.InnerClass inner = outer.new InnerClass();


    // inner.someMethod();  // Invoke a method in the inner class
    //  int value = inner.someField;  // Access a field in the inner class

    class InnerClass {
        // Inner class members and methods

        public void accessOuterField() {
            int value = outerField;  // Access outer class field
        }
    }
}
