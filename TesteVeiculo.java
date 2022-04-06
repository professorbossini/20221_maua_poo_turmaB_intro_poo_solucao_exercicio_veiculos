import javax.swing.JOptionPane;

public class TesteVeiculo {
    public static void main(String[] args) {
        //2.1
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        //2.2
        String cor1 = JOptionPane.showInputDialog("Digite a cor 1");

        String cor2 = JOptionPane.showInputDialog("Digite a cor 2");

        String modelo1 = JOptionPane.showInputDialog("Digite o modelo 1");

        String modelo2 = JOptionPane.showInputDialog("Digite o modelo 2");

        v1.setCor(cor1);
        v2.setCor(cor2);

        v1.setModelo(modelo1);
        v2.setModelo(modelo2);


        //2.3
        v1.acelerar();
        v1.reduzirVelocidade();

        v2.acelerar();
        v2.reduzirVelocidade();

        //2.4
        System.out.printf("V1. Cor: %s, Modelo %s\n", v1.getCor(), v1.getModelo());

        System.out.println(String.format(
            "V2. Cor: %s, Modelo: %s",
            v2.getCor(),
            v2.getModelo()
        ));
    }
}
