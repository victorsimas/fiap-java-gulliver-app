package com.company.implementacao;

import com.company.beans.Sessao;
import com.company.services.UsuarioLoginService;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        try {
            HashMap<String, String> usuarioLoginInfo = ColetarDadosUsuario();

            Sessao sessao = UsuarioLoginService.login(usuarioLoginInfo);

            System.out.print(sessao);
            System.out.print(sessao.getSessaoInfo());

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    private static HashMap<String, String> ColetarDadosUsuario() {
        HashMap<String, String> usuarioLoginInfo = new HashMap<String, String>();

        boolean ui = true;
        while (ui) {
            Scanner scanner = new Scanner(System.in);

            ExibirLoginParaUsuario(scanner, usuarioLoginInfo);

            System.out.print("\nAs informações estão corretas?\n" + usuarioLoginInfo + "\n'sim' ou 'não'?\n");

            String confirmacao = scanner.nextLine();

            if(confirmacao.equals("sim")) {
                ui = false;
            }
            else {
                usuarioLoginInfo = new HashMap<String, String>();
            }
        }

        return usuarioLoginInfo;
    }

    private static void ExibirLoginParaUsuario(Scanner scanner,HashMap<String, String> usuarioLoginInfo) {
        System.out.print("Insira seu usuário:\n");

        usuarioLoginInfo.put("usuario", scanner.nextLine());

        System.out.print("Insira sua senha:\n");
        usuarioLoginInfo.put("senha", scanner.nextLine());
    }
}
