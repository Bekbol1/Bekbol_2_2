class Lakers extends Team implements Printable {
    private String city;
    private int championshipsCount;

    public Lakers(String name, int numberOfPlayers, String city, int championshipsCount) {
        super(name, numberOfPlayers);
        this.city = city;
        this.championshipsCount = championshipsCount;
    }

    public String getCity() {
        return city;
    }

    public int getChampionshipsCount() {
        return championshipsCount;
    }

    @Override
    public void print() {
        System.out.println("\nНазвание команды: " + getName() + "\nГород: " + city + "\nКоличество игроков: " + getNumberOfPlayers() +
                "\nКоличество трофеев NBA: " + championshipsCount);
    }
}
