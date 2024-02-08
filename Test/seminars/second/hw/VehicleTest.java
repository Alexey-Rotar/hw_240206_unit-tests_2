package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car;
    Motorcycle moto;

    @BeforeEach
    void setUp() {
        car = new Car("УАЗ", "Патриот", 2013);
        moto = new Motorcycle("Иж", "Планета", 1965);
    }


    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами
     */
    @Test
    public void testCarHasFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void testMotorcycleHasTwoWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testCarReachesSpeedInTestDrive() {

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testMotorcycleReachesSpeedInTestDrive() {

        moto.testDrive();

        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    public void testCarCanStop() {

        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    public void testMotorcycleCanStop() {

        moto.testDrive();
        moto.park();

        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}