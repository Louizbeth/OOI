package ifpr.pgua.eic.atividade06;

import java.util.ArrayList;
import ifpr.pgua.eic.atividade06.Veiculo;

public class Estacionamento {
    private String nome;
    private String telefone;
    private ArrayList<Veiculo> veiculos;
    
    public Estacionamento(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public boolean cadastrarVeiculo(String placa, String modelo, String fabricante, int anoFabricacao, String cor){
        //corrigir
        return true;
    }

    public ArrayList<Veiculo> listarTodosVeiculos(){
        //corrigir
        return veiculos;
    }

    public ArrayList<Veiculo> listarVeiculosEstacionados(){
        //corrigir
        return veiculos;
    }

    public Veiculo buscarVeiculo(String placa){
        //corrigir
        return ;
    }

    public boolean registrarEntrada(String placa){
        //corrigir
    }

    public int registrarSaida(String placa){
        //corrigir
        return ;
    }

    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        String str = "";

        str = "Estacionamento: ";
        str = str +"Nome:"+nome;
        str = str +"Telefone : "+telefone;
        str = str +"Veiculos: "+veiculos;
        str = str +" ";

        return str;

    }
}
