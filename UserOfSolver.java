/**
  test SolverForQueensPuzzle

  command line arguments:
    o  the width of biggest board
    o  (optional) max number of solutions to show
 */

public class UserOfSolver {
    static int maxBoardPics;  // control output

    public static void main(String[] commandLine) {
        System.out.println();

        // Specify board size in command line argument
        if( commandLine.length < 1) {
            System.out.println(
                "Error: missing command-line argument."
              + System.lineSeparator()
              + "On the command line, "
              + "specify the width of biggest board to test, "
              + "like..." + System.lineSeparator()
              + "    > java UserOfSolver 4"
              );
            System.exit(1);
        }

        // record any limit of the number of boards to show
        if( commandLine.length < 2)
            // default: show all boards
            maxBoardPics = -1;
        else // a cap was specified
            maxBoardPics = Integer.parseInt( commandLine[1]);

        // tests
        for( int boardSize = 0
           ; boardSize <= Integer.parseInt( commandLine[0])
           ; boardSize++)
            oneTest( boardSize);
    }


    /**
      run one test
     */
    private static void oneTest( int size
                               ) {
        String puzzle = size + "x" + size + " board";

        /* Announce the board size before invoking the
           Solver, so that the announcement precedes any
           debugging output.
         */
        System.out.println( puzzle + " starting");

        SolverForQueensPuzzle solutions =
           new SolverForQueensPuzzle( size);

        System.out.println( puzzle + ": "
                          + solutions.toString( maxBoardPics)
                          + System.lineSeparator());
    }
}
