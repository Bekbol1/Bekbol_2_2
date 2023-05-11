public class Main {
    public static Team createObject(String className) {
        switch (className) {
            case "Lakers":
                return new Lakers("Los Angeles Lakers", 15, "Лос Анджелес", 17);
            case "GoldenStateWarriors":
                return new GoldenStateWarriors("Golden State Warriors (GSW)", 12, "Калифорния", 7);
            case "BostonCeltics":
                return new BostonCeltics("Boston Celtics", 17, "Восточная Конференция", 10);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Team[] allTeams = {createObject("Lakers"), createObject("GoldenStateWarriors"), createObject("BostonCeltics")};
        for (Team team : allTeams) {
            if (team instanceof Printable) {
                ((Printable) team).print();
            }
        }
    }
}