package test;

import javafx.geometry.Point2D;
import org.junit.Test;
import snake.Direction;
import snake.Snake;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SnakeTest {

    @Test
    public void testSnameMoves() {
        Snake snake = new Snake(new Point2D(0, 0));

        snake.setDirection(Direction.RIGHT);

        snake.update();

        assertThat(snake.getPosition(), is(new Point2D(1, 0)));
    }
}
