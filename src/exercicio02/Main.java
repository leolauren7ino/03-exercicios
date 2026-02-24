package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        double[] alvo;

        System.out.println("NOME DO PACIENTE: ");
        paciente.nome = sc.next();

        System.out.println("IDADE DO PACIENTE:");
        paciente.idade = sc.nextInt();

        System.out.println("FREQUÊNCIA MÁXIMA DO PACIENTE: " + paciente.freqMax());
        alvo = paciente.frequenciaALvo();
        System.out.println("INÍCIO DA FREQUÊNCIA ALVO " + alvo[0]);
        System.out.println("FIM DA FREQUÊNCIA ALVO " + alvo[1]);

    }


}
