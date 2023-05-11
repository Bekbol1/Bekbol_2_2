class BostonCeltics extends Team implements Printable {
    private String conference;
    private int numberOfMVPs;

    public BostonCeltics(String name, int numberOfPlayers, String conference, int numberOfMVPs) {
        super(name, numberOfPlayers);
        this.conference = conference;
        this.numberOfMVPs = numberOfMVPs;
    }

    public String getConference() {
        return conference;
    }

    public int getMvpsCount() {
        return numberOfMVPs;
    }

    @Override
    public void print() {
        System.out.println("\nНазвание команды: " + getName() + "\nКонференция: " + conference + "\nКоличество игроков: " + getNumberOfPlayers() +
                "\nКоличесвто MVP за историю: " + numberOfMVPs);
    }
}