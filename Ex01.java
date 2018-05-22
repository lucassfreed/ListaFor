import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
    
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));

        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + (numero*contador));

        }

    }
}