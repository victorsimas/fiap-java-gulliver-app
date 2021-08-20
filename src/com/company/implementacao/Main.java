package com.company.implementacao;

import com.company.beans.Sessao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        try {
            System.out.print("Insira o token de autenticação\n");

            Scanner in = new Scanner(System.in);
            String accessToken = in.nextLine();

            Sessao sessao = new Sessao(accessToken);
            System.out.print(sessao);
            System.out.print("\n\nIdUsuário " + sessao.getUsuarioInfo().getIdUsuario());

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
