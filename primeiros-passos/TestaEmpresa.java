class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa(10);

		for (int i = 0; i < 10; i++){
			Funcionario funcionario = new Funcionario();
			funcionario.setSalario(1000.0 + i * 100);
			empresa.adiciona(funcionario);
		}
	}
}