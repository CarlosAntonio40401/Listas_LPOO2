
package aulaHerenca_Exercicio2;

import javax.swing.JOptionPane;


public class TesteAdministrador {

    
    public static void main(String[] args) {
       Administrador administrador= new Administrador();
       
       String nome,idade,altura,sexo,salario,ajudaDeCusto = null;
       
       nome=JOptionPane.showInputDialog(null, "Informe o nome do administrador:");
       administrador.setNome(nome);
       idade=JOptionPane.showInputDialog(null,"Informe a idade:");
       administrador.setIdade(Integer.parseInt(idade));
       altura=JOptionPane.showInputDialog(null,"Informe a altura:");
       administrador.setAltura(Float.parseFloat(altura));
       sexo=JOptionPane.showInputDialog(null,"Informe o sexo:");
       administrador.setSexo(sexo);
       salario=JOptionPane.showInputDialog(null,"Informe o salário:");
       administrador.setSalario(Float.parseFloat(salario));
       ajudaDeCusto=JOptionPane.showInputDialog(null,"Informe a ajuda de custo:");
       administrador.setAjudaDeCusto(Float.parseFloat(salario));
       
       
       JOptionPane.showMessageDialog(null, "\n  Nome:"+administrador.getNome()+"\n Idade:"+administrador.getIdade()+
              "\n  Altura:"+administrador.getAltura()+"\n Sexo:"+administrador.getSexo()+ "\n Salário:"+administrador.getSalario()
       +"\n Ajuda de custo:"+administrador.getAjudaDeCusto()+
   "Obter lucro:"+administrador.obterLucros()     );
       
    }
    
}
