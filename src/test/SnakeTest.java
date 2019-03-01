package test;

import javafx.geometry.Point2D;
import org.junit.Assert;
import org.junit.Test;
import snake.Direction;
import snake.Food;
import snake.Snake;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SnakeTest {

    @Test
    public void testSnameMoves() {
        Snake snake = new Snake(new Point2D(0, 0));

        for (Direction direction : Direction.values()) {
            Point2D oldPosition = snake.getPosition();

            snake.setDirection(direction);

            snake.update();

            assertThat(snake.getPosition(), is(oldPosition.add(direction.vector)));
        }
    }

    @Test
    public void testSnakeFoodCollision() {
        Snake snake = new Snake(new Point2D(10, 5));

        Food food = new Food(new Point2D(10, 5));

        Assert.assertTrue(snake.isCollidingWith(food));
    }
}
