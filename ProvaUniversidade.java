package exercicioAbstracao;

abstract class ProvaUniversidade {
    private double av1;
    private double av2;

    public ProvaUniversidade(double av1, double av2) {
        this.av1 = av1;
        this.av2 = av2;
    }

    public double calculaMedia () {
        return (av1 + av2) / 2;
    }
}
