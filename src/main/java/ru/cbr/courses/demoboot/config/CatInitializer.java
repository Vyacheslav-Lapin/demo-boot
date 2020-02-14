package ru.cbr.courses.demoboot.config;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.cbr.courses.demoboot.dao.CatRepository;
import ru.cbr.courses.demoboot.model.Cat;

@Component
@RequiredArgsConstructor
public class CatInitializer implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("Васька", "Матроскин", "Мурзик")
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
