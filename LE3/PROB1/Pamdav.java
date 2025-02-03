class Pandav extends Bharatvanshi {
    private String name;
    private boolean isKind;

    public Pandav(String name, boolean isKind) {
        this.name = name;
        this.isKind = isKind;
    }

    public void fight() {
        System.out.println(name + " fights valiantly.");
    }

    public void obey() {
        System.out.println(name + " obeys the rules.");
    }

    public void kind() {
        if (isKind) {
            System.out.println(name + " is kind.");
        } else {
            System.out.println(name + " is less kind.");
        }
    }
}
