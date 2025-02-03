public class Main {
    public static void main(String[] args) {
   
        Test testObject = new Test();
        testObject.display(); 

        AbsTest concreteAbsTest = new AbsTest() {
            public void display() {
                System.out.println("Display method implemented in concrete subclass of AbsTest.");
            }
        };
        concreteAbsTest.display();  
    }
}
