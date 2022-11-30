package hello.itemservice;

import hello.itemservice.config.QuerydslConfig;
import hello.itemservice.config.V2Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Slf4j
//@Import(JpaConfig.class)
//@Import(SpringDataJpaConfig.class)
//@Import(QuerydslConfig.class)
@Import(V2Config.class)
@SpringBootApplication(scanBasePackages = "hello.itemservice.web")
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

}
