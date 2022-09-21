package Ex9;

enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES };
enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN,
    EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE };

public class Card {
    Suit s;
    Rank r;

    public Card(Suit s, Rank r) {
        this.s = s;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + s +
                ", rank=" + r +
                '}';
    }
}
