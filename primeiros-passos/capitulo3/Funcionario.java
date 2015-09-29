class Funcionario{
	String nome;
	double salario;
	Data dataEntrada;

	void recebeAumento(double aumento){
		this.salario += aumento;
	}

	double calculaGanhoAnual(){
		return this.salario * 12;
	}

	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data Entrada: " + this.dataEntrada.getDataFormatada());
	}
}