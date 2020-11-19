package com.github.primeiroprojetospringbatch.writer;

import com.github.primeiroprojetospringbatch.dominio.Cliente;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeituraArquivoLarguraFixaWriterConfig {

        @Bean
        public ItemWriter<Cliente> leituraArquivoLarguraFixaWriter() {
            return items -> items.forEach(System.out::println);
        }

}
