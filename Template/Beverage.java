abstract class Beverage {
    
    public void templateMethod(int qty) {
        show();
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
    abstract void show();
    
    private void pour(int qty) {
        System.out.println("Pour "+qty+" ml of beverage");
    }
    abstract void addCondiment();
    void stir() { 
        //hook 
    }
    private void serve() {
        System.out.println("Serve");
    }
    
}
