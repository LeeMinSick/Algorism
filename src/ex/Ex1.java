package ex;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1 {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public void first(){
        System.out.println("Hello World!");
        System.out.println();
    }

    public void second(){
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
        System.out.println();
    }

    public void third(){
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println("\\(__)|");
        System.out.println();

    }

    public void fourth(){
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
        System.out.println();
    }

    public void fifth(){

        System.out.println("두 숫자를 입력해주세요. 더하기");
        try {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
            bw.flush();

       }catch (IOException e){
            e.printStackTrace();
       }
    }

    public void sixth(){
        System.out.println("두 숫자를 입력해주세요. 빼기");
        try {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a-b));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void seventh(){
        System.out.println("두 숫자를 입력해주세요. 곱하기");
        try {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a*b));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void eighth(){
        System.out.println("두 숫자를 입력해주세요. 나누기");
        try {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf((double)a/b));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void ninth(){
        System.out.println("두 숫자를 입력해주세요. 사칙연산");
        try {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(a-b));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(a*b));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(a/b));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(a%b));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void tenth(){
        System.out.println("아이디를 입력해주세요.");
        try {
            String s = br.readLine();
            bw.write(s + "?!!");
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void eleventh(){
        System.out.println("연도를 입력해주세요.");
        try {
            int a = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(a-543));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void twelfth(){
        System.out.println("세 수를 입력해주세요.");
        try {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf((a+b)%c));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(((a%c) + (b%c))%c));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf((a*b)%c));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(((a%c)*(b%c))%c));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public void thirteenth(){
        String[] strArr = new String[2];
        int firstNumber; //처음 입력값
        int secondNumber;   //두번째 입력값
        int hundredDigits; //백의 자리
        int tensDigits;  //십의 자리
        int numberOfDigits; //일의 자리
        int total = 0; //합계

        System.out.println("세 자리 수 두개를 입력해주세요.");

        try {
        String s = br.readLine();
        strArr = s.split(" ");

        firstNumber = Integer.parseInt(strArr[0]);
        secondNumber = Integer.parseInt(strArr[1]);

        hundredDigits = secondNumber/100;
        tensDigits = (secondNumber%100)/10;
        numberOfDigits = (secondNumber%10);
        total = firstNumber*secondNumber;

            bw.write(String.valueOf(firstNumber*numberOfDigits));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(firstNumber*tensDigits));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(firstNumber*hundredDigits));
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(total));
            bw.newLine();
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fourteenth(){

        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println("\\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}
