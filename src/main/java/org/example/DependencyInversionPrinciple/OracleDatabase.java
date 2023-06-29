package org.example.DependencyInversionPrinciple;

public class OracleDatabase implements BaseDeDados{
    @Override
    public void guardaDados(String dados) {
        // Implementação para salvar dados no Oracle
        System.out.println("Salvando dados no Oracle: " + dados);
    }
}
