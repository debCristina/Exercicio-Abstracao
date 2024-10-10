package exercicioAbstracao;

public class Teste {
    public static void main(String[] args) {
        ProvaUcb provaUcb = new ProvaUcb(7,4);
        ProvaFafifo provaFafifo = new ProvaFafifo(6,6);

        System.out.println("Aprovado UCB: "+provaUcb.aprovado());
        System.out.println("Aprovado Fafifo: "+provaFafifo.aprovado());
    }
}
