class TestaFuncionario{
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Paulo";
		funcionario.salario = 100.0;
		funcionario.recebeAumento(200);

		funcionario.dataEntrada = new Data();
		funcionario.dataEntrada.preencheData(29, 9, 2015);

		System.out.println("Salario atual: " + funcionario.salario);
        System.out.println("Ganho anual: " + funcionario.calculaGanhoAnual());

        funcionario.mostra();
	}
}
