package com.github.primeiroprojetospringbatch.processor;

import com.github.primeiroprojetospringbatch.dominio.Cliente;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.BeanValidatingItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorValidacaoProcessorConfig {
    @Bean
    public ItemProcessor<Cliente, Cliente> processadorValidacaoProcessor() {
        BeanValidatingItemProcessor<Cliente> processor = new BeanValidatingItemProcessor<>();
        return processor;
    }
}
