package org.example.DependencyInversionPrinciple;

public class MySQLDatabase implements BaseDeDados{
    @Override
    public void guardaDados(String dados) {
        // Implementação para salvar dados no MySQL
        System.out.println("Salvando dados no MySQL: " + dados);
    }
}
