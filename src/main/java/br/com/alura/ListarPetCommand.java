package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
            PetService petService = new PetService(clientHttpConfiguration);
            petService.listarPets();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
