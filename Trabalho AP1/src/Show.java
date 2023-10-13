public class Show extends Evento {
    private String  nomeArtista;
    private String  generoMusical;
    private String  tipoIngresso; // "pista" ou "camarote"

    // Construtor, getters e setters

    @Override
    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade) {
        // Implementação específica para verificar disponibilidade de ingressos para shows
    }

    @Override
    public double venderIngresso(TipoIngresso tipo, int quantidade) {
        // Implementação específica para vender ingressos para shows
    }
}