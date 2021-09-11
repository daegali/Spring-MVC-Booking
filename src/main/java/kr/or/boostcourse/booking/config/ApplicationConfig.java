package kr.or.boostcourse.booking.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"kr.or.boostcourse.booking.dao", "kr.or.boostcourse.booking.service"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
