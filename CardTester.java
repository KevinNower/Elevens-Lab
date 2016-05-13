/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card queenOfHearts = new Card("Queen", "Hearts", 10);
        Card aceOfSpades = new Card("Ace", "Spades", 1);
        Card sevenOfDiamonds = new Card("Seven", "Diamonds", 7);
        
        queenOfHearts.rank();
        queenOfHearts.suit();
        queenOfHearts.pointValue();
        System.out.println(queenOfHearts.toString());
        
        aceOfSpades.rank();
        aceOfSpades.suit();
        aceOfSpades.pointValue();
        System.out.println(aceOfSpades.toString());
        
        sevenOfDiamonds.rank();
        sevenOfDiamonds.suit();
        sevenOfDiamonds.pointValue();
        System.out.println(sevenOfDiamonds.toString());
        
        queenOfHearts.matches(aceOfSpades);
        queenOfHearts.matches(sevenOfDiamonds);
        aceOfSpades.matches(sevenOfDiamonds);
    }
}
