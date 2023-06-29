package org.example.DependencyInversionPrinciple;

public class ProcessadorDeDados {
    private BaseDeDados baseDeDados;

    public ProcessadorDeDados(BaseDeDados baseDeDados) {
        this.baseDeDados = baseDeDados;
    }

    public void processData(String data) {
        // Lógica para processar os dados
        System.out.println("Processando dados: " + data);
        baseDeDados.guardaDados(data);
    }

}
