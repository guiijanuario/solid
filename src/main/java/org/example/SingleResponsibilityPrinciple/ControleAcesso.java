package org.example.SingleResponsibilityPrinciple;

public class ControleAcesso {

    private SegurancaService seguranca;

    public ControleAcesso(SegurancaService seguranca){
        this.seguranca = seguranca;
    }

    public Usuario login(Usuario usuario, String cargo){
        if(seguranca.isValid(usuario) && seguranca.hasHole(usuario, cargo)) {
            return usuario;
        }
        try {
            throw new AcessoProibidoException("Acesso Proibido");
        } catch (AcessoProibidoException e) {
            throw new RuntimeException(e);
        }
    }

}
