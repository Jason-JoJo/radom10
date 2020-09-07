package com.jason;

public class RandomNumB {

    public static void main(String[] args) {

        int toltalNum=49;   //總數
        int pickNum=6;      //取多少個

        int[] num = new int[toltalNum];
        for(int i=0;i <num.length;i++){
            num[i] = i+1;
        }

        int[] arr = new int[pickNum];
        for(int i=0;i <arr.length;i++) {

            int r =(int)(Math.random() * (toltalNum));
            arr[i]=num[r];
            num[r]=num[toltalNum-1];    //用最後面的數取代pick數，再將toltalNum-1 確保random出來不會有重複的 (A方法是 toltalNum-i 道理是一樣的  int r =(int)(Math.random() * (toltalNum-i)); )
//            System.out.println("n ="+(n)+" ; "+"index : "+(r)+", 放入num["+r+"] 的是:"+num[r]);
//            for(int j=0;j<num.length;j++){
//                System.out.print(num[j]+" ");
//            }
//            System.out.println();
            toltalNum--;
        }
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]+"   ");
        }

    }
}
