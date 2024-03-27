package io.mazy.virtualthreadblocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
public class BlockeController {

    private static final Logger log = LoggerFactory.getLogger(BlockeController.class);

    @GetMapping("/block/{seconds}")
    public void block(@PathVariable Integer seconds) throws InterruptedException {
        Thread.sleep(Duration.ofMillis(seconds * 1000));
        log.info("Blocked for {} seconds", seconds);
    }

}
