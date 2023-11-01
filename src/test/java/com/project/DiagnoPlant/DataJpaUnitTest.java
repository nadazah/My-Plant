package com.project.DiagnoPlant;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/*~~(Unable to find runtime dependencies beginning with: 'junit-jupiter-api')~~>*/@RunWith(SpringRunner.class)
@DataJpaTest
class DataJpaUnitTest {

    @Autowired
    TestEntityManager entityManager;

    @Test
    void givenACorrectSetup_thenAnEntityManagerWillBeAvailable() {
        assertNotNull(entityManager);
    }
}