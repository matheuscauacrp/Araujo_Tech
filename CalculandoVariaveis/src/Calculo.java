
public class Calculo {
	public static void main(String[] args) {
		String produto;
		int quantidade;
		double valorUnitario;
		
		produto = "Mouse";
		quantidade = 10;
		valorUnitario = 350.00;
		double total = quantidade * valorUnitario;
		
		System.out.println("Produto:" + produto);
		System.out.println("Valor do produto: " + valorUnitario);
		System.out.println("Estoque: " + quantidade);
		
		System.out.println();
	}
}
