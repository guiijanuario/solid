package org.example.DependencyInversionPrinciple;

public class Main {

    public static void main(String[] args) {
        BaseDeDados mySQLDatabase = new MySQLDatabase();
        ProcessadorDeDados mySQLProcessor = new ProcessadorDeDados(mySQLDatabase);
        mySQLProcessor.processData("Dados a serem processados e salvos no MySQL");

        BaseDeDados oracleDatabase = new OracleDatabase();
        ProcessadorDeDados oracleProcessor = new ProcessadorDeDados(oracleDatabase);
        oracleProcessor.processData("Dados a serem processados e salvos na Oracle");
    }
}
