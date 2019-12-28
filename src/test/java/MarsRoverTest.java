import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {
    @Test
    public void should_land_the_rover_on_area(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5,'E');
        String position = rover.getPosition();
        assertThat(position).isEqualTo("55E");
    }
}
