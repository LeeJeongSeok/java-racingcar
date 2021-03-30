package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Location;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LocationTest {

    @DisplayName("Location 객체가 생성이 잘 되었는가?")
    @Test
    void create_location() {
        Location location = new Location(0);
        assertThat(location).isEqualTo(new Location(1));
    }

    @DisplayName("0보다 작은 수가 들어올 경우")
    @Test
    void validate_location() {
        assertThatThrownBy(() -> {
           new Location(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("Location값이 바뀔 때")
    @Test
    void move_location() {
        Location location = new Location(0);
        assertThat(location.move()).isEqualTo(new Location(1));

    }

}
