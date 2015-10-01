class TestaFuncionario{
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Paulo");
		funcionario.setSalario(100.0);
		funcionario.recebeAumento(200);

		funcionario.dataEntrada = new Data();
		funcionario.dataEntrada.preencheData(29,9,2015);
		funcionario.setDataEntrada(new Data(29, 9, 2015));

		System.out.println("Salario atual: " + funcionario.getSalario());
        System.out.println("Ganho anual: " + funcionario.getGanhoAnual());

        funcionario.mostra();
	}
}
