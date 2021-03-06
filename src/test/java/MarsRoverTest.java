import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {
    @Test
    public void should_land_the_rover_on_area() {
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, 'E');
        String position = rover.getPosition();
        assertThat(position).isEqualTo("55E");
    }

    @Test
    public void should_move_forward() {
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, 'E');
        rover.move();
        rover.move();
        rover.move();
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("95E");
    }

    @Test
    public void name() {
        Rover rover = new Rover();
        RoverController roverController = new RoverController(rover);
        String mission = "10,10,5,5,E,M,L,M,R";
        String position = roverController.excute(mission);
        assertThat(position).isEqualTo("66E");

    }

}
