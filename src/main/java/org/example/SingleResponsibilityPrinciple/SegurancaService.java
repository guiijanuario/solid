package org.example.SingleResponsibilityPrinciple;

public class SegurancaService {

    public boolean isValid(Usuario usuario) {
        // autentica usuário
        return true;
    }

    public boolean hasHole(Usuario usuario, String cargo) {
        // valida cargo do usuário
        return true;
    }
}
