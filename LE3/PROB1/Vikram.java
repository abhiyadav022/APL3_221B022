class Vikarn extends Kaurav {
    private boolean isKind;

    public Vikarn() {
        super("Vikarn", true, false);  // Vikarn is obedient and not cruel
        this.isKind = true;
    }

    public void fight() {
        System.out.println("Vikarn fights with honor.");
    }


    public void obey() {
        System.out.println("Vikarn obeys the rules.");
    }

    public void kind() {
        if (isKind) {
            System.out.println("Vikarn is kind.");
        }
    }
}
