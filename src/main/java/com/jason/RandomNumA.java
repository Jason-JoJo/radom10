/**
 *     參考
 *     https://4-x.tw/java-random/
 */


package com.jason;

import java.util.Arrays;


public class RandomNumA {
    static int startNum = 0;    //最小數
    static int endNum = 9;     //最大到多少
    static int pickNum = 10;     //取多少個
    static int toltalNum = (endNum-startNum)+1;  //總數

    public static void main(String[] args){

        int[] num = new int[toltalNum];
//        System.out.println(num.length);
        System.out.println("數字範圍是 : ");
        for(int i = 0; i < toltalNum; i++){
            num[i] = i + startNum;
            if(i<toltalNum-1) {
                System.out.print(num[i] + ",");
            }else if(i == (toltalNum - 1)){
                System.out.print(num[i]);
            }
        }

        int[] pickArrayList;

        pickArrayList = getRandom(num);

        System.out.println();
        System.out.println("------------");
        System.out.println("隨機不重複的數字 : ");
        for(int i = 0; i < pickArrayList.length; i++) {
            if(i==0){
                System.out.print("["+pickArrayList[i]+",");
            }else if(i==(pickArrayList.length-1)){
                System.out.print(pickArrayList[i] +"]");
            }else {
                System.out.print(pickArrayList[i]+",");
            }
        }
        Arrays.sort(pickArrayList);
        System.out.println();
        System.out.println("從小到大排列為 : ");
        for(int i = 0; i <  pickArrayList.length; i++) {
            if(i==0){
                System.out.print("["+pickArrayList[i]+",");
            }else if(i==(pickArrayList.length-1)){
                System.out.println(pickArrayList[i]+"]");
            }else{
                System.out.print(pickArrayList[i]+",");
            }

        }
    }

    public static int[] getRandom(int[] num){

        int[] arr = new int[pickNum];
        int randomNum;
        for(int i = 0; i <arr.length; i++) {

            randomNum = (int)(Math.random()*(toltalNum-i));     //每選到一個數就要減1，避免之後arr[]放入num[]後面重複的值  參考:https://ithelp.ithome.com.tw/questions/10187671
            arr[i] = num[randomNum];

            for(int j = randomNum; j < num.length - 1; j++){    //把原本的數字取代掉，後面的一起改變  ex: 抽到5  改變成 [0,1,2,3,4,6,7,8,9]，再來抽到2 變成[0,1,3,4,5,6,7,8,9,9]
                num[j] = num[j+1];
            }
            System.out.println();
            System.out.println("randomNum = "+randomNum);
            System.out.println("num[] : ");
            for(int j=0;j<num.length-1;j++){
                System.out.print(num[j]);
            }

        }
        return arr;
    }

}
