class Voice{
    Animal[] animal;
    void preparevoice(){
        animal = new Animal[5];
        animal[0] = new cow();
        animal[1] = new goat();
        animal[2] = new lion();
        animal[3] = new tiger();
        animal[4] = new pig();
    }
    void hear(){
        for(int i=0;i<5;i++)
        animal[i].makevoice();
    }
}