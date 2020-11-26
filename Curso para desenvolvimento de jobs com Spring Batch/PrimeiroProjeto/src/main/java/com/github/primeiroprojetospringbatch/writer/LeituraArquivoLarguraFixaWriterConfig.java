package com.github.primeiroprojetospringbatch.writer;

import com.github.primeiroprojetospringbatch.dominio.Cliente;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeituraArquivoLarguraFixaWriterConfig {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public ItemWriter<Cliente> leituraArquivoDelimitadoWriter() {
        return clientes -> clientes.forEach(System.out::println);
    }
//
//    @Bean
//    public ItemWriter<Cliente> leituraArquivoLarguraFixaWriter() {
//        return items -> items.forEach(System.out::println);

//            return itens -> {
//                for(Cliente cliente: itens) {
//                    if(cliente.getNome().equals("Mari"))
//                        throw new Exception();
//                    else
//                        System.out.println(cliente);
//                }
//            };
//
//    }
}
