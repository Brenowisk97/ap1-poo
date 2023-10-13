public abstract class Evento {
    private String nome;
    private String data;
    private String local;
    private int ingressosInteira;
    private int ingressosMeia;
    private double precoCheio;

    // Construtor, getters e setters

    public abstract boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade);
    public abstract double venderIngresso(TipoIngresso tipo, int quantidade);
}