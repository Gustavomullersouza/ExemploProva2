import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploProva {
    private JTextField txtValor;
    private JPanel panelMain;
    private JButton btnExibir;
    private JButton BtnSomar;

    Integer valor = 0;

    String operacao = "";

    public String somar(Integer num1, Integer num2) {
        return String.valueOf(num1 + num2+ 2.5);
    }

    public ExemploProva() {
        btnExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer valorDois = Integer.valueOf(txtValor.getText());
                  Integer soma = 0;
                if (operacao.equals("+")){
                    soma = valor + valorDois;
                }

                txtValor.setText(String.valueOf(soma));
            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setTitle("Minha TV");
        tela.setSize(500, 500);
        tela.setContentPane(new ExemploProva().panelMain);
        tela.setVisible(true);
    }
}
