class Fatorial {
    public static void main(String[] args) {
    	long fatorial = 1;

        for(int i = 1; i <= 30; i++){
			fatorial = fatorial * i;

			System.out.println("fat("+i+") = " + fatorial);
        }
    }
}