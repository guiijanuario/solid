package org.example.SingleResponsibilityPrinciple;

public class AcessoProibidoException extends Exception{
    public AcessoProibidoException(){
        super("Acesso proibido");
    }

    public AcessoProibidoException(String message) {
        super(message);
    }

}
