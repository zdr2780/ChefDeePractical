
import org.junit.Test;
import org.junit.Before;

public class SolverBasicTest {
    private GameGrid game;

    @Before
    public void setUp() {
        int[][] grid = new int[][]{
            {9,4,0,1,0,2,0,5,8},
            {6,0,0,0,5,0,0,0,4},
            {0,0,2,4,0,3,1,0,0},
            {0,2,0,0,0,0,0,6,0},
            {5,0,8,0,2,0,4,0,1},
            {0,6,0,0,0,0,0,8,0},
            {0,0,1,6,0,8,7,0,0},
            {7,0,0,0,4,0,0,0,3},
            {4,3,0,5,0,9,0,1,2}
        };

        game = new GameGrid(grid);
    }

    @Test
    public void solveTest() {
        boolean result = Solver.solve(game);
    }

}
