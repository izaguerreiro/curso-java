public class Empresa{
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int livre = 0;

	public Empresa(int quantidade){
		this.funcionarios = new Funcionario[quantidade];
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getCnpj(){
		return this.cnpj;
	}

	public Empresa(String cnpj){
        this.cnpj = cnpj;
        this.funcionarios = new Funcionario[10];
    }

	public Funcionario getFuncionario(int posicao){
        return this.funcionarios[posicao];
    }

	public void adiciona(Funcionario funcionario){
		this.funcionarios[this.livre] = funcionario;
		this.livre++;
	}

	public void mostraEmpregados(){
		for (int i = 0; i < this.funcionarios.length; i++){
			System.out.println("Funcionário na posição: " + i);
			System.out.println("R$" + this.funcionarios[i].getSalario());
		}
	}

	public void mostraInformacoes() {
        for (int i = 0; i < this.livre; i++) {
            System.out.println("Funcionário na posição: " + i);
            this.funcionarios[i].mostra();
        }
    }

    public boolean contem(Funcionario f){
		for (int i = 0; i < this.livre; i++){
			if (f == this.funcionarios[i]){
				return true;
			}
		}
		return false;
	}
}