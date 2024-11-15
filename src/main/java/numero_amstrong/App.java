package numero_amstrong;

 class App {
    public static boolean esNumeroArmstrong(int numero) {
        String numeroStr = Integer.toString(numero);
        int cantidadDigitos = numeroStr.length();
        int suma = 0;

        for (char digito : numeroStr.toCharArray()) {
            int digitoInt = Character.getNumericValue(digito);
            suma += Math.pow(digitoInt, cantidadDigitos);
        }
        return suma == numero;
    }
}
