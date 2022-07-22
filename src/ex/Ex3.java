package ex;

import java.io.*;

public class Ex3 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public void first(){
        int number;
        int answer;

        System.out.println("구구단 N단을 입력해주세요.");


        try {

            number = Integer.parseInt(br.readLine());

         for(int i = 1; i <= 9; i++){
             answer = number*i;
             bw.write(number + " * " + i + " = " + answer);
             bw.newLine();
             bw.flush();
         }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void second(){
        int testCase;
        int firstNumber;
        int secondNumber;
        String[] str = new String[2];

        System.out.println("테스트 케이스 값을 입력해주세요.");

        try {
            testCase = Integer.parseInt(br.readLine());

            for(int i = 0; i < testCase; i++){
                System.out.println("A와 B를 입력해주세요.");
                str = br.readLine().split(" ");

                firstNumber = Integer.parseInt(str[0]);
                secondNumber = Integer.parseInt(str[1]);

                bw.write(String.valueOf(firstNumber + secondNumber));
                bw.newLine();
                bw.flush();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void third(){
        int number;
        int answer = 0;

        System.out.println("팩토리얼 N을 입력해주세요.");

        try {
            number = Integer.parseInt(br.readLine());

            for(int i = 1; i <= number; i++){
                answer += i;
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fourth(){
        int testCase;
        int firstNumber;
        int secondNumber;
        String[] str = new String[2];

        System.out.println("테스트 케이스를 입력해주세요.");

        try {
            testCase = Integer.parseInt(br.readLine());

            for(int i = 0; i < testCase; i++){
                System.out.println("A와 B를 입력해주세요.");
                str = br.readLine().split(" ");

                firstNumber = Integer.parseInt(str[0]);
                secondNumber = Integer.parseInt(str[1]);

                bw.write(String.valueOf(firstNumber + secondNumber));
                bw.newLine();
            }

            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fifth(){
        int number;

        try {

            System.out.println("N을 입력해주세요.");
            number = Integer.parseInt(br.readLine());

            for (int i = 1; i <= number; i++){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void sixth(){
        int number;

        try {

            System.out.println("N을 입력해주세요.");
            number = Integer.parseInt(br.readLine());

            for (int i = number; i >= 1; i--){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void seventh(){
        int testCase;
        int firstNumber;
        int secondNumber;
        String[] str = new String[2];

        System.out.println("테스트 케이스를 입력해주세요.");

        try {
            testCase = Integer.parseInt(br.readLine());

            for (int i = 1; i <= testCase; i++){
                System.out.println("A와 B를 입력해주세요.");
                str = br.readLine().split(" ");

                firstNumber = Integer.parseInt(str[0]);
                secondNumber = Integer.parseInt(str[1]);

                bw.write("Case #" + i + ": " + (firstNumber + secondNumber));
                bw.newLine();
            }
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void eighth(){
        int testCase;
        int firstNumber;
        int secondNumber;
        String[] str = new String[2];

        System.out.println("테스트 케이스를 입력해주세요.");

        try {
            testCase = Integer.parseInt(br.readLine());

            for (int i = 1; i <= testCase; i++){
                System.out.println("A와 B를 입력해주세요.");
                str = br.readLine().split(" ");

                firstNumber = Integer.parseInt(str[0]);
                secondNumber = Integer.parseInt(str[1]);

                bw.write("Case #" + i + ": " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                bw.newLine();
            }
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void nineth(){
        int testCase;

        System.out.println("N을 입력해주세요.");

        try {

            testCase = Integer.parseInt(br.readLine());

            for (int i = 1; i <= testCase; i++){
                for(int j = 0; j < i; j++){
                    bw.write("*");
                }
                bw.newLine();
            }

            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void tenth(){
        int testCase;

            System.out.println("N을 입력해주세요.");

            try {

                testCase = Integer.parseInt(br.readLine());

            for (int i = 1; i <= testCase; i++){
                for(int j = testCase; j >= 1; j--){
                    if(j > i){
                        bw.write(" ");
                    }else {
                        bw.write("*");
                    }
                }
                bw.newLine();
            }
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void eleventh(){
        int n;
        int x;
        String[] str;

        try {
            System.out.println("수열의 정수 N개를 입력해주세요.");
            n = Integer.parseInt(br.readLine());
            System.out.println("정수 x의 값을 입력해주세요.");
            x = Integer.parseInt(br.readLine());

            str = new String[n];

            System.out.println("수열의 정수 입력");
            str = br.readLine().split(" ");

            for(int i = 0; i < str.length; i++){
                if(Integer.parseInt(str[i]) < x){
                    bw.write(str[i] + " ");
                }
            }

            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void twelfth(){
        int firstNumber;
        int secondNumber;
        String[] str = new String[2];

        try {

            while (true){
                str = br.readLine().split(" ");

                firstNumber = Integer.parseInt(str[0]);
                secondNumber = Integer.parseInt(str[1]);

                if(firstNumber == 0 && secondNumber == 0){
                    bw.flush();
                    break;
                }

                bw.write(String.valueOf(firstNumber + secondNumber));
                bw.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void thirteenth(){
        int firstNumber;
        int secondNumber;
        String s;
        String[] str = new String[2];

        try {

            while (true){
                s = br.readLine();

                if(s == null || s.equals("")){
                    bw.flush();
                     break;
                }

                str = s.split(" ");
                firstNumber = Integer.parseInt(str[0]);
                secondNumber = Integer.parseInt(str[1]);

                bw.write(String.valueOf(firstNumber + secondNumber));
                bw.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fourteenth(){
        String oldNumber;
        String currentNumber;
        int firstNumber;
        int secondNumber;
        int answer = 0;
        String[] str = new String[2];

        try {
            System.out.println("수를 입력해주세요.");
            oldNumber = br.readLine();

            if(Integer.parseInt(oldNumber) < 10){
                oldNumber = "0" + oldNumber;
            }
            currentNumber = oldNumber;

            while (true){
                str = currentNumber.split("");
                firstNumber = Integer.parseInt(str[0]);
                secondNumber = Integer.parseInt(str[1]);

                if(firstNumber + secondNumber >= 10){
                    str = String.valueOf(firstNumber + secondNumber).split("");
                    currentNumber = String.valueOf(secondNumber) + str[1];

                }else {
                    currentNumber = String.valueOf(secondNumber) + String.valueOf(firstNumber + secondNumber);
                }

                answer++;

                if(currentNumber.equals(oldNumber)){
                    bw.write(String.valueOf(answer));
                    bw.flush();
                    break;
                }

            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
