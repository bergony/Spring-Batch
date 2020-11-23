package com.github.primeiroprojetospringbatch.reader;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.MultiResourceItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;


@Configuration
public class LeituraMultiplosArquivosClienteTransacaoReaderConfig {

    @SuppressWarnings({"unchecked", "rawtypes"})
    @StepScope
    @Bean
    public MultiResourceItemReader LeituramultiplosArquivosClienteTransacaoReader(
            @Value("#{jobParameters['arquivosClientes']}") Resource[] arquivosClientes ,
            FlatFileItemReader leituraArquivosMultiplosFormatosReader) {
        return new MultiResourceItemReaderBuilder<>()
                .name("LeituramultiplosArquivosClienteTransacaoReader")
                .resources(arquivosClientes)
                .delegate(new ArquivoClienteTransacaoReader(leituraArquivosMultiplosFormatosReader))
                .build();
    }
}
