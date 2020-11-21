package com.github.primeiroprojetospringbatch.step;

import com.github.primeiroprojetospringbatch.dominio.Cliente;
import com.github.primeiroprojetospringbatch.reader.ArquivoClienteTransacaoReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings({"unchecked", "rawtypes"})
@Configuration
public class LeituraArquivoLarguraFixaStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
    public Step leituraArquivoLarguraFixaStep(FlatFileItemReader ArquivosMultiplosFormatosReader,
                                              ItemWriter<Cliente> leituraArquivoDelimitadoWriter){
        return stepBuilderFactory
                .get("leituraArquivoLarguraFixaStep")
                .<Cliente, Cliente>chunk(1)
                .reader(new ArquivoClienteTransacaoReader(ArquivosMultiplosFormatosReader))
                .writer(leituraArquivoDelimitadoWriter)
                .build();
    }

}
