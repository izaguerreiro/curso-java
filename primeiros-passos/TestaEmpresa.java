class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];

		for (int i = 0; i < 10; i++){
			Funcionario funcionario = new Funcionario();
			funcionario.salario = 1000.0 + i * 100;
			empresa.adiciona(funcionario);
		}

		empresa.mostraEmpregados();
		empresa.mostraInformacoes();
		empresa.contem();
	}
}