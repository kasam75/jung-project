import java.util.Scanner;

public class Lv1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n\n\n\n 🧮계산기 입니다. \n 연산후 'exit' 를 누르시면 계산이 종료됩니다.\n     ");

            System.out.print("  1️⃣ 첫번째 숫자를 입력해 주세요!   ");
            String str1 = scanner.nextLine();

            System.out.print("  2️⃣ 두번째 숫자를 입력해주세요!    ");
            String str2 = scanner.nextLine();
            int num3= Integer.parseInt(str2);
                if (num3<=0){
                    System.out.println("    0️⃣최소값이 0보다 커야합니다.0️    ");
                        continue;}


            //이 프로 음수 못들어가게 설정하고 그걸 컨티뉴로 마무리
            // 정규 표현식+트라이 케치(가능하면 도전해보기)
            System.out.print("  \uD83D\uDD23 등호➕,➖,✖,➗를 입력해 주세요    ");
            String str3 = scanner.nextLine();

            //루프문내에 루프문
            //수식

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            //조건문 이용 수식받은걸 나눗샘인지 확인

            int result = 0;

            switch (str3) {
                case "+":
                    result = (num1 + num2);
                    break;
                case "-":
                    result = (num1 - num2);
                    break;
                case "*":
                    result = (num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("        ⏮ 0보다 값이 커야합니다.⏮");
                    }
                    result = (num1 / num2);
                    break;
                default:
                    System.out.println("        ❌등호를 입력해주세요❌");
                    //루프문 컨티뉴로
                    //문자열 비교로
                    continue;
            }


            //나눗샘은 상수가 아닐떄 처리가 필요함
            //반복문  완료
            //예쁘게 꾸미기
            //특정문자 받았을때 빠져나가게(?)(절반0입력했을때 오류 )
            //줄정렬 컨트롤 알트 엘
            System.out.println();
            System.out.println("  \uD83C\uDD97 " + num1 + " " + str3 + " " + num2 + " = " + result);

            System.out.println("         계산을 계속 하시겠습니까?\n\n       👍Please Enter Any Key👍\n                 or    \n         💣exit 입력시 종료💣");
            String next = scanner.nextLine();
            if (next.equals("exit")) {
                System.out.println("        💥계산을 종료 합니다.💥");
                break;
            }


        }
    }
}