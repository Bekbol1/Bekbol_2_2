class GoldenStateWarriors extends Team implements Printable {
    private String state;
    private int allStarPlayersNumber;

    public GoldenStateWarriors(String name, int numberOfPlayers, String state, int allStarPlayersNumber) {
        super(name, numberOfPlayers);
        this.state = state;
        this.allStarPlayersNumber = allStarPlayersNumber;
    }

    public String getState() {
        return state;
    }

    public int getAllStarPlayersNumber() {
        return allStarPlayersNumber;
    }

    @Override
    public void print() {
        System.out.println("\nНазвание команды: " + getName() + "\nШтат команды: " + state + "\nКоличесвто игроков: " + getNumberOfPlayers() +
                "\nКоличество игроков игравших в матче звезд: " + allStarPlayersNumber);
    }
}