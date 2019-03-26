enum  Subject {
    Movies("Movies"),Music("Music"),Food("Food & Drink"),Fashion("Fasion & Beauty")
    ,Fiction("Fiction"),Psychology("Psychology"),History("History"),Philosophy("Philosophy");
    private String name;
    Subject(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
