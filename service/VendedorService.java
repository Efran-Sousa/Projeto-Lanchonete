package service;

import model.Vendedor;
import util.FormatadorMoeda;

public class VendedorService {
    /**
     * Cria uma nova instância de Vendedor
     */
    public Vendedor criarVendedor(String nome, double salario) {
        return new Vendedor(nome, salario);
    }
    
    /**
     * Calcula o valor total a receber (salário + bônus)
     */
    public double calcularTotalReceber(Vendedor vendedor) {
        return vendedor.getSalario() + vendedor.getBonus();
    }
    
    public void mostrarInformacoes(Vendedor vendedor) {
        System.out.println("\n=== Informações do Vendedor ===");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário base: " + FormatadorMoeda.formatar(vendedor.getSalario()));
        System.out.println("Bônus acumulado: " + FormatadorMoeda.formatar(vendedor.getBonus()));
        System.out.println("Total a receber: " + 
                FormatadorMoeda.formatar(vendedor.getSalario() + vendedor.getBonus()));
    }
    
    public void mostrarResumoFinalTurno(Vendedor vendedor) {
        System.out.println("\n======== RESUMO FINAL DO TURNO ========");
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Salário base: " + FormatadorMoeda.formatar(vendedor.getSalario()));
        System.out.println("Bônus total acumulado: " + FormatadorMoeda.formatar(vendedor.getBonus()));
        System.out.println("Valor total a receber: " + 
                FormatadorMoeda.formatar(vendedor.getSalario() + vendedor.getBonus()));
        System.out.println("=======================================");
    }
}