package org.example.OpenClosedPrinciple;

public class ControleAcesso {

    private Identifica identifica;
    private PermissaoService permissao;

    public ControleAcesso(Identifica identifica, PermissaoService permissao){
        this.identifica = identifica;
        this.permissao = permissao;
    }

    public Usuario login(Usuario usuario, String cargo){
        if(identifica.isValid(usuario) && permissao.hasHole(usuario, cargo)) {
            return usuario;
        }
        try {
            throw new AcessoProibidoException("Acesso Proibido");
        } catch (AcessoProibidoException e) {
            throw new RuntimeException(e);
        }
    }

}
