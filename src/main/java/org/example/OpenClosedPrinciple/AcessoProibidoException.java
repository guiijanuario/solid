package org.example.OpenClosedPrinciple;

public class AcessoProibidoException extends Exception{
    public AcessoProibidoException(){
        super("Acesso proibido");
    }

    public AcessoProibidoException(String message) {
        super(message);
    }

}
