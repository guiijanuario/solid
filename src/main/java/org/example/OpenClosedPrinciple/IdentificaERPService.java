package org.example.OpenClosedPrinciple;

public class IdentificaERPService implements Identifica{
    @Override
    public boolean isValid(Usuario usuario) {
        // autentica no servidor do ERP
        return true;
    }
}
