public class Exposicao extends Evento {
    private int faixaEtaria;
    private int duracaoDias;
    private boolean descontoSocial;

    // Construtor, getters e setters

    @Override
    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade) {
        // Implementação específica para verificar disponibilidade de ingressos para exposições
    }

    @Override
    public double venderIngresso(TipoIngresso tipo, int quantidade) {
        // Implementação específica para vender ingressos para exposições
    }
}
