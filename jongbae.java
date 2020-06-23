import java.io.IOException;

import java.io.InputStreamReader;

import java.io.BufferedReader;



public class jongbae {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(

                new InputStreamReader(System.in));





        int []month={31,28,31,30,31,30,31,31,30,31,30,31};

        int y,m,d,w,total;



        do{

            System.out.print("년도 ? ");

            y=Integer.parseInt(br.readLine());

        }while(y<1000);



        do{

            System.out.print("월 ? ");

            m=Integer.parseInt(br.readLine());

        }while(m<1 || m>12);



        if (y%4==0 && y%100!=0 || y%400==0)

            month[1]=29;

        else

            month[1]=28;



        do{

            System.out.print("일 ? ");

            d=Integer.parseInt(br.readLine());

        }while(d<1 || d>month[m-1]);



        total=(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;

        for(int i=0; i<m-1; i++)

            total+=month[i];

        total+=d;



        w=total%7;



        String []a={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"}; // char을 이용할 경우 홑따옴표에 한글자를 써서 만든다.



        System.out.printf("%d년 %d월 %d일은 %s입니다\n", y,m,d,a[w]);



/*

		String str="";

		switch(w) {

		case 0:str="일";break;

		case 1:str="월";break;

		case 2:str="화";break;

		case 3:str="수";break;

		case 4:str="목";break;

		case 5:str="금";break;

		case 6:str="토";break;

		}

		System.out.printf("%d년 %d월 %d일은 %s요일 입니다\n"

		         ,y, m, d, str);

*/



/*

		char []week ={'일','월','화', '수', '목', '금', '토'};

		System.out.printf("%d년 %d월 %d일은 %c 요일입니다\n"

		         ,y, m, d, week[w]);

*/



    }

}