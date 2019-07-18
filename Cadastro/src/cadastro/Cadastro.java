package cadastro;

import cadastro.CadatroDao.CadastroDao;
import cadastro.View.TelaPrincipal;

public class Cadastro {


    public static void main(String[] args) throws Exception {
            
        CadastroDao cadastroDao = new CadastroDao();
        Cliente cliente = new Cliente();
        
        TelaPrincipal tela  = new TelaPrincipal();
        
        tela.setVisible(true);
        
    }
    
}
