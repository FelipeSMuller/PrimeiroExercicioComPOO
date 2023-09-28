package ExerciciosPOO;

import javax.swing.JOptionPane;

public class Veiculo {

	public static void main(String[] args) {

		// Instancia do Objeto, com o mesmo nome.
		CarroAtributos Carro = new CarroAtributos();

		int escolha = 0;

		do {

			try {

				escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha \n1-Mostrar o Carro Completo \n2-Mostrar Placa \n3-Mostrar Marca \n4-Mostrar Ano de Fabricação"));

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você preencheu o campo com dados inválidos ou fechou o programa incorretamente");
			}

			switch (escolha) {

			case 1:

				Carro.MostraCarroCompleto();

				break;

			case 2:

				Carro.MostraPlaca();

				break;

			case 3:

				Carro.MostraMarca();

				break;

			case 4:

				Carro.MostraAno();

				break;

			default:

				JOptionPane.showMessageDialog(null, "Nenhum opção foi escolhida");

				break;

			}

		} while (escolha > 0);

	}

}
