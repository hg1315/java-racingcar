package study.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.RacingCar;
import racingcar.RandomMove;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarTest {
    private static final int STANDARD_MOVEMENT = 0;
    private static final int BOUND = 1;
    private static final RandomMove RANDOM_MOVE = new RandomMove(STANDARD_MOVEMENT, BOUND);
    private String NAME_ONE = "pobi";
    private String NAME = "pobi,crong";
    private RacingCar racingCar;

    @BeforeEach
    void setup() {
        racingCar = new RacingCar(NAME, RANDOM_MOVE);
    }

    @Test
    @DisplayName("레이싱 차 준비 됐는지")
    void isRacingCar() {
        assertEquals(NAME_ONE, racingCar.carReady(NAME).getCar().get(0).getName());
    }

    @Test
    @DisplayName("차 움직임 테스트")
    void canCarPlay() {
        racingCar.racingPlay();

        assertEquals(1, racingCar.getCarList().get(0).getPosition());
    }

}
