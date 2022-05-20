package com.demo;

import java.util.Scanner;

//除法散列表
public class HashTable {

    Scanner s=new Scanner(System.in);
    int size;
    int[] array;
    IntD_LinkedList[] idLL;
    public HashTable()
    {
        System.out.println("请输入除法散列表的除数：");
        size=s.nextInt();
        idLL=new IntD_LinkedList[size];
        for (int i=0;i<size;i++)
        {
            idLL[i]=new IntD_LinkedList();
        }

        System.out.println("请输入排序数的个数：");
        int i=s.nextInt();
        array=new int[i];

        System.out.println("请输入要排序的数(空格分割):");
        for (int j=0;j<i;j++)
        {
            array[j]=s.nextInt();
        }
        insert();
        print();

        //System.out.println(find(10));     查找测试
        //System.out.println(find(100));
        //find_del(20);                     删除测试
        //find_del(44);
        //System.out.println(find(10));
        //print();

    }

    public void insert()
    {
        for (int j : array) {
            IntD_LinkedList iD = new IntD_LinkedList(j);
            int to = iD.num % size;
            idLL[to].sortInsert(iD);
        }
    }
    public void print()
    {
        for (int j=0;j<size;j++)
        {
            System.out.print(j +"->");
            idLL[j].print();
        }
    }
    public boolean find(int num)
    {
        int in=num%size;
        return idLL[in].find(num);
    }
    public void find_del(int num)
    {
        int in=num%size;
        idLL[in].find_del(num);
    }

}


