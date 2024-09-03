/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distribuidoraf;

public class DistribuidoraF {
public static void main(String[] args) {
        // Valores do faturamento mensal
        double sp = 367836.43;
        double rj = 536676.86;
        double mg = 929229.88;
        double es = 251765.48;
        double outros = 919849.53;

        // Calculando o total
        double total = sp + rj + mg + es + outros;

        // Calculando os percentuais
        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        // Exibindo os resultados
        System.out.printf("Faturamento Total: R$ %.2f%n", total);
        System.out.printf("Percentual SP: %.2f%%%n", percentualSP);
        System.out.printf("Percentual RJ: %.2f%%%n", percentualRJ);
        System.out.printf("Percentual MG: %.2f%%%n", percentualMG);
        System.out.printf("Percentual ES: %.2f%%%n", percentualES);
        System.out.printf("Percentual Outros: %.2f%%%n", percentualOutros);
    }
}
