/**
  test copy constructor for BoardForQueensPuzzle
 */

public class UserOfCopyConstructor {
    public static void main(String[] commandLine) {
        System.out.println();

        System.out.println(
            "Code in the skeleton for BoardForQueensPuzzle was tested "
          + "in the previous homework." + System.lineSeparator()
          + "Code below here tests the copy constructor in "
          + "BoardForQueensPuzzle." + System.lineSeparator()
          );

        // Create the board that will be changed
        BoardForQueensPuzzle changeMe = new BoardForQueensPuzzle( 3);
        changeMe.populate(2);
        changeMe.populate(0);
        System.out.println( "Before change, the original is..."
                          + System.lineSeparator()
                          + changeMe
                          );

        // copy-construct another board
        BoardForQueensPuzzle snapshot = new BoardForQueensPuzzle( changeMe);
        System.out.println( "...and the snapshot is..."
                          + System.lineSeparator()
                          + snapshot
                          );

        // shrink the original
        changeMe.depopulate();

        System.out.println( "after depopulation, the original is..."
                          + System.lineSeparator()
                          + changeMe + System.lineSeparator()
                          + "...and the snapshot is..."
                          + System.lineSeparator()
                          + snapshot
                          );

        // re-populate the original, but into a different file
        changeMe.populate(1);

        System.out.println( "after re-population, the original is..."
                          + System.lineSeparator()
                          + changeMe + System.lineSeparator()
                          + "...and the snapshot is..."
                          + System.lineSeparator()
                          + snapshot
                          );
    }
}
