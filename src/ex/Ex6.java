package ex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public void first(){
        try {
            bw.write(String.valueOf(br.read()));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void second(){
        String input;
        int testCase;
        int answer = 0;

        try {
            testCase = Integer.parseInt(br.readLine());
            input = br.readLine();

            for (int i = 0; i < input.length(); i++){
                answer += Character.getNumericValue(input.charAt(i));
            }//end int i for

            bw.write(String.valueOf(answer));
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void third(){
        String input;
        String[] alphabet = new String[26];
        String[] answer = new String[26];

        for (int i = 0; i < alphabet.length; i++){
            alphabet[i] = String.valueOf((char)(97+i));
            answer[i] = String.valueOf(-1);
        }//end int i for

        try {
            input = br.readLine();

            for (int i = 0; i < input.length(); i++){
                for (int j = 0; j < alphabet.length; j++){
                    if(String.valueOf(input.charAt(i)).equals(alphabet[j])){

                        if(Integer.parseInt(answer[j]) != -1) continue;

                        answer[j] = String.valueOf(i);
                    }
                }//end int j for
            }//end int i for

            bw.write(String.join(" ", answer));
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public void fourth(){
            String[] characters;
            String[] strArr;
            int testCase;
            int numberOfRepetitions;
            int characterCnt;

            try {
                testCase = Integer.parseInt(br.readLine());

                for (int i = 0; i < testCase; i++){
                    characterCnt = 0;
                    strArr = br.readLine().split(" ");

                    numberOfRepetitions = Integer.parseInt(strArr[0]);
                    characters = strArr[1].split("");
                    String[] answer = new String[numberOfRepetitions*characters.length];

                    for (int j = 0; j < answer.length/numberOfRepetitions; j++){

                        for (int q = 0; q < numberOfRepetitions; q++){
                            answer[(numberOfRepetitions*j)+q] = characters[characterCnt];

                            if(q == numberOfRepetitions -1){
                                characterCnt++;
                            }
                        }//end int q for
                    }//end int j for

                    bw.write(String.join("", answer));
                    bw.newLine();

                }//end int i for

                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void fifth(){
            String input;
            String maxStr = "";
            String[] strArr;
            int max = 0;
            int[] numberOfAlphabets = new int[26];
            boolean isSame = false;

            try {
                input = br.readLine().toUpperCase();
                strArr = input.split("");

                for (int i = 0; i < strArr.length; i++){
                    int idx = input.charAt(i) - 'A';
                    numberOfAlphabets[idx]++;
                }

                for (int i = 0; i < numberOfAlphabets.length; i++){

                    if(max < numberOfAlphabets[i]){
                        max = numberOfAlphabets[i];
                        maxStr = Character.toString(i + 'A');
                        isSame = false;
                    } else if (max != 0 && numberOfAlphabets[i] == max) {
                        isSame = true;
                    }
                }

                if(isSame){
                    bw.write("?");
                    bw.newLine();
                }else {
                    bw.write(maxStr);
                    bw.newLine();
                }

                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void sixth(){
            String str;
            String[] strArr;

            try {
                str = br.readLine().trim();
                strArr = str.split(" ");

                if (str.equals("")){
                    bw.write("0");
                    bw.newLine();
                    bw.flush();
                }else {
                    bw.write(String.valueOf(strArr.length));
                    bw.newLine();
                    bw.flush();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void seventh(){
            String str;
            String firstNumber = "";
            String secondNumber = "";
            String[] strArr;

            try {
                str = br.readLine();

                strArr = str.trim().split(" ");

                for (int i = 0; i < strArr.length; i++){
                    for(int j = 0; j < strArr[i].length(); j++){
                        if(i == 0){
                            firstNumber += String.valueOf(strArr[i].charAt((strArr[i].length()-1)-j));
                        }else {
                            secondNumber += String.valueOf(strArr[i].charAt((strArr[i].length()-1)-j));
                        }
                    }
                }

                bw.write(Integer.parseInt(firstNumber)
                        > Integer.parseInt(secondNumber) ? firstNumber : secondNumber);
                bw.newLine();
                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void eighth(){
            String input;
            String[] dial = new String[]{"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
            int answer = 0;

            try {
                input = br.readLine().trim().toUpperCase();

                for (int i = 0; i < input.length(); i++){
                    for (int j = 0; j < dial.length; j++){
                        for (int q = 0; q < dial[j].length(); q++){
                            if(input.charAt(i) == dial[j].charAt(q)){
                                answer += j + 3;
                            }
                        }//end int q for
                    }//end int j for
                }//end int i for

                bw.write(String.valueOf(answer));
                bw.newLine();
                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        public void nineth(){
            String input;
            String[] alphabets = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            try {
                input = br.readLine();

                for (int i = 0; i < alphabets.length; i++){
                    input = input.replace(alphabets[i], "a");
                }

                bw.write(String.valueOf(input.length()));
                bw.newLine();
                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void tenth(){
            String input;
            String currentChar = "";
            String oldChar = "";
            List<String> list;
            int testCase;
            int count = 0;
            int answer = 0;
            boolean isCase = false;

            try {
                testCase = Integer.parseInt(br.readLine());

                for (int i = 0; i < testCase; i++){
                    list = new ArrayList<String>();
                    input = br.readLine();

                    for (int j = 0; j < input.length(); j++){
                        currentChar = String.valueOf(input.charAt(j));

                        if(!(input.charAt(j) >= 97) || !(input.charAt(j) <= 122)) break;

                                if(!list.contains(currentChar)){
                                    list.add(currentChar);
                                    oldChar = currentChar;
                                    count = 1;

                                } else if (list.contains(currentChar) && oldChar.equals(currentChar)) {
                                    count++;
                                } else if (list.contains(currentChar) && !oldChar.equals(currentChar)) {
                                    break;
                                }

                        if(j == input.length() -1 ) answer++;

                    }//end int j for

                }//end int i for

                bw.write(String.valueOf(answer));
                bw.newLine();
                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
