package com.github.primeiroprojetospringbatch.step;

import com.github.primeiroprojetospringbatch.dominio.Cliente;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeituraArquivoLarguraFixaStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
    public Step leituraArquivoLarguraFixaStep(JdbcPagingItemReader<Cliente> jdbcPagingReader,
                                              ItemWriter<Cliente> leituraArquivoDelimitadoWriter){
        return stepBuilderFactory
                .get("leituraArquivoLarguraFixaStep")
                .<Cliente, Cliente>chunk(1)
                .reader(jdbcPagingReader)
                .writer(leituraArquivoDelimitadoWriter)
                .build();
    }

}
