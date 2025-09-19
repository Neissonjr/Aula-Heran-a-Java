package equipe;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { 
        return marca; }
        
    public void setMarca(String marca) { 
        this.marca = marca; }

    public String getModelo() {
         return modelo; }

    public void setModelo(String modelo) {
         this.modelo = modelo; }

    public int getAno() { 
        return ano; }

    public void setAno(int ano) {
         this.ano = ano; }

    public void acelerar() {
        System.out.println("O veículo está acelerando...");
    }

     public void frear() {
        System.out.println("O veículo está freando...");
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + ")";
    }
}
