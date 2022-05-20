package com.demo;

public class IntD_LinkedList {

    int num=0;
    IntD_LinkedList next=null,top=null;

    public IntD_LinkedList(int num)
    {
        this.num=num;
    }
    public IntD_LinkedList() {}
    public void sortInsert(IntD_LinkedList iLL)         //升序排序
    {
        if (this.next==null)insert(iLL);
        else
        {
            if (this.next.num<= iLL.num)this.next.sortInsert(iLL);
            else insert(iLL);
        }
    }

    public void insert(IntD_LinkedList iLL)
    {
        this.next=iLL;
        iLL.top=this;
    }
    public void insert(int num)
    {
        this.num=num;
    }

    private void delete()
    {
        top.next=this.next;
        if (this.next!=null) this.next.top=top;

        this.top=this.next=null;
    }

    public void print()
    {
        for (IntD_LinkedList i = this.next; i!=null; i=i.next)
            System.out.print(Integer.toString(i.num)+',');
        System.out.println();

    }

    public boolean find(int num)
    {
        for (IntD_LinkedList i=this.next;i!=null;i=i.next)
        {
            if (i.num==num)return true;
        }
        return false;
    }
    public void find_del(int num)
    {
        for (IntD_LinkedList i=this.next;i!=null;i=i.next)
        {
            if (i.num==num)i.delete();
        }
    }
}
