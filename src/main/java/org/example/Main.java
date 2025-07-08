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

        System.out.print("등호 +,-,*,/를 입력해 주세요");
        String str3 = scanner.nextLine ();


        //수식

        int num1 = Integer.parseInt (str1);
        int num2 = Integer.parseInt (str2);

        //조건문 이용 수식받은걸 나눗샘인지 확인

        int result=0;
        boolean result2= "+".equals(str3);


        int sum = num1 + num2;
        System.out.println ();
        System.out.println ("값은" + sum);



    }
}