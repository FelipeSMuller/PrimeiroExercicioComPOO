package ExerciciosPOO;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CarroAtributos {

	// Criação dos atributos.
	public String marca; // Declaração do atributo "marca" do tipo String.
	public String placa; // Declaração do atributo "placa" do tipo String.
	public String modelo; // Declaração do atributo "modelo" do tipo String.
	public int ano; // Declaração do atributo "ano" do tipo int.
	public Double valor; // Declaração do atributo "valor" do tipo Double.

	// Inicialização dos Atributos.
	public CarroAtributos() {
		// Construtor vazio (sem parâmetros) da classe CarroAtributos.

		// Inicialização dos atributos com valores padrão.
		this.marca = "Fiat"; // Define a marca como "Fiat".
		this.modelo = "Cronos"; // Define o modelo como "Cronos".
		this.ano = 2023; // Define o ano como 2023.
		this.valor = 84.795; // Define o valor como 84.795.
		this.placa = "ABCDE-9025"; // Define a placa como "ABCDE-9025".
	}

	public CarroAtributos(String marca, String modelo, Double valor, int ano) {
		// Construtor com parâmetros da classe CarroAtributos.

		// Recebe valores para os atributos e os atribui aos atributos da classe.
		this.marca = marca; // Atribui o valor do parâmetro "marca" ao atributo "marca".
		this.modelo = modelo; // Atribui o valor do parâmetro "modelo" ao atributo "modelo".
		this.ano = ano; // Atribui o valor do parâmetro "ano" ao atributo "ano".
		this.valor = valor; // Atribui o valor do parâmetro "valor" ao atributo "valor".
	}

	public void MostraCarroCompleto() {
		// Método "MostraCarroCompleto" que exibe informações completas do carro.

		String valorFormatado; // Declaração de uma variável local "valorFormatado".
		DecimalFormat df = new DecimalFormat("R$ ##.####");
		// Cria um objeto "df" da classe DecimalFormat para formatar valores em moeda.

		valorFormatado = df.format(valor); // Formata o valor do carro com o objeto "df".

		// Exibe informações detalhadas do carro em uma caixa de diálogo.
		JOptionPane.showMessageDialog(null, "Marca do Carro = " + marca + "\nModelo = " + modelo + "\nAno = " + ano
				+ "\nPlaca = " + placa + "\nValor = " + valorFormatado);
	}

	public void MostraMarca() {
		// Método "MostraMarca" que exibe a marca do carro em uma caixa de diálogo.

		// Exibe a marca do carro em uma caixa de diálogo.
		JOptionPane.showMessageDialog(null, "Marca do Carro : " + marca);
	}

	public void MostraPlaca() {
		// Método "MostraPlaca" que exibe a placa do carro em uma caixa de diálogo.

		// Exibe a placa do carro em uma caixa de diálogo.
		JOptionPane.showMessageDialog(null, "Placa do Carro  : " + placa);
	}

	public void MostraAno() {
		// Método "MostraAno" que exibe o ano de fabricação do carro em uma caixa de
		// diálogo.

		// Exibe o ano de fabricação do carro em uma caixa de diálogo.
		JOptionPane.showMessageDialog(null, "Ano da Fabricação do Carro : " + ano);
	}

}
