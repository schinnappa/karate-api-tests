package examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

class ExamplesTest {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:examples")
            //.outputCucumberJson(true)
            .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
