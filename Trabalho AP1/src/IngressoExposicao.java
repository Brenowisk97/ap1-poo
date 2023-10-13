public class IngressoExposicao extends Ingresso {
    private int faixaEtariaMinima;
    private int duracaoEmDias;
    private boolean descontoSocial;

    // Construtor da classe IngressoExposicao
    public IngressoExposicao(String evento, TipoIngresso tipo, int faixaEtariaMinima, int duracaoEmDias, boolean descontoSocial) {
        super(evento, tipo);
        this.faixaEtariaMinima = faixaEtariaMinima;
        this.duracaoEmDias = duracaoEmDias;
        this.descontoSocial = descontoSocial;
    }

    // Métodos getters e setters para obter e definir informações sobre a exposição
    public int getFaixaEtariaMinima() {
        return faixaEtariaMinima;
    }

    public int getDuracaoEmDias() {
        return duracaoEmDias;
    }

    public boolean isDescontoSocial() {
        return descontoSocial;
    }

    public void setDescontoSocial(boolean descontoSocial) {
        this.descontoSocial = descontoSocial;
    }

    // Implementação do método abstrato para calcular o preço do ingresso de exposições
    @Override
    public double getPreco() {
        if (descontoSocial) {
            return 0.0; // Se houver desconto social, o preço é zerado
        } else {
            // Lógica para calcular o preço do ingresso de exposições
            double precoBase = 50.0; // Preço base do ingresso para a exposição
            double precoFinal = precoBase;

            // Aplica desconto para meia entrada
            if (getTipo() == TipoIngresso.MEIA) {
                precoFinal *= 0.5; // 50% de desconto para meia entrada
            }

            return precoFinal;
        }
    }
}