package ProcessoSeletivo;

import java.util.Scanner;

public class Contador {

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar parâmetros
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        // Loop de impressão
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
