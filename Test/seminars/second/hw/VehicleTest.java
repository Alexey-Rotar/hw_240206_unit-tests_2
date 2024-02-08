package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {


    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);

        assertTrue(car instanceof Vehicle);
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами
     */
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("УАЗ", "Патриот", 2024);

        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle moto = new Motorcycle("Иж", "Планета", 1965);

        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testCarReachesSpeedInTestDrive() {
        Car car = new Car("УАЗ", "Патриот", 2013);

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testMotorcycleReachesSpeedInTestDrive() {
        Motorcycle moto = new Motorcycle("Иж", "Планета", 1965);

        moto.testDrive();

        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    public void testCarCanStop() {
        Car car = new Car("УАЗ", "Патриот", 2013);

        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    public void testMotorcycleCanStop() {
        Motorcycle moto = new Motorcycle("Иж", "Планета", 1965);

        moto.testDrive();
        moto.park();

        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}