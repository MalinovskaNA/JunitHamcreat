import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {
    Main sut;

    @BeforeAll
    public static void startedAll() {
        System.out.println(" Tests started");
    }

    @BeforeEach
    public void started() {
        System.out.println(" Test started");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println(" Tests completed");
    }

    @AfterEach
    public void finished() {
        System.out.println(" Test completed");
    }

    @org.junit.jupiter.api.Test
    public void testRotateRight90_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int[][] expected = {
                {2, 4, 9},
                {3, 5, 8},
                {1, 6, 0}
        };

        // when:
        int[][] result = Main.rotateRight90(m);

        // then:
        Assertions.assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testRotateRight180_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int[][] expected = {
                {1, 3, 2},
                {6, 5, 4},
                {0, 8, 9}
        };

        // when:
        int[][] result = Main.rotateRight180(m);

        // then:
        Assertions.assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testRotateRight270_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int[][] expected = {
                {0, 6, 1},
                {8, 5, 3},
                {9, 4, 2}
        };

        // when:
        int[][] result = Main.rotateRight270(m);

        // then:
        Assertions.assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testRotateMatrix_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int a = 270;
        int[][] expected = {
                {0, 6, 1},
                {8, 5, 3},
                {9, 4, 2}
        };

        // when:
        int[][] result = Main.rotateMatrix(m, a);

        // then:
        Assertions.assertArrayEquals(expected, result);
    }

    //Hamcrest

    @Test
    public void testRotateRight90_Hamcrest_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int[][] expected = {
                {2, 4, 9},
                {3, 5, 8},
                {1, 6, 0}
        };

        // when:
        int[][] result = Main.rotateRight90(m);

        // then:
        assertThat(expected, Matchers.arrayContaining(result));
    }

    @Test
    public void testRotateRight180_Hamcrest_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int[][] expected = {
                {1, 3, 2},
                {6, 5, 4},
                {0, 8, 9}
        };

        // when:
        int[][] result = Main.rotateRight180(m);

        // then:
        assertThat(expected, Matchers.arrayContaining(result));
    }

    @Test
    public void testRotateMatrix_Hamcrest_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int a = 270;
        int[][] expected = {
                {0, 6, 1},
                {8, 5, 3},
                {9, 4, 2}
        };

        // when:
        int[][] result = Main.rotateMatrix(m, a);

        // then:
        assertThat(expected, Matchers.arrayContaining(result));
    }

    @Test
    public void testRotateMatrix_notNullResult_Hamcrest_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int a = 270;
        // when:
        int[][] result = Main.rotateMatrix(m, a);

        // then:
        assertThat(result, Matchers.notNullValue());
    }

    @Test
    public void testRotateMatrix__Hamcrest_success() {
        // given:
        int[][] m = {
                {9, 8, 0},
                {4, 5, 6},
                {2, 3, 1}
        };
        int a = 270;
        // when:
        int[][] result = Main.rotateMatrix(m, a);

        // then:
        assertThat(result, Matchers.arrayWithSize(3));
    }

}
