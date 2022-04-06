public class Veiculo{
    private String cor;
    private String modelo;

    public void acelerar(){
        System.out.printf("Veiculo %s acelerando...\n", modelo);
    }

    public void reduzirVelocidade(){
        System.out.printf("Veiculo %s reduzindo a velocidade...\n", modelo);
    }

    public String getCor(){
        return cor;
    }

    public String getModelo(){
        return modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}