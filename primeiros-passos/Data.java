class Data{
	int dia;
	int mes;
	int ano;

	void preencheData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String getDataFormatada(){
    	return this.dia +"/"+ this.mes +"/"+ this.ano;
    }
}