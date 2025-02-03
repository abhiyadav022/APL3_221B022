class WoodenDuck implements Swim, Mute {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is swimming.");
    }

    @Override
    public void mute() {
        System.out.println("Wooden Duck is mute.");
    }
}
