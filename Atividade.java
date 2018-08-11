import javax.swing.JOptionPane;

class Atividade{
	
	public static void main(String [] argumentos){
	
		String superString="Nomes Inseridos:\n";
		String [] nome;
		int quantidade;		
		int i;
		do{
		   quantidade=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de nomes "));
		   if (quantidade<1){
			JOptionPane.showMessageDialog(null,"Essa quantidade é inválida!");
		   }
		}while(quantidade<1);
	
		nome = new String[quantidade];
		
		System.out.println("Nomes Digitados\n");
		for (i=0;i<quantidade;i++){
			nome[i]=JOptionPane.showInputDialog(null,"Digite o "+i+" nome ");
			superString=superString+nome[i]+"\n";
			System.out.println(nome[i]+"\n");
		}
	
		JOptionPane.showMessageDialog(null,""+superString);
	}
}
