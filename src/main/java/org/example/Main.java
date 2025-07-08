package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("🧮계산기 인삿말 입니다. \n 연산후'exit'를 누르시면 계산이 종료됩니다. = scanner");

        System.out.print("첫번째 숫자를 입력해 주세요!");
        String str1=scanner.nextLine();

        System.out.print("두번째 숫자를 입력해주세요!");
        String str2=scanner.nextLine();
        // 정규 표현식+트라이 케치(가능하면 도전해보기)
        System.out.print("등호 +,-,*,/를 입력해 주세요");
        String str3 = scanner.nextLine ();

        //루프문내에 루프문
        //수식

        int num1 = Integer.parseInt (str1);
        int num2 = Integer.parseInt (str2);

        //조건문 이용 수식받은걸 나눗샘인지 확인

        int result=0;

        switch (str3) {
            case "+":
                result=(num1+num2);
                break;
            case "-":
                result=(num1-num2);
               break;
            case "*":
                result=(num1*num2);
                break;
            case "/":
                result=(num1/num2);
                break;
            default:
                System.out.println("등호를 입력해주세요");
                //루프문 컨티뉴로
                //문자열 비교로
                return;
        }




        //나눗샘은 상수가 아닐떄 처리가 필요함
        //반복문
        //예쁘게 꾸미기
        //특정문자 받았을때 빠져나가게(?)

        System.out.println ();
        System.out.println ("값은" + result);



    }
}