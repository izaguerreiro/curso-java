public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
            
        if (!isDataViavel(dia, mes, ano)) {
            System.out.println("A data " + getDataFormatada() + " não existe!");
        }
    }
        
    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }
            
        int ultimoDiaDoMes = 31;
                
       if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }
            
        if (dia > ultimoDiaDoMes) {
            return false;
        }
        return true;
    }
    
    public String getDataFormatada(){
    	return this.dia +"/"+ this.mes +"/"+ this.ano;
    }
}