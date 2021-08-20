package com.company.services;

import com.company.beans.OrigemUsuario;
import com.company.beans.Usuario;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class UsuarioLoginService {

    @Contract("null -> fail")
    public static @NotNull Usuario login(String accessToken) throws Exception {
        if (accessToken != null && !accessToken.isEmpty() && !accessToken.isBlank()) {
            OrigemUsuario origemUsuario = new OrigemUsuario();
            origemUsuario.setCidade("São Paulo");
            origemUsuario.setPais("Brasil");

            ArrayList<String> interesses = new ArrayList<>();
            interesses.add("Aprender");

            return new Usuario(1234, 22, "Victor Simas", interesses, origemUsuario, "victorsimas@email.com");
        }
        else {
            throw new Exception("Não foi possivel autenticar");
        }
    }
}
