package cc.play.lzb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cc.play.lzb.dao")
public class MybatisPlusConfig {
}
