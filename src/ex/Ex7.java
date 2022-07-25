package ex;

import java.io.*;

public class Ex7 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public void first(){
        String[] strArr = new String[3];
        int fixedCost;
        int variableCost;
        int salesRevenue;
        int profitPerSale;
        int operatingProfit = 0;
        int answer = 0;

        try {
            strArr = br.readLine().trim().split(" ");

            fixedCost = Integer.parseInt(strArr[0]);
            variableCost = Integer.parseInt(strArr[1]);
            salesRevenue = Integer.parseInt(strArr[2]);

            if(salesRevenue > variableCost){
                profitPerSale = salesRevenue - variableCost;

                for (int i = 1; operatingProfit <= fixedCost; i++){
                    operatingProfit = profitPerSale*i;
                    answer = i;

                }//end int i for
            }

            bw.write(String.valueOf(answer > 0 ? answer : -1));
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void second(){
        int input;
        int number = 1;
        int answer = 1;

        try {
            input = Integer.parseInt(br.readLine().trim());

            if(input > 1){
                for (int i = 1; number < input; i++){
                    number += (6*i);
                    answer = i + 1;
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void third(){
        int input;
        int totalUpToRow = 0;
        int rowNumber = 0;
        int gap = 0;//입력값과 rowNumber까지 수의 차이

        try {
            input = Integer.parseInt(br.readLine().trim());

            for(int i = 1; totalUpToRow < input; i++){
                gap = input - totalUpToRow;
                totalUpToRow += i;
                rowNumber = i;
            }//end int i for

            if (rowNumber%2 > 0){
                bw.write((rowNumber-gap+1) + "/" + gap);
            }else {
                bw.write(gap + "/" + (rowNumber-gap+1));
            }

            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void fourth(){
        String[] strArr = new String[3];
        int days;
        double height;
        double climb;
        double slide;

        try {
            strArr = br.readLine().split(" ");
            climb = Integer.parseInt(strArr[0]);
            slide = Integer.parseInt(strArr[1]);
            height = Integer.parseInt(strArr[2]);

            days = (int) Math.ceil((height - slide) / (climb - slide));

            bw.write(String.valueOf(days));
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void fifth(){
        String[] strArr = new String[3];
        int testCase;
        int roomNumber;
        int floorNumber;
        double floor;
        double guest;

        try {
            testCase = Integer.parseInt(br.readLine().trim());

            for (int i = 0; i < testCase; i++){
                strArr = br.readLine().split(" ");

                floor = Integer.parseInt(strArr[0]);
                guest = Integer.parseInt(strArr[2]);

                floorNumber = (int) (guest%floor);
                roomNumber = (int) Math.ceil(guest/floor);

                if((int) guest%floor == 0){
                    floorNumber = (int) floor;
                }

                if(roomNumber < 10){
                    bw.write(floorNumber + "0" + roomNumber);
                }else {
                    bw.write(String.valueOf(floorNumber) + roomNumber);
                }

                bw.newLine();
            }//end int i for

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void sixth(){
        int testCase;
        int floor;
        int room;
        int[] personInTheRoom;

        try {
            testCase = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCase; i++){
                floor = Integer.parseInt(br.readLine());
                room = Integer.parseInt(br.readLine());
                personInTheRoom = new int[room];

                for (int j = 0; j <= floor; j++){
                    for (int l = 0; l < room; l++){
                        if(j == 0){
                            if (l == 0){
                                personInTheRoom[l] = 1;
                            }else {
                                personInTheRoom[l] = l+1;
                            }
                        }else {
                            if(l > 0){
                                personInTheRoom[l] = personInTheRoom[l] + personInTheRoom[l-1];
                            }
                        }
                    }//end int l for
                }//end int j for

                bw.write(String.valueOf(personInTheRoom[room-1]));
                bw.newLine();
            }//end int i for

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void seventh(){
        int input;
        int three = 0;
        int five = 0;
        boolean isTrue = false;

        try {
            input = Integer.parseInt(br.readLine());

            if(input%5 == 0){
                five = input/5;
                bw.write(String.valueOf(five));
            }else {
                Loop1 :
                for (int i = (input/5); i >= 0; i--){
                    for (int j = 0; j <= (input/3); j++){
                        if(((i*5) + (j*3)) == input){
                            three = j;
                            five = i;
                            isTrue = true;
                            bw.write(String.valueOf(three+five));
                            break Loop1;
                        }
                    }//end int j for
                }//end int i for

                if(!isTrue){
                    bw.write(String.valueOf(-1));
                }
            }

            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void eighth(){
        String[] input;
        int maxLength;
        int number;
        int[] first;
        int[] second;

        try {
            input = br.readLine().trim().split(" ");
            maxLength = Math.max(input[0].length(), input[1].length());
            first = new int[maxLength + 1];
            second = new int[maxLength + 1];

            for(int i = input[0].length() - 1, idx = 0; i >= 0; i--, idx++){
                first[idx] = Character.getNumericValue(input[0].charAt(i));
            }//end int i, idx for

            for(int i = input[1].length() -1 , idx = 0; i >= 0; i--, idx++){
                second[idx] = Character.getNumericValue(input[1].charAt(i));
            }//end int i, idx for

            for (int i = 0; i < maxLength; i++){
                number = first[i] + second[i];
                first[i] = number%10;
                first[i+1] = first[i+1] + (number/10);
            }//end int i for

            if(first[maxLength] != 0) {
                bw.write(String.valueOf(first[maxLength]));
            }
            for(int i = maxLength - 1; i >= 0; i--) {
                bw.write(String.valueOf(first[i]));
            }//end int i for

            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
