package com.company.services;

import com.company.beans.OrigemUsuario;
import com.company.beans.Sessao;
import com.company.beans.Usuario;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class UsuarioLoginService {

    @Contract("null -> fail")
    public static @NotNull Sessao login(HashMap<String, String> usuarioLoginInfo) throws Exception {
        if (usuarioLoginInfo != null
                && !usuarioLoginInfo.isEmpty()
                && usuarioLoginInfo.get("usuario").equals("victor")
                && usuarioLoginInfo.get("senha").equals("senha123")) {

            Sessao sessao = new Sessao(getUsuario(), gerarAccessToken());

            return sessao;
        }
        else {
            throw new Exception("Não foi possível autenticar");
        }
    }

    @NotNull
    private static Usuario getUsuario() {
        OrigemUsuario origemUsuario = new OrigemUsuario();
        origemUsuario.setCidade("São Paulo");
        origemUsuario.setPais("Brasil");

        ArrayList<String> interesses = new ArrayList<>();
        interesses.add("Aprender");

        return new Usuario(1234, 22, "Victor Simas", interesses, origemUsuario, "victorsimas@email.com");
    }

    private static String gerarAccessToken() {
        return "1234567890qwertyuioQWERTYUIOPZXCVBNMzxcvbnmasdfghjk";
    }
}
