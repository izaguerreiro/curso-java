class TestaFuncionario{
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Paulo");
		funcionario.setSalario(100.0);
		funcionario.recebeAumento(200);

		Data data = new Data();
		data.preencheData(1,10,2015);
		funcionario.setDataEntrada(data);

		System.out.println("Salario atual: " + funcionario.getSalario());
        System.out.println("Ganho anual: " + funcionario.getGanhoAnual());

        funcionario.mostra();
	}
}
