class Kaurav extends Bharatvanshi {
    private String name;
    private boolean isObedient;
    private boolean isCruel;

    public Kaurav(String name, boolean isObedient, boolean isCruel) {
        this.name = name;
        this.isObedient = isObedient;
        this.isCruel = isCruel;
    }

    public void fight() {
        System.out.println(name + " fights aggressively.");
    }

    public void disobey() {
        System.out.println(name + " disobeys the rules.");
    }

    public void cruel() {
        System.out.println(name + " is cruel.");
    }
}
