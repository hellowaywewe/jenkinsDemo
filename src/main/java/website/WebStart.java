package website;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("website.mapper")
@SpringBootApplication
public class WebStart {
    public static void main(String[] args) {
        SpringApplication.run(WebStart.class, args);
    }
}
