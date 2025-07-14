public class Calculate {
   public double result;


    public void calculate(double str1, double str2, char str3) {


        switch (str3) {
            case '+':
                result += str1 + str2;
                break;
            case '-':
                result -= str1 - str2;
                break;
            case '*':
                result *= str1 * str2;
                break;
            case '/':
                if (str2 == 0) {
                    System.out.println("        ⏮ 0보다 값이 커야합니다.⏮");
                    result /= str1 / str2;
                }
                break;
            default:
                System.out.println("        ❌등호를 입력해주세요❌");


        }
    }


}
