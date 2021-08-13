package myrace;

public class theRace {
    public static void main(String[] args) {

        var winner = new Elite("Patricia", "Lorenzo", "Podium");
        var participant = new Participant[3];

        participant[0] = new Participant("Martijn", "Moreel");
        participant[1] = new Participant("Gabriela", "Lorenzo");
        participant[2] = winner;

        var elite = new Elite[2];

        elite[0] = new Elite("Nicolas", "Lorenzo", "No Podium");
        elite[1] = new Elite("Angelica", "Guerra", "Podium");

        System.out.println(participant[0].getStatus(2));
        System.out.println(participant[1].getStatus(1));
        System.out.println( winner.getStatus());
        System.out.println( elite[0].getStatus(1));
        System.out.println(  elite[1].getStatus());
    }
}
