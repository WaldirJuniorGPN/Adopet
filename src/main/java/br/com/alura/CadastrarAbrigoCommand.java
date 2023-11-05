package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {
    @Override
    public void execute() {

        try {
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(clientHttpConfiguration);
            abrigoService.cadastarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}