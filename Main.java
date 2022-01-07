public class Main{
    public static void main(String[] args) {
        //int to string   conversion to string
        int num = 5;
        String num1 = String.valueOf(num);
        String num2 = Integer.toString(num);
        String num3 = num + " ";
    
        // int to double
        int intNum = 151;
        double doubleNum = (double) intNum;

        //string to int    conversion from string
        String number = "10";
        // 1.type
        int number1 = Integer.valueOf(number);  
        // 2.type
        int number2 = Integer.parseInt(number);

        //string to double
        String doubleSayi = "12345.98123d";
        double sayi1 = Double.valueOf(doubleSayi);
        double sayi = Double.parseDouble(doubleSayi);
    }
}