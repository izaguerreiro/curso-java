class Empresa{
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;

	void adiciona(Funcionario funcionario){
		this.funcionarios[this.livre] = funcionario;
		this.livre++;
	}

	void mostraEmpregados(){
		for (int i = 0; i < this.funcionarios.length; i++){
			System.out.println("Funcionário na posição: " + i);
			System.out.println("R$" + this.funcionarios[i].salario);
		}
	}

	void mostraInformacoes() {
        for (int i = 0; i < this.livre; i++) {
            System.out.println("Funcionário na posição: " + i);
            this.funcionarios[i].mostra();
        }
    }

    boolean contem(Funcionario f){
		for (int i = 0; i < this.livre; i++){
			if (f == this.funcionarios[i]){
				return true;
			}
		}
		return false;
	}
}