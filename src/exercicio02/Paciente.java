package exercicio02;

public class Paciente {
    String nome;
    int idade;

    public int freqMax(){
      return 220 - idade;
    }

    public double[] frequenciaALvo(){
        double[] alvo = new double[2];
        int fm = freqMax();
        alvo[0] = fm * 0.5;
        alvo[1] = fm * 0.85;
        return alvo;
    }
}
