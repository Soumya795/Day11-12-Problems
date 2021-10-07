package dailyproblems;

public class Deckofcards {

    String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };

    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    int n = suit.length * rank.length;
    String[] deck = new String[n];

    void deck()
    {
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++)
            {
                deck[suit.length*i + j] = rank[i] + " of " + suit[j];
            }
        }
    }

    void shuffle()
    {
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }

    void shuffleDeckForPlayers()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println("\n Person " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println(deck[i + j * 4]);
            }
        }
    }
    public static void main(String[] args)
    {
        Deckofcards deckOfCards = new Deckofcards();
        deckOfCards.deck();
        deckOfCards.shuffle();
        deckOfCards.shuffleDeckForPlayers();
    }
}
