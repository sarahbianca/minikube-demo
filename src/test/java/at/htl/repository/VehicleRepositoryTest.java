package at.htl.repository;

import at.htl.entity.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;


@QuarkusTest
class VehicleRepositoryTest {

    @Inject
    VehicleRepository vehicleRepository;

    @Transactional
    @Test
    void createRecordSmokeTest() {

        var myCar = new Vehicle("Lamborghini", "Aventador");
        vehicleRepository.persist(myCar);
    }
}