package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraDaTela = (int) tela.getWidth();
        int alturaDaTela = (int) tela.getHeight();
        
        System.out.println("A resolução da sua tela é: " + larguraDaTela + " x " + alturaDaTela);
    }
    
}
