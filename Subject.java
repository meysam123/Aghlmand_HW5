enum  Subject {
    Movies("Movies"),Music("Music"),Food("Food & Drink"),Fashion("Fasion & Beauty");
    private String name;
    Subject(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
