package ifpr.pgua.eic.atividade06;

import java.time.LocalDateTime;

public class Veiculo {
    LocalDateTime data = LocalDateTime.now();

    private String placa;
    private String modelo;
    private String fabricante;
    private int anoFabricacao;
    private String cor;
    private LocalDateTime horaEntrada = LocalDateTime.now().minusMinutes(10);
    LocalDateTime dataSaida = LocalDateTime.now();
    private boolean estaEstacionado;

    public Veiculo(String placa, String modelo, String fabricante, int anoFabricacao, String cor){
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstaEstacionado() {

    }

    public LocalDateTime getHoraEntrada() {

    }

    public boolean registraEntrada(LocalDateTime horaEntrada) {
        
    }

    public boolean registraSaida(LocalDateTime horaEntrada) {

    }

    public String toString(){
        String str = "";

        str = "Veiculo";
        str = str +"Placa:"+placa;
        str = str +"Modelo : "+modelo;
        str = str +"Fabricante"+fabricante;
        str = str +"Ano Fabricacao: "+anoFabricacao;
        str = str +"Cor:"+cor;
        str = str +" ";

        return str;

    }



}
