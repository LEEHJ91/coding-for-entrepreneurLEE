/**
 * boolean
 *
 * byte
 * short
 * int
 * long
 * float
 * double
 *
 * char
 * string
 */
public class PrimitiveDataTypes {
    public void explainInteger() {
        int number1 = 3;
        int number2 = 4;
        number1 = 5;
        //number1=3.5 (인식안됨)
        System.out.println(number1);
    }
    public void explaindouble() {
        double number1 = 7.0;
        double number2 = 2.0;
        System.out.println(number1/number2);
    }
    public void castnumber(){
        double number1 = 3.5;
        int number2 = (int) number1;
        System.out.println(number2);
        //숫자끼리의 변환방법1
    }
    public void explainString(){
        String text1 = "hello";
        String text2 = "LEE";
        System.out.println(text1+text2);
    }
    public void parseData(){
        String numberText="1";
        int number = 2;
        System.out.println(numberText+number);
        //문자 + 숫자 = 문자
        System.out.println(Integer.valueOf(numberText)+number);
        //숫자와 문자와의 결합
        System.out.println(number + " " + "hello");
        //숫자 뒤에 ""결합하면 숫자가 문자화
    }
}
