package src.builderpattern;
public class CasaDeBoneca {
    private String paredes;
    private String portas;
    private String janelas;
    private String andares;
    private String papelDeParede;


    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public void setJanelas(String janelas) {
        this.janelas = janelas;
    }

    public void setAndares(String andares) {
        this.andares = andares;
    }

    public void setPapelDeParede(String papelDeParede) {
        this.papelDeParede = papelDeParede;
    }

    @Override
    public String toString() {
        return "Casa De Boneca :" +
        "\n  Paredes: '" + paredes + '\'' +
        "\n  Portas: '" + portas + '\'' +
        "\n  Janelas: '" + janelas + '\'' +
        "\n  Andares: '" + andares + '\'' +
        "\n  Papel de Parede: '" + papelDeParede + '\'' +
        "\n";
    }
}
