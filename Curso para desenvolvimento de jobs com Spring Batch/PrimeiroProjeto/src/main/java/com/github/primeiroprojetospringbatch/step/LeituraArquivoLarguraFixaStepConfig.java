package com.github.primeiroprojetospringbatch.step;

import com.github.primeiroprojetospringbatch.dominio.Cliente;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeituraArquivoLarguraFixaStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
    public Step leituraArquivoLarguraFixaStep(ItemReader<Cliente> leituraArquivoLarguraFixaReader,
                                              ItemProcessor<Cliente, Cliente>  processadorValidacaoProcessor,
                                              ItemWriter<Cliente> leituraArquivoDelimitadoWriter){
        return stepBuilderFactory
                .get("leituraArquivoLarguraFixaStep")
                .<Cliente, Cliente>chunk(1)
                .reader(leituraArquivoLarguraFixaReader)
                .processor(processadorValidacaoProcessor)
                .writer(leituraArquivoDelimitadoWriter)
                .build();
    }

}
