class Data{
	private int dia;
	private int mes;
	private int ano;

	public void preencheData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDataFormatada(){
    	return this.dia +"/"+ this.mes +"/"+ this.ano;
    }
}