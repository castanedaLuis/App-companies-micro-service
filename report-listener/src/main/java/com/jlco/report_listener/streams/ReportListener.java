package com.jlco.report_listener.streams;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class ReportListener {

    @Bean
    public Consumer<String> consumerReport() {
        return report -> {
            //this.reportRepository.save(ReportDocument.builder().content(report).build());
            log.info("Saving report: {}", report);
        };
    }
}
