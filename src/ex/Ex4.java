package ex;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public void first(){
        String[] str;
        int numberOfIntegers;
        int min;
        int max;
        int number;

        try {
            numberOfIntegers = Integer.parseInt(br.readLine());
            str = new String[numberOfIntegers];
            str = br.readLine().split(" ");

            min = Integer.parseInt(str[0]);
            max = Integer.parseInt(str[0]);


            for (int i = 0; i < str.length; i++){
                number = Integer.parseInt(str[i]);

                if(min > number) {
                    min = number;
                } else if (max < number) {
                    max = number;
                }
            }//end int i for

            bw.write(min + " " + max);
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void second(){
        String input;
        List<String> list = new ArrayList<String>();
        int max;
        int location = 1;

        try {

            while ((input = br.readLine()) != null && !input.equals("")){
                list.add(input);
            }//end while

            max = Integer.parseInt(list.get(0));

            for(int i = 1; i < list.size(); i++){
                if (max < Integer.parseInt(list.get(i))){
                    max = Integer.parseInt(list.get(i));
                    location = i + 1;
                }
            }//end int i for

            bw.write(String.valueOf(max) + "\n");
            bw.write(String.valueOf(location));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void third(){
        String result;
        String[] str;
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int outputNumber;

        try {
            firstNumber = Integer.parseInt(br.readLine());
            secondNumber = Integer.parseInt(br.readLine());
            thirdNumber = Integer.parseInt(br.readLine());

            result = String.valueOf(firstNumber*secondNumber*thirdNumber);

            str = result.split("");
            for(int i = 0; i <= 9; i++){
                outputNumber = 0;

                for(int j = 0; j < str.length; j++){
                    if(Integer.parseInt(str[j]) == i){
                        outputNumber++;
                    }
                }//end int j for

                bw.write(String.valueOf(outputNumber));
                bw.newLine();
                bw.flush();

            }//end int i for

        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public void fourth(){
        int count = 0;
        Integer[] arr = new Integer[10];

        try {
           for (int i = 0; i < arr.length; i++){
               arr[i] = Integer.parseInt(br.readLine())%42;
           }//end for

           for (int i = 0; i < arr.length; i++){
               if (arr[i] == -1) continue;

               for (int j = 0; j < arr.length; j++){
                   if(i > j) continue;

                   if(i != j && arr[i] == arr[j]){
                       arr[j] = -1;
                   }

               }//end int j for

           }//end int i for

            for (int i = 0; i < arr.length; i++){
                if(arr[i] != -1){
                    count++;
                }
            }//end int i for

            bw.write(String.valueOf(count));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void fifth(){
        int[] subjects;
        int testCase;
        int max = 0;
        double avr = 0;

        try {
            testCase = Integer.parseInt(br.readLine());
            subjects = new int[testCase];

            subjects = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < subjects.length; i++){
                if(max < subjects[i]){
                    max = subjects[i];
                }
            }//end int i for

            for(int i = 0; i < subjects.length; i++){
                avr += subjects[i]/(double)max*100;
            }//end int i for

            avr = avr/testCase;

            bw.write(String.valueOf(avr));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void sixth(){
        String[] strArr;
        String[] oxQuiz;
        int score = 0;
        int total = 0;
        int testCase;

        try {

            testCase = Integer.parseInt(br.readLine());
            strArr = new String[testCase];

            for (int i = 0; i < strArr.length; i++){
                strArr[i] = br.readLine().toLowerCase();
            }//end int i for

            for (int i = 0; i < strArr.length; i++){
                score = 0;
                total = 0;

                oxQuiz = strArr[i].split("");

                for (int j = 0; j < oxQuiz.length; j++){
                    if(oxQuiz[j].equals("o")){
                        score++;
                        total += score;
                    }else {
                        score = 0;
                    }
                }//end int j for

                bw.write(String.valueOf(total));
                bw.newLine();
                bw.flush();

            }//end int i for

        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public void seventh(){
        String[] input;
        int testCase;
        int sum;
        int student;
        int aboveAverageStudent;
        double avr;
        double answer;

        try {
            testCase = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCase; i++){
                sum = 0;
                aboveAverageStudent = 0;
                input = br.readLine().split(" ");
                student = Integer.parseInt(input[0]);

                for (int j = 1; j < input.length; j++){
                    sum += Integer.parseInt(input[j]);
                }//end int j for

                avr = sum/(double)student;

                for (int j = 1 ; j < input.length; j++){
                    if(avr < Integer.parseInt(input[j])){
                        aboveAverageStudent++;
                    }
                }//end int j for

                answer = (aboveAverageStudent/(double)student)*100;

                bw.write(String.format("%.3f%%", answer));
                bw.newLine();

            }//end int i for

            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
