package org.example.OpenClosedPrinciple;

public class IdentificaService implements Identifica{
    @Override
    public boolean isValid(Usuario usuario) {
        // autentica usuario no Banco de Dados
        return true;
    }
}
