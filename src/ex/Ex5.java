package ex;

import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.stream.Stream;

public class Ex5 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public int first(int[] a){
        int sum = 0;

        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }//end int i for

        return sum;
    }


    public void second(){
        int number;
        String strNumber;
        String[] strNumberArr;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 10000; i++){
            list.add(i);
        }

        try {
            for (int i = 1; i < 10000; i++){
                if (i < 10){
                    number = 2*i;
                    list.remove(Integer.valueOf(number));

                }else {
                    strNumber = String.valueOf(i);
                    strNumberArr = strNumber.split("");

                    number = Integer.parseInt(strNumber);
                    for (int j = 0; j < strNumberArr.length; j++){

                        number += Integer.parseInt(strNumberArr[j]);
                    }//end int j for

                    list.remove(Integer.valueOf(number));
                }
            }//end int i for

            for (int listNumber : list){
                bw.write(String.valueOf(listNumber));
                bw.newLine();
                bw.flush();
            }//end int listNumber for

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void third() {
        String input;
        int[] numberArr;
        int tolerance = 0;
        int count = 0;
        boolean arithmeticSequence = true;

        try {
            input = br.readLine();

            for (int i = 1; i <= Integer.parseInt(input); i++){
                numberArr = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();

                if(numberArr.length > 1){
                    tolerance = numberArr[1] - numberArr[0];
                }

                for (int j = 1; j < numberArr.length; j++){
                    if(tolerance != (numberArr[j] - numberArr[j-1])){
                        arithmeticSequence = false;
                        break;
                    }else {
                        arithmeticSequence = true;
                    }
                }//end int j for

                if (arithmeticSequence == true){
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
}
