package random.springbootsqlitedemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import random.springbootsqlitedemo.entity.Info;
import random.springbootsqlitedemo.repository.InfoRepository;

import java.util.Date;

@Slf4j
@RequiredArgsConstructor
@Component
public class Loader implements CommandLineRunner {

    private final InfoRepository infoRepository;

    @Override
    public void run(String... args) {
        checkObjects();
    }

    private void checkObjects() {
        if (infoRepository.count() == 0) {
            infoRepository.save(Info.builder().ip("127.0.0.1").time(new Date().toString()).text("test").build());
            infoRepository.save(Info.builder().ip("127.0.0.2").time(new Date().toString()).text("test").build());
            infoRepository.save(Info.builder().ip("127.0.0.3").time(new Date().toString()).text("test").build());
            infoRepository.save(Info.builder().ip("127.0.0.4").time(new Date().toString()).text("test").build());
            infoRepository.save(Info.builder().ip("127.0.0.5").time(new Date().toString()).text("test").build());
            infoRepository.save(Info.builder().ip("127.0.0.6").time(new Date().toString()).text("test").build());
        }
        log.info("===================================================================================================");
        log.info("Info objects count: {}", infoRepository.count());
        log.info("===================================================================================================");
    }
}
