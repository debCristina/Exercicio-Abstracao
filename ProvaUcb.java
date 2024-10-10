package exercicioAbstracao;

public class ProvaUcb extends ProvaUniversidade{
    public ProvaUcb(double av1, double av2) {
        super(av1, av2);
    }

    public boolean aprovado () {
        double media = calculaMedia();
        return media >= 7.0;
    }


}
