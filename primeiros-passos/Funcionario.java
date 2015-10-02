class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private static int proximoFuncionario = 0;
    private int identificador;

	public Funcionario(){
		this.identificador = proximoFuncionario++;
	}

	public Funcionario(String nome){
		this.nome = nome;
		this.identificador = proximoFuncionario++;
	}

	public int getIdentificador() {
        return this.identificador;
    }

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getDepartamento(){
		return this.departamento;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	public double getSalario(){
		return this.salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public Data getdataEntrada(){
		return this.dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}

	public String getRg(){
		return this.rg;
	}

	public void setRg(String rg){
		this.rg = rg;
	}

	public void recebeAumento(double aumento){
		this.salario += aumento;
	}

	public double getGanhoAnual(){
		return this.salario * 12;
	}

	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data Entrada: " + this.dataEntrada.getDataFormatada());
	}
}