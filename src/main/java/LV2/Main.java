import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("🧮계산기 입니다.연산후 'exit' 를 누르시면 계산이 종료됩니다.  ");

            System.out.print("1️⃣ 첫번째 숫자를 입력해 주세요!      :");
            double str1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("\uD83D\uDD23 등호➕,➖,✖,➗를 입력해 주세요  :");
            char str3 = scanner.nextLine().charAt(0);

            System.out.print("2️⃣두번째 숫자를 입력해주세요!        :");
            double str2 = scanner.nextDouble();
            scanner.nextLine();

//호출 기억하기 str1등 변수명이 색이 들어와도 클래스쪽 인스턴스 변수를 호출한 것이 아님
            calculate.calculate(str1,str2,str3);


            System.out.println();

            //asdsadasdasds
            //asdasdaasdasd

            System.out.println ("  \uD83C\uDD97 " + str1 + " " + str3 + " " + str2 + " = " +calculate.result);

            System.out.println("         계산을 계속 하시겠습니까?\n\n       👍Please Enter Any Key👍\n                 or    \n         💣exit 입력시 종료💣");
            String next = scanner.nextLine();
            if (next.equals("exit")) {
                System.out.println("        💥계산을 종료 합니다.💥");
                break;
            }
        }
    }
}

