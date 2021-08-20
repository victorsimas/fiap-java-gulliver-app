package com.company.beans;

import com.company.services.UsuarioLoginService;

import java.util.UUID;

public class Sessao
{
    private final UUID idSessao;
    private final Usuario usuarioInfo;

    public Sessao(String accessToken) throws Exception {
        this.idSessao = UUID.randomUUID();
        this.usuarioInfo = UsuarioLoginService.login(accessToken);
    }

    @Override
    public String toString() {
        if(this.usuarioInfo != null)
        {
            Usuario usuario = this.getUsuarioInfo();
            return "Usuário " + usuario.getNome() + "\n"
                    + "De idade " + usuario.getIdade() + "\n"
                    + "Da Cidade " + usuario.getOrigem().getCidade()
                    + " Do País " + usuario.getOrigem().getPais() + "\n"
                    + "Com Email " + usuario.getEmail() + "\n"
                    + "Possui interesse em " + usuario.getInteresses().get(0) + "\n"
                    + "Está na sessão " + this.getIdSessao();
        }
        else
        {
            return "Nenhuma informação de usuário preenchida";
        }
    }

    public Usuario getUsuarioInfo() {
        return this.usuarioInfo;
    }

    public UUID getIdSessao() {
        return this.idSessao;
    }
}
