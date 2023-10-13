public class Jogo extends Evento {
    private String esporte;
    private String equipe1;
    private String equipe2;
    private double percentualDescontoTorcedor;

    // Construtor, getters e setters

    @Override
    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade) {
        // Implementação específica para verificar disponibilidade de ingressos para jogos
    }

    @Override
    public double venderIngresso(TipoIngresso tipo, int quantidade) {
        // Implementação específica para vender ingressos para jogos
    }
}