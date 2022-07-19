package ex;

import java.io.*;

public class Ex2 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public void first(){
        String[] str = new String[2];
        int firstNumber;
        int secondNumber;

        System.out.println("두 수를 입력해주세요.");

        try {
           String s = br.readLine();
           str = s.split(" ");

           firstNumber = Integer.parseInt(str[0]);
           secondNumber = Integer.parseInt(str[1]);

           if(firstNumber > secondNumber){
               bw.write(">");
           }else if(firstNumber < secondNumber){
               bw.write("<");
           }else if(firstNumber == secondNumber){
               bw.write("==");
           }

           bw.flush();
           bw.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void second(){
        int number;

        System.out.println("시험 점수를 입력해주세요.");

        try {
            number = Integer.parseInt(br.readLine());

            if (number >= 90){
                bw.write("A");
            } else if (number >= 80) {
                bw.write("B");
            } else if (number >= 70) {
                bw.write("C");
            } else if (number >= 60) {
                bw.write("D");
            } else if (number < 60) {
                bw.write("F");
            }

            bw.flush();
            bw.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void third(){
        System.out.println("연도를 입력해주세요.");
        int number;

        try {
            number = Integer.parseInt(br.readLine());

            if((number%4 == 0) && ((number%400 == 0) || !(number%100 == 0))){
                System.out.println("1");
            }else {
                System.out.println("0");
            }

        }catch (IOException e){
           e.printStackTrace();
        }

    }

    public void fourth(){
        System.out.println("x좌표와 y좌표를 입력해주세요.");
        int firstNumber;
        int secondNumber;
        String[] str = new String[2];

        try {
            String s = br.readLine();

            str = s.split(" ");

            firstNumber = Integer.parseInt(str[0]);
            secondNumber = Integer.parseInt(str[1]);

            if(firstNumber > 0){
                if(secondNumber > 0){
                    bw.write("1");
                } else if (secondNumber < 0) {
                    bw.write("4");
                }

            } else if (firstNumber < 0) {
                if (secondNumber > 0){
                    bw.write("2");
                } else if (secondNumber < 0) {
                    bw.write("3");
                }

            }

            if (firstNumber == 0 || secondNumber == 0){
                System.out.println("사분면에 없습니다.");
            }

            bw.flush();
            bw.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void fifth(){
        System.out.println("시각을 입력해주세요.");
        String[] str = new String[2];
        int firstNumber;
        int secondNumber;
        int hour;
        int minute;

        try {
            String s = br.readLine();
            str = s.split(" ");

            firstNumber = Integer.parseInt(str[0]);
            secondNumber = Integer.parseInt(str[1]);

            if(secondNumber < 45){
                hour = firstNumber - 1;
                minute = secondNumber + 15;

                if(hour < 0){
                    hour = 23;
                }

            }else {
                hour = firstNumber;
                minute = secondNumber - 45;
            }

            bw.write(hour + " " + minute);
            bw.flush();
            bw.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void sixth(){

    }

}
